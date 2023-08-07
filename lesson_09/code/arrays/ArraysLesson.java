package arrays;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {

        int[] array = new int[5];
        //  int array[]; option 2(not recommended)

        int a = 10;

        int[] array2 = new int[10];
        int[] array3 = new int[a];

        char[] chars = new char[10];

        String[] strings = new String[7];
        String str = null;
        boolean[] booleans = new boolean[100];

        String[] strings1 = new String[]{"One", "Two"};
        String[] strings2 = {"One", "Two"};

        int[] numbers = new int[]{1, 5, -16, 25, 0};

        int[] myArray = {1, 5, -16, 25, 0};

        int digitIndex1 = myArray[1];
        System.out.println("digitIndexOld: " + digitIndex1);
        myArray[1] = 1;
        int digitIndex2 = myArray[1];
        System.out.println("digitIndexNew: " + digitIndex2);

        int lengthArray = myArray.length;
        System.out.println("Array length: " + lengthArray);

        int counter = 0;
        while (counter < myArray.length) {
            if (myArray[counter] % 2 == 0) {
                System.out.println(myArray[counter]);
            }
            counter++;
        }
        System.out.println(Arrays.toString(myArray));


        int[] myArray2 = {55, -15, 543, 10, 17, 56, 101, 0, 145};
        int[] arraySubarray = Arrays.copyOf(myArray2, 4);
        System.out.println(Arrays.toString(arraySubarray));

        int[] arraySubarray2 = Arrays.copyOfRange(myArray2, 4,7);
        int[] arraySubarray3 = Arrays.copyOfRange(myArray2, 4,7);
        System.out.println(Arrays.toString(arraySubarray2));
        System.out.println(Arrays.toString(arraySubarray3));

        System.out.println(Arrays.equals(arraySubarray2, arraySubarray3));

        System.out.println(Arrays.toString(myArray2));
        Arrays.sort(myArray2, 2, 6);
        System.out.println(Arrays.toString(myArray2));
        Arrays.sort(myArray2);
        System.out.println(Arrays.toString(myArray2));
    }
}
