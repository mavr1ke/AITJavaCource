package homework_12;

import java.util.Arrays;

public class HomeWork12 {
    public static void main(String[] args) {

        System.out.println("\n***Task 0***\n");
        System.out.println("Is 47 are simple? Answer = " + isSimple(47));
        System.out.println("Is 25 are simple? Answer = " + isSimple(25));
        System.out.println("\n***Task 1***\n");
        int[] myArray = {43, 5, -1, 0, 12, 40, 88, 5, 11, 1};
        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Amount of simple numbers in array: " + amountOfSimple(myArray));
        System.out.println("\n***Task 2***\n");
        String[] myStrings = {"My", "name", "is", "Giovanni", "Giorgio"};
        System.out.println("Strings array: " + Arrays.toString(myStrings));
        System.out.println("Array of max and min strings: " + Arrays.toString(minAndMaxStringValue(myStrings)));
        System.out.println("\n***Task 3***\n");
        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Array of simple numbers: " + Arrays.toString(toNewSimpleOnlyArray(myArray)));

    }

    public static boolean isSimple(int x) {
        if (x <= 1) {
            return false;
        }
        if (x == 2 || x == 3) {
            return true;
        }
        if (x % 2 == 0 || x % 3 == 0) {
            return false;
        }
        for (int j = 5; j <= Math.sqrt(x); j += 6) {
            if (x % j == 0 || x % (j + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int amountOfSimple(int[] array) {
        int amount = 0;
        if (array == null) return -1;
        for (int j : array) {
            if (isSimple(j)) {
                amount++;
            }
        }
        return amount;
    }

    public static String[] minAndMaxStringValue(String[] strings) {
        if (strings != null) {
            String minString = null;
            String maxString = null;
            for (String value : strings) {
                if (value != null) {
                    minString = value;
                    maxString = value;
                    break;
                }
            }

            if (minString == null) return null;

            for (String value : strings) {
                if (value != null && value.length() > maxString.length()) {
                    maxString = value;
                }
                if (value != null && value.length() < minString.length()) {
                    minString = value;
                }
            }
            return new String[]{maxString, minString};
        } else {
            return null;
        }
    }

    public static int[] toNewSimpleOnlyArray(int[] array) {
        if (array == null) return null;
        int[] simpleArray = new int[array.length];
        int count = 0;
        for (int j : array) {
            if (isSimple(j)) {
                simpleArray[count] = j;
                count++;
            }
        }
        simpleArray = Arrays.copyOf(simpleArray, count);
        return simpleArray;
    }
}