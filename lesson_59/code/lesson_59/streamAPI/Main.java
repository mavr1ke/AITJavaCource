package lesson_59.streamAPI;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] ints = {10, 20, 30, 40, 50, 60, 70};
        int counter = 0;
        for (int i : ints) {
            if (i < 21) {
                continue;
            }
            i *= 2;
            counter++;
            if (counter > 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println();
        IntStream.of(10, 20, 30, 40, 50, 60, 70)
                .filter(i -> i >= 21)
                .map(i -> i * 2)
                .limit(3)
                .forEach(System.out::println);

        Stream<String> empty = Stream.empty();
        Collection<String> collection = Arrays.asList("One", "Two", "Three");
        collection.stream();

        String[] strings = {"One", "Two", "Three"};
        Arrays.stream(strings);

        "abcde".chars();

        Stream.of("one", "two", "three");

        IntStream intStream = IntStream.of(1, 2, 3);
        IntStream.range(1, 3);
        IntStream.rangeClosed(1, 3);

        Random random = new Random();
        random.doubles();

        Stream<String> fruits = Stream.of("Apple", "Orange", "Lemon", "Kiwi");
        fruits.forEach(System.out::println);

//        fruits.filter(f -> f.length() == 5).forEach(System.out::println);

        Stream<Car> cars = Stream.of(new Car("Mercedes", 100000)
                , new Car("Volvo", 80000)
                , new Car("Bentley", 500000));

        cars.filter(car -> car.getPrice() < 200000).forEach(car -> System.out.println(car.getBrand()));

        cars = Stream.of(new Car("Mercedes", 100000)
                , new Car("Volvo", 80000)
                , new Car("Bentley", 500000));

        cars.filter(car -> car.getPrice() < 200000)
                .map(Car::getBrand)
                .forEach(System.out::println);

        cars = Stream.of(new Car("Mercedes", 100000)
                , new Car("Volvo", 80000)
                , new Car("Bentley", 500000));

        cars
                .map(car -> "brand: " + car.getBrand() + " price: " + car.getPrice())
                .forEach(System.out::println);

        List<String> carList = new ArrayList<>();
        carList.add("mercedes");
        carList.add("volvo");
        carList.add("bentley");
        carList.add("opel");

        carList.stream()
                .filter(car -> car.length() > 4)
                .sorted()
                .forEach(System.out::println);
    }
}
