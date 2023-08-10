package lesson_and_homework_18;

import java.util.Arrays;

public class Lesson18 {
    public static void main(String[] args) {

//        int[] array = new int[2];
//        int var = 10;
//        array[0] = var;
//
//        System.out.println(Arrays.toString(array));
//
//        int var2 = 25;
//        array[1] = var2;
//
//        System.out.println(Arrays.toString(array));
//
//        int var3 = 333;
        System.out.println("\n***Task 0***\n");
        RubberArray ra = new RubberArray();

        ra.printArray();

        ra.add(10);
        ra.add(25);
        ra.add(-20);

        ra.printArray();

        System.out.println("Length: " + ra.size());
        System.out.println("\nSum: " + ra.sumOfValues());
        System.out.println("\nAverage: " + ra.averageOfValues());
        System.out.println("\nAdded 3 values at once\n");
        ra.add(10, 15, 145);
        System.out.println("Array:");
        ra.printArray();
        System.out.println("Min: " + ra.min());
        System.out.println("\nMax: " + ra.max());
        System.out.println("\nSearch for index 2: " + ra.searchByIndex(2));
        System.out.println("\nSearch for value 25: " + ra.searchByValue(25) + " index\n");

        int[] newArray = ra.toArray();

        newArray[0] = 10_000;
        System.out.println(Arrays.toString(newArray));
        System.out.println("================");

        System.out.println("Array:");
        ra.printArray();
        ra.deleteByIndex(2);
        System.out.println("Delete by index 2: ");
        ra.printArray();
        System.out.println("Delete by value 15: ");
        ra.deleteByValue(15);
        ra.printArray();
        System.out.println("================");
        System.out.println("New array:");
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        RubberArray rubberArray = new RubberArray(ints);
        rubberArray.printArray();
        ints[0] = 1000;
        rubberArray.printArray();

        rubberArray.replaceByIndex(2,5);
        System.out.println("Replace by index 2 to value 5:");
        rubberArray.printArray();

        rubberArray.replaceByValue(9, 0);
        System.out.println("Replace by value 9 to value 0:");
        rubberArray.printArray();

    }
}
