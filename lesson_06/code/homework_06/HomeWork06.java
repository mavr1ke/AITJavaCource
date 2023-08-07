package homework_06;

import java.util.Random;
import java.util.Scanner;

public class HomeWork06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\n***Task 0***\n");
        System.out.println("Write number 1, 2 or 3");
        if (scanner.hasNextInt()) {
            int var = scanner.nextInt();
            if (var == 1) {
                System.out.println("Number is 1");
            } else if (var == 2) {
                System.out.println("Number is 2");
            } else if (var == 3) {
                System.out.println("Number is 3");
            } else System.out.println("Uncorrected number");
            } else System.out.println("Its not integer");

        System.out.println("\n***Task 1***\n");
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        int num3 = random.nextInt(100);
        int num4 = random.nextInt(100);
        int max1, max2;
        System.out.printf("Number 1 = %d\nNumber 2 = %d\nNumber 3 = %d\nNumber 4 = %d", num1, num2, num3, num4);
        max1 = Math.max(num1, num2);
        max2 = Math.max(num3, num4);
        if (max1 > max2) {
            System.out.println("\nMaximal number is " + max1);
        } else System.out.println("\nMaximal number is " + max2);

        System.out.println("\n***Task 2***\n");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Write four-digit number");
        if (scanner1.hasNextInt()) {
            String number = scanner1.nextLine();
            if (number.length() == 4) {
                int firstPair =  (int) number.charAt(0) + (int) number.charAt(1);
                int secondPair = (int) number.charAt(2) + (int) number.charAt(3);
                if (firstPair == secondPair) {
                System.out.println("Its a lucky ticket!!! :)");
               } else System.out.println("Its not a happy ticket :(");
            } else System.out.println("Number is not four-digit");
        } else System.out.println("Its not number");
    }
}
