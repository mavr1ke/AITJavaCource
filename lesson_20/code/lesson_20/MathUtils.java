package lesson_20;

public class MathUtils {
    public static int sumOfInts(int x, int... ints) {
        int sum = x;
        for(int num : ints) {
            sum += num;
        }
        return sum;
    }
}
