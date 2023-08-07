package homework_13;

import java.util.Arrays;

public class HomeWork13 {
    public static void main(String[] args) {

        System.out.println("\n***Task 0***\n");
        String[] testStrings = {"Hello", "my", "name", null, "*commonness*"};
        String testString = " Name   ";
        System.out.println("Array of strings: " + Arrays.toString(testStrings));
        System.out.println("Request of string: " + testString);
        int indexOfRequestedString = searchIndexOfStringInStringArray(testStrings, testString);
        if (indexOfRequestedString >= 0) {
            System.out.println("Requested string: " + testStrings[indexOfRequestedString]);
        } else if (indexOfRequestedString == -1) {
            System.out.println("Array with strings is empty or requested string is null");
        } else if (indexOfRequestedString == -2) {
            System.out.println("Requested string is not found");
        }
        System.out.println("\n***Task 1***\n");
        System.out.println(secondThirdElementInStringToUpperCase("Hello"));
        System.out.println(secondThirdElementInStringToUpperCase("He"));
        System.out.println(secondThirdElementInStringToUpperCase("H"));
        System.out.println(secondThirdElementInStringToUpperCase(""));

        System.out.println("\n***Task 2***\n");
        int[] myIntArray = {0, 5, -54, 65, 2, 6, 33};
        System.out.println("Array of int: " + Arrays.toString(myIntArray));
        System.out.println("Sum of array: " + Arrays.stream(myIntArray).sum());
        System.out.println("My sum of array: " + mySumOfArray(myIntArray));

        System.out.println("\n***Task 2***\n");
        System.out.println("Array of int: " + Arrays.toString(myIntArray));
        System.out.println("Copy of int array: " + Arrays.toString(myNewCopyOfArray(myIntArray)));
        System.out.println("Array of strings: " + Arrays.toString(testStrings));
        System.out.println("Copy of string array: " + Arrays.toString(myNewCopyOfArray(testStrings)));
        System.out.println("Copy of int array with length 10: "+Arrays.toString(myNewCopyOfArray(myIntArray, 10)));

    }

    private static int searchIndexOfStringInStringArray(String[] strings, String string) {
        if (strings == null || string == null) return -1;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && strings[i].trim().equals(string.trim())) {
                return i;
            }
        }
        return -2;
    }

    private static String secondThirdElementInStringToUpperCase(String string) {
        if (string == null || string.length() == 0) return "";
        char firstLetter, secondLetter, thirdLetter;
        if (string.length() > 2) {
            secondLetter = Character.toUpperCase(string.charAt(1));
            thirdLetter = Character.toUpperCase(string.charAt(2));
            return String.valueOf(secondLetter) + thirdLetter;
        } else if (string.length() == 2) {
            secondLetter = Character.toUpperCase(string.charAt(1));
            return String.valueOf(secondLetter);
        }
        firstLetter = Character.toLowerCase(string.charAt(0));
        return String.valueOf(firstLetter);
    }

    public static int mySumOfArray(int[] array) {
        if (array == null) return 0;
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static int[] myNewCopyOfArray(int[] array) {
        if (array == null) return new int[0];
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }

    public static String[] myNewCopyOfArray(String[] strings) {
        if (strings == null) return new String[0];
        String[] copyArray = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            copyArray[i] = strings[i];
        }
        return copyArray;
    }

    public static int[] myNewCopyOfArray(int[] array, int length) {
        if (array == null || length <= 0 ) return new int[0];
        int[] copyArray = new int[length];
        for (int i = 0; i < length & i < array.length; i++) {
                copyArray[i] = array[i];
        }
        return copyArray;
    }
}