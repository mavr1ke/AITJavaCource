package homework_09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\n***Task 0***\n");
        int[] arrayInt;
        int n, max, min, sum = 0;
        while (true) {
            System.out.println("Enter the number of values in the array:");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    arrayInt = new int[n];
                    int i = 0;
                    while (i < n) {
                        arrayInt[i] = random.nextInt(100) - 30;
                        i++;
                    }
                    max = arrayInt[0];
                    min = arrayInt[0];
                    int j = 0;
                    while (j < n) {
                        if (arrayInt[j] >= max) max = arrayInt[j];
                        if (arrayInt[j] <= min) min = arrayInt[j];
                        sum += arrayInt[j];
                        j++;
                    }

                    System.out.println("Array:" + Arrays.toString(arrayInt));
                    System.out.println("Min value: " + min);
                    System.out.println("Max value: " + max);
                    System.out.println("Sum:" + sum);
                    System.out.printf("Average %.1f: ", (double) sum / n);
                    break;
                } else {
                    System.out.println("Number is not positive, please try again");
                }
            } else {
                System.out.println("You entered something wrong, please try again");
                scanner.next();
            }
        }

        System.out.println("\n\n***Task 1***\n");
        int[] arrayInt1;
        int m, maxValue, minValue, maxIndex = 0, minIndex = 0;
        while (true) {
            System.out.println("Enter the number of values in the array:");
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                if (m > 0) {
                    arrayInt1 = new int[m];
                    int i = 0;
                    while (i < m) {
                        arrayInt1[i] = random.nextInt(100) - 30;
                        i++;
                    }
                    maxValue = arrayInt1[0];
                    minValue = arrayInt1[0];
                    int j = 0;
                    while (j < m) {
                        if (arrayInt1[j] >= maxValue) {
                            maxValue = arrayInt1[j];
                            maxIndex = j;
                        }
                        if (arrayInt1[j] <= minValue) {
                            minValue = arrayInt1[j];
                            minIndex = j;
                        }
                        j++;
                    }
                    System.out.println("Array:" + Arrays.toString(arrayInt1));
                    System.out.println("Min value: " + minValue);
                    System.out.println("Max value: " + maxValue);
                    arrayInt1[minIndex] = maxValue;
                    arrayInt1[maxIndex] = minValue;
                    System.out.println("Edited array:" + Arrays.toString(arrayInt1));
                    break;
                } else {
                    System.out.println("Number is not positive, please try again");
                }
            } else {
                System.out.println("You entered something wrong, please try again");
                scanner.next();
            }
        }

        System.out.println("\n***Task 2***\n");
        String[] strings;
        int stringAmount;
        String maxString;

        while (true) {
            System.out.println("Enter the number of values in the array:");
            if (scanner.hasNextInt()) {
                stringAmount = scanner.nextInt();
                scanner.nextLine();
                if (stringAmount > 0) {
                    int i = 0;
                    strings = new String[stringAmount];
                    System.out.println("Write strings(End every string with key 'Enter'):");
                    while (i < stringAmount) {
                        strings[i] = scanner.nextLine();
                        i++;
                    }
                    maxString = strings[0];
                    int j = 0;
                    while (j < stringAmount) {
                        if (maxString.length() <= strings[j].length()) {
                            maxString = strings[j];
                        }
                        j++;
                    }
                    System.out.println("Strings: " + Arrays.toString(strings));
                    System.out.println("Max string:");
                    int charCount = 0;
                    while (charCount < maxString.length()) {
                        System.out.println(maxString.charAt(charCount));
                        charCount++;
                    }
                   break;
                } else {
                    System.out.println("Number is not positive, please try again");
                }
            } else {
                System.out.println("You entered something wrong, please try again");
                scanner.next();
            }
        }
    }
}
