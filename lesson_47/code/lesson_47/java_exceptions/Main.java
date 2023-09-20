package lesson_47.java_exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2;

        try {
            num1 = 0;
            num2 = 3;
            int divine = num2 / num1;
            System.out.println("num2/num1 = " + divine);
            System.out.println("End of try block");
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 is not allowed!");
            System.out.println(e.getMessage());
        }

        System.out.println("\n***************");
        int[] ints = {1, 0, 4};

        try {
            String nullString = null;
            nullString.length();
            num1 = ints[100];
            num2 = ints[2];
            int divine = num2 / num1;
            System.out.println("num2/num1 = " + divine);
            System.out.println("End of try block");
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 is not allowed!");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occurred");
            System.out.println(e.getMessage());
        }

        int[] numbers = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] dividers = {2, 0, 4, 8, 0, 8};

        System.out.println("\n***************************************");
        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(numbers[i] + "/" + dividers[i] + "=" + numbers[i] / dividers[i]);
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by zero!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Dividers array is finished and matching element was not found");
            }
        }

        System.out.println("\n*************************");
        try {
            int a = 100/0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is finally block");
        }
        System.out.println("We are out of the try-catch-finally ");
    }
}
