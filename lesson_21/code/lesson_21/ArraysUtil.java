package lesson_21;

public class ArraysUtil {

    public static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    private static int min(int[] arr) {
        int min = arr[0];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int minIndex(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void sortSelection(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int localMin = minIndex(array,i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;
        }

    }

    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        int counter = 0;

        while (startIndex <= endIndex) {
            counter++;
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == searchValue) {
                System.out.println("Was found in " + counter + " steps");
                return middleIndex;
            }

            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        System.out.println("Nothing was found. Steps: " + counter);
        return -1;
    }

}
