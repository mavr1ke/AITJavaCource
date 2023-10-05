package homework_57;

import java.util.function.*;

public class HWMain {
    /*
    Используя стандартныe функциональныe интерфейсы написать такие лямбда- выражения:
    1. Конкатинировть числа  a  и  b(1 + 2 = 12)
     2. Если длина строки  = 3  вернуть true  иначе false
     3. Если длина строки четная  вернуть true  иначе false
     4. Вернуть строку в верхнем регистре
     5. Если длина строки = 4 вернуть четыре звездочки **** иначе вернуть строку без изменений
     6. Распечатать строку в виде !строка!
     7. возвращает  "Hello World"

     */
    public static void main(String[] args) {

        System.out.println("\nOne");
        BiFunction<Integer, Integer, String> one = (a, b) -> a.toString() + b.toString();
        System.out.println("2 + 4 = " + one.apply(2, 4));

        System.out.println("\nTwo");
        Predicate<String> two = (str) -> str.length() == 3;
        System.out.println("'yes': " + two.test("yes"));
        System.out.println("'no': " + two.test("no"));

        System.out.println("\nThree");
        Predicate<String> three = (str) -> str.length() % 2 == 0;
        System.out.println("'ok': " + three.test("ok"));
        System.out.println("'okk': " + three.test("okk"));

        System.out.println("\nFour");
        Function<String,String> four = String::toUpperCase;
        System.out.println("'okay': " + four.apply("okay"));

        System.out.println("\nFive");
        Function<String,String> five = (str) -> {
            if (str.length() == 4) {
                return "****";
            } else {
                return str;
            }
        };
        System.out.println("'pass': " + five.apply("pass"));
        System.out.println("'no': " + five.apply("no"));

        System.out.println("\nSix");
        Consumer<String> six = (str) -> System.out.println("!" + str + "!");
        six.accept("juj");

        System.out.println("\nSeven");
        Supplier<String> seven = () -> "Hello World";
        System.out.println(seven.get());
    }
}
