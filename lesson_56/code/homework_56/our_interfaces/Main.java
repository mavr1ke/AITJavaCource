package homework_56.our_interfaces;

public class Main {

    /*
    Используя наши интерфейсы написать такие лямбда-выражения
    1. Конкатинировать числа a и b(1 и 2 = 12)
    2. Если длина строки = 3 вернуть true, иначе false
    3. Если длина строки четная вернуть true, иначе false
    4. Вернуть строку в верхнем регистре
    5. Если длина строки = 4 вернуть четыре звездочки *, иначе вернуть строку без изменений
    6. Распечатать строку в виде !строка!
    7. возвращает "Hello World"
    */

    public static void main(String[] args) {
        System.out.println("\nOne");
        Concatable one = (a, b) -> a + Integer.toString(b);
        System.out.println("2 + 4 = " + one.concat(2, 4));

        System.out.println("\nTwo");
        Checkable two = (str) -> str.length() == 3;
        System.out.println("'yes': " + two.check("yes"));
        System.out.println("'no': " + two.check("no"));

        System.out.println("\nThree");
        Checkable three = (str) -> str.length() % 2 == 0;
        System.out.println("'ok': " + three.check("ok"));
        System.out.println("'okk': " + three.check("okk"));

        System.out.println("\nFour");
        Transformable four = String::toUpperCase;
        System.out.println("'okay': " + four.modify("okay"));

        System.out.println("\nFive");
        Transformable five = (str) -> {
            if (str.length() == 4) {
                return "****";
            } else {
                return str;
            }
        };
        System.out.println("'pass': " + five.modify("pass"));
        System.out.println("'no': " + five.modify("no"));

        System.out.println("\nSix");
        Printable six = (str) -> System.out.println("!" + str + "!");
        six.print("juj");

        System.out.println("\nSeven");
        Producible seven = () -> "Hello World";
        System.out.println(seven.produce());
    }
}
