package lesson_57.method_reference;

public class OurPredicateClass {

    public static boolean isNegative(int n) {
        return n < 0;
    }

    public static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    public static boolean isPositive(int n) {
        return n >= 0;
    }
}
