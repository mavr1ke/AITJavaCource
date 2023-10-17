package homework_64.practice_2Dim;

public class Main {
    /*
    Написать метод, находящий сумму всех значений заданного подмассива двумерного массива целых чисел.
    public int findSumOfNSubArray( int[][]ints, int n)
    */

    public static int findSumOfNSubArray(int[][] ints, int n) {
        int sum = 0;
        int[] subArray = ints[n];
        for (int value : subArray) {
            sum += value;
        }
        return sum;
    }

    /*
    Написать метод, принимающий двумерный массив целых чисел и  выводящий на экран номер строки (подмассива),
    сумма всех элементов которого рана нулю
    int[][] table = { {1,4,-5},{-1,-1,-1,2,1},{-1,10}} -> 0,1
    */

    public static void findSubArraySumZero(int[][] ints) {
        System.out.print("\nIndexes of sub-arrays that have sum zero: ");
        for (int i = 0; i < ints.length; i++) {
            int sum = 0;
            for (int j = 0; j < ints[i].length; j++) {
                sum += ints[i][j];
            }
            if (sum == 0) {
                System.out.print(i + "\t");
            }
        }
    }

    /*
    Написать метод, принимающий двумерный массив и возвращающий количество строк( подмассивов), в которых
    нет отрицательных элементов
    int[][] table = { {1,4,5},{-1,-1,-1,2,1},{-1,10}} -> 1
    */

    public static int countSubArraysWithoutNegativeElem(int[][] ints) {
        int count = 0;

        for (int[] row : ints) {
            boolean hasNegative = true;
            for (int element : row) {
                if (element < 0) {
                    hasNegative = false;
                    break;
                }
            }
            if (hasNegative) {
                count++;
            }
        }
        return count;
    }

//    public static int countSubArraysWithoutNegativeElemWithMarker(int[][] ints) {
//        int count = 0;
//        outerFor:
//        for (int[] row : ints) {
//            for (int element : row) {
//                if (element < 0) {
//                    continue outerFor;
//                }
//            }
//            count++;
//        }
//        return count;
//    }

    /*
    Написать метод, принимающий двумерный массив целых чисел и возвращающий количество четных чисел в нем
    int[][] table = { {3,4,5},{6,7},{3,10}} -> 3
    */

    public static int amountOfEvenNumbersInArray(int[][] ints) {
        int count = 0;
        for (int[] row : ints) {
            for (int element : row) {
                if (element % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                {11, 22, 23},
                {44, 55},
                {77, 88, 99, 20, 30}
        };

        int n = 2;

        System.out.println("\nSum of sub-array 2: " + findSumOfNSubArray(arr1, n));

        int[][] arr2 = {
                {1, 4, -5},
                {-1, -1, -1, 2, 1},
                {-1, 10}
        };

        findSubArraySumZero(arr2);

        int[][] arr3 = {
                {1, 4, 5},
                {-1, -1, -1, 2, 1},
                {1, 10}
        };

        System.out.println("\n\nAmount of sub-arrays without negative elements: " + countSubArraysWithoutNegativeElem(arr3));

        int[][] arr4 = {
                {3, 4, 5},
                {6, 7},
                {3, 10}
        };

        System.out.println("\nAmount of even numbers in array: " + amountOfEvenNumbersInArray(arr4));

    }
}
