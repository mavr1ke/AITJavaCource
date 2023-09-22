package homework_48.enum_game;

import java.util.Scanner;

public class DayOfWeekResolver {

    private static final Scanner scanner = new Scanner(System.in);

    private static String stringFromScanner(String day) {
        if (day.isEmpty()) {
            throw new NullPointerException("String with day is empty");
        }
        return day;
    }

    private static DayOfWeek convertToDayOfWeek(String day) {
        try {
            return DayOfWeek.valueOf(day.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Incorrect day of the week: " + day);
        }
    }

    private static boolean isWeekend(DayOfWeek day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY: {
                return false;
            }
            case SATURDAY:
            case SUNDAY: {
                return true;
            }
            default:
                return false;
        }
    }

    public static void start() {
        boolean continueGame = true;
        while (continueGame) {
            System.out.println("\nEnter the day (or type 'exit' to quit): ");
            String day = scanner.nextLine().trim();
            if (day.equalsIgnoreCase("exit")) {
                continueGame = false;
            } else {
                System.out.println("Is '" + day + "' a weekend?");
                try {
                    boolean res = isWeekend(convertToDayOfWeek(stringFromScanner(day)));
                    if (res) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } catch (IllegalArgumentException | NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        scanner.close();
    }
}
