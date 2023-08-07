package homework_07;

import java.util.Random;
import java.util.Scanner;

public class HomeWork07 {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("\n***Task 0***\n");
        Scanner scanner = new Scanner(System.in);
        String result = "Enter number 1,2,3,4 or 5";
        System.out.println(result);
        if (scanner.hasNextInt()) {
            int myChoice = scanner.nextInt();
            switch (myChoice) {
                case 1:
                    result = "You wrote 1";
                    break;
                case 2:
                    result = "You wrote 2";
                    break;
                case 3:
                    result = "You wrote 3";
                    break;
                case 4:
                case 5:
                    result = "You wrote 4 or 5";
                    break;
                default:
                    result = "Uncorrected number";
            }
        } else result = "Number should be number";
        System.out.println(result);
        System.out.println("\n***Task 1***\n");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number of the day");
        if (scanner1.hasNextInt()) {
            int day = scanner1.nextInt();
            switch (day) {
                case 1: {
                    System.out.println("Monday");
                    break;
                }
                case 2: {
                    System.out.println("Tuesday");
                    break;
                }
                case 3: {
                    System.out.println("Wednesday");
                    break;
                }
                case 4: {
                    System.out.println("Thursday");
                    break;
                }
                case 5: {
                    System.out.println("Friday");
                    break;
                }
                case 6:
                case 7: {
                    System.out.println("Weekend");
                    break;
                }
                default:
                    System.out.println("Uncorrected number of the day");
            }
        } else System.out.println("You didn't write number");
        System.out.println("\n***Task 2***\n");
        int grade = random.nextInt(13), time = 45;
        System.out.println("Grade of the son: " + grade);
        switch (grade) {
            case 12:
            case 11:
            case 10: {
                System.out.println("Great job son!");
                time += 60;
                break;
            }
            case 9:
            case 8:
            case 7: {
                System.out.println("Good job son");
                time += 45;
                break;
            }
            case 6:
            case 5:
            case 4: {
                System.out.println("Not bad son");
                time += 15;
                break;
            }
            case 3: {
                System.out.println("It's not good son");
                time -= 30;
                break;
            }
            case 2:
            case 1: {
                System.out.println("It's terrible son, no TV today");
                time = 0;
                break;
            }
            default: {
                System.out.println("Error, uncorrected grade");
                System.exit(0);
            }
        }
        System.out.println("Time left to watch TV today: " + time);
    }
}

