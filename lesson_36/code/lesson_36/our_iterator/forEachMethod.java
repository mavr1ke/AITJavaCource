package lesson_36.our_iterator;

import java.util.ArrayList;
import java.util.List;

public class forEachMethod {
    public static void main(String[] args) {

        List<String> numbers = new ArrayList<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");

        for (String number : numbers) {
            System.out.println(number);
        }

        numbers.forEach(number -> System.out.println(number));
    }
}
