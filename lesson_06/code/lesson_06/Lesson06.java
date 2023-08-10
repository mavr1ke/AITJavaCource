package lesson_06;

import java.util.Random;
import java.util.Scanner;

public class Lesson06 {
    public static void main(String[] args) {

        int x = 10;

        if (x <= 10) System.out.println("hi");

        System.out.println("x before if: " + x);
        if (x == 10) {
            x -= 1;
            System.out.println("x in if: " + x);
        }
        System.out.println("x after if: " + x);

        Scanner scanner = new Scanner(System.in);

        int temp = 3;
        System.out.println("Введите что-нибудь");
        String stringInput = scanner.nextLine();
        System.out.println("string -> " + (stringInput + 1000));

        int parseInt = Integer.parseInt(stringInput);
        System.out.println("int -> " + (parseInt + 1000));

        System.out.println("Введите 1:");
        int userInputInt = scanner.nextInt();

        if (userInputInt == 1) {
            System.out.println("Вы ввели 1");
        } else if (userInputInt == 3) {
            System.out.println("Вы ввели 3");
        } else if (userInputInt == 5) {
            System.out.println("Вы ввели 5");
        } else {
            System.out.println("Out of if");
        }

        Random random = new Random();
        int money = 100;
        int grade = random.nextInt(5);

        System.out.println("Оценка: " + grade);

        if (grade == 5) {
            money += 20;
        } else if (grade == 4) {
            money += 10;
        } else if (grade == 3) {

        } else if (grade == 2) {
            money -= 20;
        } else if (grade == 1) {
            money = 0;
        } else {
            System.out.println("Некорректная оценка");
        }

        System.out.println("У ребенка осталось " + money + " монет");

        int var1 = 10;
        int var2 = (var1 > 10) ? 20 : var1 - 4 ;
        System.out.println((var1 == 0) ? "равно 0" : "не равно 0");
       // System.out.println("var2 = " + var2);

        if (var1 > 10) {
            var2 = 10;
        } else {
            var2 = 0;
        }
    }
}
