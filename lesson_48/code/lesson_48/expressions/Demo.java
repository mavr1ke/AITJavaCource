package lesson_48.expressions;

public class Demo {
    public static void main(String[] args) {

        int[] numbers = {4, 8, 13, 32, 64, 125, 256, 512};
        int[] dividers = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numbers.length; i++) {
            try {
                if (numbers[i] % 2 != 0) {
                    throw new NonIntegerException(numbers[i], dividers[i]);
                }
                System.out.println(numbers[i] + " / " + dividers[i] + " = " + numbers[i] / dividers[i]);
            } catch (ArithmeticException e) {
                System.out.println("Do not divide by zero!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index is out of bounds");
            } catch (NonIntegerException e) {
                System.out.println(e);
            }
        }
    }
}
