package loopfor;

public class LoopFor {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            System.out.print(i + " ");
//        }

        for (int i = 5; i <= 20; i++) {
            System.out.print(i + " ");
        }

        int[] array = {5, 546, 0};
        int forSearch = 546;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == forSearch) {
                System.out.println(i);
            }
        }
    }
}
