package lesson_38.linked_list;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        List<String> strings = new LinkedList<>();
        LinkedList<String> names = new LinkedList<>();

        names.add("Jack");
        names.add("John");
        names.add("Bill");

        System.out.println(names);

        names.addFirst("Ann");

        System.out.println(names);

        names.removeFirst();

        System.out.println(names);

        System.out.println(names.peekFirst());
    }
}
