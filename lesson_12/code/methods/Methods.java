package methods;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

//        powMethod(3);

//       int resultFromMethod = powIntMethod(3);
//        System.out.println(resultFromMethod);

//        int squareInt = squareMethod(5);
//        System.out.println(squareInt);
//        double squareDouble = squareMethod(2.5);
//        System.out.println(squareDouble);

        int[] array = {1,4,5,-10,8};
        System.out.println(Arrays.toString(array));
        //array = null;
        int minArrayIndex = minArrayInt(array);
        System.out.println("index of min in array: " +minArrayIndex);
        System.out.println("Min in array: " + (minArrayIndex != -1 ? array[minArrayIndex] : ""));
    }

    public static void powMethod(int x) {
        if (x >= 0) {
            int answer = 1;
            for (int i = 0; i < x; i++) {
                answer *= 2;
            }
            System.out.println("2^" + x + " = " + answer);
        } else {
            System.out.println("Аргумент меньше 0");
        }
    }

    public static int powIntMethod(int x) {
        int result = 1;
        if (x >= 0) {
            for (int i = 0; i < x; i++) {
                result *= 2;
            }
        } else {
            System.out.println("(╮°-°)╮.... \n(╮°-°)╮┳━━┳ ....\n ( ╯°□°)╯彡 ┻━━┻");
        }
        return result;
    }

    public static int squareMethod(double x) {
        return (int) (x * x);
    }

    public static int squareMethod(int x) {
        return x * x;
    }

    public static int minArrayInt(int[] array) {
        if (array != null) {
            int minIndex = 0;
            int min = array[0];
//            for (int value : array) {
//                if (value < min) {
//                    min = value;
//                }
//            }
            for (int i= 0; i < array.length - 1; i++) {
                if (array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }
            }
            return minIndex;
        } else {
                return -1;
        }
    }

    public static boolean isNumberInArray(int[] array,int x) {
        if (array == null) return false;
        for (int value : array) {
            if (value == x) {
                return true;
            }
        }
        return false;
    }

    public static int searchNumberInArray(int[] array, int num) {
        if (array == null) return -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
