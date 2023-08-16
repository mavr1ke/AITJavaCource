package homework_21;

public class ArraysUtilities {

    public static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    private static int minIndex(int[] array) {
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int minIndex(int[] array, int startIndex) {
        int minValue = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int minIndex(int[] array, int startIndex, int endIndex) {
        int minValue = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < endIndex; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int max(int[] array) {
        int maxValue = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int max(int[] array, int startIndex) {
        int maxValue = array[startIndex];
        int maxIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int max(int[] array, int startIndex, int endIndex) {
        int maxValue = array[startIndex];
        int maxIndex = startIndex;
        for (int i = startIndex; i < endIndex; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void sortSelection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;
        }
    }

    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0, middleIndex, countSteps = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            countSteps++;
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == searchValue) {
                System.out.println("Was found in " + countSteps + " steps");
                return middleIndex;
            }

            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        System.out.println("Nothing was found. Steps: " + countSteps);
        return -1;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length;i++) {
            System.out.print(array[i] + ((array.length - 1 > i) ? ", " : "]\n"));
        }
    }

    public static String toString(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length;i++) {
           result += array[i] + ((array.length - 1 > i) ? ", " : "]");
        }
        return result;
    }
}
