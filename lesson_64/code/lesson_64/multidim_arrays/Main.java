package lesson_64.multidim_arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[][] table = new int[10][20];

        int[][] arr = {
                {11, 22, 23},
                {44, 55, 66},
                {77, 88, 99}
        };

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        System.out.println("\nprint in cycle");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

//        int[][] num = new int[3][];
//        num[0] = new int[4];
//        num[1] = new int[4];
//        num[2] = new int[4];

        int[][] arr1 = {
                {11, 22, 23},
                {44, 55},
                {77, 88, 99, 20, 30}
        };

        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        System.out.println(arr1[1].length);
        System.out.println(arr1[2].length);

        print2Dim(arr1);
    }

    public static  void print2Dim(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
