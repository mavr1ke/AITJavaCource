package homework_08;

import java.util.Scanner;

public class HomeWork08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n***Task 0***\n");
        int i = 1;
        while (i <= 10) {
            System.out.println("Task" + i++);
        }

        System.out.println("\n***Task 1***\n");
        System.out.println("Numbers that are divisible by 5:");
        int j = 1;
        do {
            if (j % 5 == 0) {
                System.out.print(j + " ");
            }
            j++;
        } while (j < 100);

        System.out.println("\n\n***Task 2***\n");
        int n = 1, countNum = 0;
        System.out.println("Numbers that are divisible by 5 (only 7):");
        while (n <= 100 && countNum != 7) {
            if (n % 5 == 0) {
                System.out.print(n + " ");
                countNum++;
            }
            n++;
        }

        System.out.println("\n\n***Task 3***\n");
        String userAnswer, answer = "hello";
        int countTry = 0;
        do {
            System.out.println("Enter the word \"hello\":");
            userAnswer = scanner.nextLine();
            System.out.println("You wrote word: " + userAnswer);
            countTry++;
        } while (!userAnswer.trim().equalsIgnoreCase(answer));

        System.out.println("Well done! You did it on " + countTry + " try");

        System.out.println("\n***Task 4***\n");
        int numberInt, digit, sum = 0;
        while (true){
            System.out.println("Enter number:");
            if (!scanner.hasNextInt()) {
                System.out.println("Its not integer\n");
                scanner.next();
            } else {
                numberInt = scanner.nextInt();
                String digitString = "";
                System.out.print(numberInt + " -> ");
                while (numberInt != 0) {
                    digit = numberInt % 10;
                    digitString = digit + " " + digitString;
                    sum += digit;
                    numberInt /= 10;
                }
                System.out.println(digitString+ " -> " + sum);
                break;
            }
        }
    }
}
