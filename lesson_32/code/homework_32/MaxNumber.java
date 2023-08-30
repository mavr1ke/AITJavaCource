package homework_32;

public class MaxNumber {

    public int findMax(int[] ints){
        if (ints.length == 0) return -1;

        int max = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if(ints[i] > max) {
                max = ints[i];
            }
        }
        return max;
    }
}
