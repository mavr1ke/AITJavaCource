package wrapper_classes_and_generics;

import wrapper_classes_and_generics.gen_interfaces.Person2;

public class OurGenerics {
    public static void main(String[] args) {

        Person<Integer> person1 = new Person<>("John", 25);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        Person<String> person2 = new Person<>("John2", "twenty five");
        System.out.println(person2.getName());
        System.out.println(person2.getAge());

//        Person<Integer> peter = new Person<>("Peter", "twenty years");

        Printer printer = new Printer();

        Integer[] ints = {1, 2, 3, 4, 5};
        String[] strings = {"a", "b", "c"};

        printer.<Integer>printArray(ints);
        printer.<String>printArray(strings);

        Person2<String,Integer> person = new Person2<>("Ann",22);
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
