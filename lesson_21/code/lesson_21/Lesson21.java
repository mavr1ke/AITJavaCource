package lesson_21;

import java.util.Arrays;

public class Lesson21 {
    public static void main(String[] args) {

        int[] ints = {34, 21, 67, 41, 10, 50, 87, 99, 38, 57, 3, 77};

        System.out.println(ArraysUtil.linearSearch(ints, 41));

        System.out.println("Before sort:");
        System.out.println(Arrays.toString(ints));

        ArraysUtil.sortSelection(ints);

        System.out.println("\nAfter sort:");
        System.out.println(Arrays.toString(ints));

        System.out.println("\nBinary search of number:");
        int numberForSearch = 77;
        int idx = ArraysUtil.binarySearch(ints, numberForSearch);
        System.out.println("Index of number " + numberForSearch + " = " + idx);
    }
}
