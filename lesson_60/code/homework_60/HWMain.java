package homework_60;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HWMain {
    public static void main(String[] args) {
        Address address1 = new Address("Main Street", 123);
        Address address2 = new Address("Side Street", 456);
        Address address3 = new Address("Upper Street", 234);

        Person person1 = new Person("John Doe", 20, address1);
        Person person2 = new Person("Will Smith", 15, address2);
        Person person3 = new Person("Will Smith", 20, address3);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        printAddresses(persons);
        System.out.println(listOfNamesWithoutDuplicates(persons));
        System.out.println(mapOfPersons(persons));

    }

    public static void printAddresses(List<Person> persons) {
        persons.stream()
                .filter(person -> person.getAge() > 17)
                .map(Person::getAddress)
                .forEach(System.out::println);
    }

    public static List<String> listOfNamesWithoutDuplicates(List<Person> persons) {
        return persons.stream()
                .map(Person::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public static Map<Integer,List<Person>> mapOfPersons(List<Person> persons) {
        return persons.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.toList()));
    }
}
