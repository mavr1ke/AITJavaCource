package lesson08;

import java.util.Random;
import java.util.Scanner;

public class Lesson08 {
    public static void main(String[] args) {

        Random random = new Random();
        int i = 0;
        while (i <= 10) {
            System.out.println("hi " + i++);
            // i += 1;
        }
        System.out.println("Цикл 1 завершен");

        System.out.println("===============");

        i = 100;
        while (i >= 90) {
            System.out.println("hi " + i--);
            // i -= 1;
        }
        System.out.println("Цикл 2 завершен");
        int y = 0;

        int randomNumber, count12 = 0, count13 = 0;
        System.out.println("+++++++++++++++");
        while (y < 1_000_000) {
            randomNumber = random.nextInt(13);
            if (randomNumber == 12) count12++;
            if (randomNumber == 13) count13++;
            y++;
        }
        System.out.println("12 - " + count12);
        System.out.println("13 - " + count13);

        System.out.println("================");
        int var1 = 0;

        while (var1 != 0) {
            System.out.println("While: var не равен 0");
        }

        do {
            System.out.println("Do-while var не равен 0");
        } while (var1 != 0);

        Scanner scanner = new Scanner(System.in);
        int answerInt;
        do {
            System.out.println("Введите число меньше или равное 10");
            answerInt = scanner.nextInt();
            System.out.println("Вы ввели число: " + answerInt);
        } while (answerInt>10);

        System.out.println("Done");

        int temp = 1;

        while (temp <= 20) {
            if (temp % 2 == 0) {
                System.out.println(temp);
            }
            temp++;
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите количество");
        int userInt = scanner1.nextInt(), counter2 = 1, sum = 0;
        while (counter2 <= userInt) {
            int randomInt = random.nextInt(100) + 1;
            sum += randomInt;
            counter2++;
        }
        System.out.println(((double) sum) / (counter2 - 1));
    }
}
