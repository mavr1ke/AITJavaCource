package homework_59;

import java.util.ArrayList;
import java.util.List;

public class HWMain {
    public static void main(String[] args) {
        Address address1 = new Address("Main Street", 123);
        Address address2 = new Address("Side Street", 456);

        Person person1 = new Person("John Doe", 20, address1);
        Person person2 = new Person("Will Smith", 15, address2);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);

        printAddresses(persons);

    }

    public static void printAddresses(List<Person> persons) {
        persons.stream()
                .filter(person -> person.getAge() > 17)
                .map(Person::getAddress)
                .forEach(address -> System.out.println(address.getStreet() + " " + address.getHouseNumber()));
    }
}
