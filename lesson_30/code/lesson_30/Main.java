package lesson_30;

public class Main {

    public int findMax(int[] ints, int n) {
        int max = ints[0];
        for (int i = 0; i < n; i++) {
            if(ints[i] > max) {
                max = ints[i];
            }
        }
        return max;
    }

    public static void drawTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawTriangle(6);
    }
}
