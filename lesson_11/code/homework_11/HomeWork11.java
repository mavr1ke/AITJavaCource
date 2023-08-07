package homework_11;

import java.util.Arrays;

public class      HomeWork11 {
    public static void main(String[] args) {

        System.out.println("\n***Task 0***\n");
        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean flagArray = false;
        System.out.println("Array: " + Arrays.toString(arrayInt));
        System.out.print("Reversed array: ");
        reverseArray(arrayInt);
        System.out.print("Reversed array from index: ");
        reverseArray(arrayInt, 3);
        System.out.print("Reversed array with flag: ");
        reverseArray(arrayInt, flagArray);

        System.out.println("\n***Task 1***\n");
        powerOfTwo(10);

        System.out.println("\n***Task 2***\n");
        System.out.println("Array: " + Arrays.toString(arrayInt));
        int[] arrayNew = myCopyOf(arrayInt,12);
        System.out.println("Returned first copy from method: " + Arrays.toString(arrayNew));
        arrayNew = myCopyOf(arrayInt,3);
        System.out.println("Returned second copy from method: " + Arrays.toString(arrayNew));

    }

    public static void reverseArray(int[] array) {
        if (null != array) {
            System.out.print("[");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + ((i == 0) ? "" : ", "));
            }
            System.out.println("]");
        }
    }

    public static void reverseArray(int[] array, int index) {
        if(index < array.length ) {
            System.out.print("[");
            for (int i = 0; i < index; i++) {
                System.out.print(array[i] + ", ");
            }
            for (int i = array.length - 1; i >= index; i--) {
                System.out.print(array[i] + ((i == index) ? "" : ", "));
            }
            System.out.println("]");
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ((i == array.length - 1) ? "" : ", "));
            }
            System.out.println("]");
        }
    }

    public static void reverseArray(int[] array, boolean flag) {
        if (flag) {
            reverseArray(array);
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ((i == array.length - 1) ? "" : ", "));
            }
            System.out.println("]");
        }
    }

    public static void powerOfTwo(int pow) {
        int answer = 2;
        for (int i = 1; i < pow; i++) {
            answer *= 2;
        }
        System.out.println("2^" + pow + " = " + answer);
    }

    public static int[] myCopyOf(int[] array, int length) {
        int[] copyArray = new int[length];
        for (int i = 0; i < length; i++) {

            if (i >= array.length) {
                copyArray[i] = 0;
            } else {
                copyArray[i] = array[i];
            }
        }
        return copyArray;
    }
}
