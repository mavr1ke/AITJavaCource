package lesson_22;

public class MainPersons {
    public static void main(String[] args) {
        Person person = new Person("Bob");
        person.setChild(true);
        System.out.println(person.getName() + " - is a child? " + person.isChild());
        System.out.println(person.isHaveSpecialRequirements());
        person.move();

        Passenger passenger = new Passenger("John");
        System.out.println(passenger.getName() + " - is a child? " + passenger.isChild());

        Passenger passenger1 = new Passenger("Stella");
        passenger1.setHaveSpecialRequirements(true);

        System.out.println(passenger1.toString() + "\nhave special requirement: " + passenger1.isHaveSpecialRequirements());
    }
}
