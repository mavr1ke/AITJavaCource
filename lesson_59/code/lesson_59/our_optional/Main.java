package lesson_59.our_optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        String name = "John";
        Optional<String> optName = Optional.of(name);
        System.out.println(optName.isPresent());

        String nullString = null;
//        Optional<String> optNull = Optional.of(nullString);
//        System.out.println(optNull.isPresent());

        Optional<String> optional = Optional.of("java");
        optional.ifPresent(str -> System.out.println(str.length()));

        String nullName = null;
        nullName ="John";
        String kate = Optional.ofNullable(nullName).orElse("Kate");
        System.out.println(kate);

        nullName = null;
        String anotherName = Optional.ofNullable(nullName).orElseGet(() -> "Kate");
        System.out.println(anotherName);

//        String nameEx = Optional.ofNullable(nullName).orElseThrow();

        Optional<String> newWord = Optional.of("Hello");
        String hello = newWord.get();
        System.out.println(hello);

        Optional<String> newWordNull = Optional.ofNullable(null);
//        newWordNull.get();
    }
}
