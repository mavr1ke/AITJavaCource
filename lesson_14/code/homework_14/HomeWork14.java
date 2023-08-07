package homework_14;

import java.util.Arrays;

public class HomeWork14 {
    public static void main(String[] args) {

        System.out.println("\n***Task 0***\n");
        String myString = "Hello my Name is 12345 что-то";
        System.out.println("My string:\n" + myString);
        System.out.println("\nString after uppercase method:\n" + myToUpperCaseLatin(myString));

        System.out.println("\n***Task 1***\n");
        int[] myIntArray = {1, 2, 3, 4, 5};
        String[] myStringArray = {"One", "Two", "Three", "Four", "Five"};

        System.out.println("My int array: " + Arrays.toString(myIntArray));
        if (swapValuesInArrayWithIndex(myIntArray, 0, 1)) {
            System.out.println("Values in int array swapped\nInt array after method: " + Arrays.toString(myIntArray));
        } else System.out.println("Array length or indexes is incorrect");

        System.out.println("\nMy string array: " + Arrays.toString(myStringArray));
        if (swapValuesInArrayWithIndex(myStringArray, 0, 4)) {
            System.out.println("Values in string array swapped\nString array after method: " + Arrays.toString(myStringArray));
        } else System.out.println("Array length or indexes is incorrect");
        
        System.out.println("\n***Task 2***\n");
        System.out.println("My string:\n" + myString);
        System.out.println("\nString after substring method with both indexes:\n" + mySubStringMethod(myString, 2, 20));
        System.out.println("\nString after substring method with one index:\n" + mySubStringMethod(myString, 6));
    }

    public static String myToUpperCaseLatin(String string) {
        if (string == null) return "";
        char[] result = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if ('a' <= currentChar && currentChar <= 'z') { //97-122
                result[i] = (char) (currentChar - 32);
            } else {
                result[i] = currentChar;
            }
        }
        return new String(result);
    }

    public static boolean swapValuesInArrayWithIndex(int[] array, int firstIndex, int secondIndex) {
        if (array == null) {
            return false;
        } else if (firstIndex < 0 || secondIndex < 0 || firstIndex >= array.length || secondIndex >= array.length) {
            return false;
        } else {
            int temp = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = temp;
            return true;
        }
    }


    public static boolean swapValuesInArrayWithIndex(String[] array, int firstIndex, int secondIndex) {
        if (array == null) {
            return false;
        } else if (firstIndex < 0 || secondIndex < 0 || firstIndex >= array.length || secondIndex >= array.length) {
            return false;
        } else {
            String temp = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = temp;
            return true;
        }
    }

    public static String mySubStringMethod(String string, int indexStart, int indexEnd) {
        if (string == null || string.length() == 0 || indexStart < 0 || indexEnd < 0) return "";
        if (indexEnd >= string.length() || indexStart >= indexEnd) return "";
        char[] result = new char[indexEnd - indexStart + 1];
        for (int i = 0; i < indexEnd - indexStart + 1; i++) {
            result[i] = string.charAt(indexStart + i);
        }
        return new String(result);
    }

    public static String mySubStringMethod(String string, int indexStart) {
        return mySubStringMethod(string, indexStart, string.length() - 1);
    }
}
