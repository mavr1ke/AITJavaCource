package homework_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\n***Task 0***\n");
        int sum = 0;
        int[] arrayInt = new int[20];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(100) + 1;
        }
        System.out.println("Array:" + Arrays.toString(arrayInt));
        System.out.print("Even numbers: ");
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 == 0) {
                System.out.print(arrayInt[i] + " ");
                sum += arrayInt[i];
            }
        }
        System.out.println("\nSum of even numbers: " + sum);

        System.out.println("\n***Task 1***\n");
        float deposit;
        int term, percent = 7;
        System.out.print("Enter amount of deposit: ");
        deposit = scanner.nextFloat();
        System.out.print("Enter term of deposit in month: ");
        term = scanner.nextInt();
        for (int i = 0; i < term; i++) {
            deposit += deposit * ((float) percent / 100);
        }
        System.out.printf("After %d months sum of deposit will be: %.2f", term, deposit);

        System.out.println("\n\n***Task 2***\n");
        int[] arrayRandom = new int[50];
        int count = 0;
        System.out.print("Array: ");
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextInt(100) + 1;
            System.out.print(arrayRandom[i] + " ");
        }
        System.out.print("\nSimple numbers: ");
        for (int i = 0; i < arrayRandom.length; i++) {
            if (arrayRandom[i] > 1) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(arrayRandom[i]); j++) {
                    if (arrayRandom[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(arrayRandom[i] + " ");
                    count++;
                }
            }
        }
        System.out.println("\nAmount of simple numbers: " + count);

        System.out.println("\n***Task 3***\n");
        System.out.println("First way:\n");
        int temp = 1;
        for (int i = 1; i <= 123456; i++, temp++) {
            System.out.println(i);
            i= (i * 10) + temp;
        }
        System.out.println("\nSecond way:");
        for (int i = 0; i <= 6; i++) {
            for (int j = 1; j <= i;j++) {
            System.out.print(j );
            }
            System.out.println();
        }
    }
}
