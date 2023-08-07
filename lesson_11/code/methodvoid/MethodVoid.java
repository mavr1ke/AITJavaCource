package methodvoid;

import java.util.Arrays;

public class MethodVoid {
    public static void main(String[] args) {
        sayHello();
        sayHello();
        sayHello();
        sayHello();

        char chSymbol = 'A';
        printDecimalCodeOfChar('A');
        printDecimalCodeOfChar(chSymbol);

        int[] arrays = {44, 54, 13, 66, 35, 21};
        printArray(arrays);
        System.out.println(Arrays.toString(arrays));

        System.out.println("++++++++++");
        //simpleDigit(11);
        int[] array = {13, 43, 55, 19, 22, 65, -13, 0, 4, 5};

        for (int i = 0; i < array.length; i++) {
            simpleDigit(array[i]);
        }

        for (int element : array) {
            simpleDigit(element);
        }

        String[] strings = {"saf", "asfa"};
        for (String str : strings) {
            System.out.println(str);
        }
        //Написать метод принимающий число. Вывести на экран надпись: число является / не явлется ли оно простым.

        // Метод выводящий на экран от 1 до n
        fromDigit(10);
        fromDigit(10,15);
    }

    public static void fromDigit(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public static void fromDigit(int x,int y) {
        for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }
    }

    public static void simpleDigit(int num) {
        boolean isPrime = true;
        if (num == 1 || num <= 0) {
            isPrime = false;
            // System.out.println("Число 1 не является простым");
        }
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " является простым");
        } else System.out.println(num + " не является простым");
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i == array.length - 1) ? "" : ", "));
        }
        System.out.print("]");
        System.out.println();
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void printDecimalCodeOfChar(char ch) {
        System.out.println((int) (ch));
    }

}
