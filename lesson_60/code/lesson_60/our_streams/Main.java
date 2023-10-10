package lesson_60.our_streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Hello", "Java"};

        Arrays.stream(strings)
                .map(str -> str.split(""))
                .map(Arrays::stream)
                .forEach(System.out::println);

        Arrays.stream(strings)
                .map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        Stream.of("one", "two", "three", "one", "two")
                .distinct()
                .forEach(System.out::println);

        System.out.println();
        List<String> arr = Arrays.asList("one", "two", "three", "four", "five");
        arr.stream()
                .skip(1)
                .limit(3)
                .forEach(System.out::println);

        System.out.println(arr.stream()
                .filter(s -> s.length() > 3)
                .count());

        Optional<String> first = arr.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = arr.stream().findAny();
        System.out.println(any.get());

        System.out.println();
        List<String> names = Arrays.asList("Jack", "John", "Ann", "Benjamin");
        boolean allElements = names.stream().allMatch(s -> s.length() > 2);
        System.out.println(allElements);

        boolean anyElement = names.stream().anyMatch(s -> s.length() > 6);
        System.out.println(anyElement);

        boolean noneElement = names.stream().noneMatch(s -> s.equals("Kate"));
        System.out.println(noneElement);

        List<Integer> ints = Arrays.asList(1, 2, 34, 5, 60, 21);
        Optional<Integer> minElt = ints.stream().min(Integer::compare);
        System.out.println(minElt.get());

        Optional<Integer> maxElt = ints.stream().max(Integer::compare);
        System.out.println(maxElt.get());

        Optional<Integer> result = Stream.of(1, 2, 3, 4, 5).reduce((a, b) -> a * b);
        System.out.println(result.get());

        Optional<String> strRes = Stream.of("Hello", "Java", "!").reduce((str1, str2) -> str1 + " " + str2);
        System.out.println(strRes.get());

        System.out.println(result.stream().reduce(1, (a, b) -> a * b));

        List<Integer> emptyList = new ArrayList<>();
        Optional<Integer> minElement = emptyList.stream().min(Integer::compare);
        if (minElement.isPresent()) {
            minElement.get();
        }

        System.out.println(minElement.orElse(-1));
        Random random = new Random();
        System.out.println(minElement.orElseGet(() -> random.nextInt(10)));

        minElement.ifPresent(System.out::println);
        minElement.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Empty")
        );

        List<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Opel");
        cars.add("Bentley");
        cars.add("BMW");

        List<String> carsFiltered = cars.stream()
                .filter(car -> car.length() > 4)
                .collect(Collectors.toList());

        System.out.println(carsFiltered);

        Set<String> carsSet = cars.stream()
                .filter(car -> car.length() > 4)
                .collect(Collectors.toSet());

        System.out.println(carsSet);

        Car car1 = new Car("Mercedes", 100000);
        Car car2 = new Car("BMW", 150000);
        Car car3 = new Car("Ford", 30000);

        List<Car> carList = Arrays.asList(car1, car2, car3);

        Map<String, Integer> carMap = carList.stream()
                .collect(Collectors.toMap(Car::getBrand, Car::getPrice));

        System.out.println();

        carMap.forEach((key, value) -> System.out.println("key: " + key + " ,value: " + value));

//        ArrayList<Car> resCars = carList.stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println();
        List<String> namesList = Arrays.asList("John", "Jack", "Ann", "Bill", "Peter", "Eugen");
        System.out.println(namesByLength(namesList));
        System.out.println(namesByLengthMoreThan4(namesList));
    }

    public static Map<Integer, Set<String>> namesByLength(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
    }

    public static Map<Boolean, List<String>> namesByLengthMoreThan4(List<String> list) {
        return list.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 4));
    }
}
