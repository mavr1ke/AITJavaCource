package lesson_32.unit_testing;

public class Main {
    public static void main(String[] args) {
        Calculator calculator;
        calculator = new Calculator();
        calculator.multiply(4,5);

        System.out.println(Circle.compareNumbers(3, 5));
        System.out.println(Circle.compareNumbers(5, 3));
    }
}
