package homework_21;

public class HWMain {
    public static void main(String[] args) {

        System.out.println("\n***Task 0***\n");

        int[] ints = {23, 54, 12, 12, 45, 6, 31, -3, 0, 17, 27, 88};
        int numberForSearch = 31;
        System.out.println("Linear search of 31, index = " + ArraysUtilities.linearSearch(ints, numberForSearch));

        System.out.println("\nBefore sort:");
        ArraysUtilities.printArray(ints);

        ArraysUtilities.sortSelection(ints);

        System.out.println("\nAfter sort:");
        ArraysUtilities.printArray(ints);

        System.out.println("\nBinary search of number:");
        numberForSearch = 88;
        int idx = ArraysUtilities.binarySearch(ints, numberForSearch);
        System.out.println("Index of number " + numberForSearch + " = " + idx);

        System.out.println("toString\n" + ArraysUtilities.toString(ints));

    }
}
