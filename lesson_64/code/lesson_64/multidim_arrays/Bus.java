package lesson_64.multidim_arrays;

import java.util.Arrays;

public class Bus {
    public static void main(String[] args) {
        int[][] rides = new int[7][];
        rides[0] = new int[10];
        rides[1] = new int[10];
        rides[2] = new int[10];
        rides[3] = new int[10];
        rides[4] = new int[10];
        rides[5] = new int[2];
        rides[6] = new int[2];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                rides[i][j] = i + j + 10;
            }
        }

        for (int i = 5; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                rides[i][j] = i + j + 10;
            }
        }

        char[] days = {'M', 'T', 'W', 'T', 'F', 'S', 'S'};
        for (int i = 0; i < rides.length; i++) {
            System.out.print(days[i] + "\t");
            System.out.println(Arrays.toString(rides[i]));
        }

    }
}
