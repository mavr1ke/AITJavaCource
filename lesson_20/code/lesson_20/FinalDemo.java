package lesson_20;

public class FinalDemo {
    public static void main(String[] args) {
        final int x;

        final int[] ints = {0,23,523,532,4};

        x = 5;

        ints[0] = 0;
        ints[1] = 1;
        ints[0] = 5;
        ints[1] = ints[0] + 15;
        

    }
}
