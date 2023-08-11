package lesson_19;

public class RaTestMain {
    public static void main(String[] args) {

        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        RubberArray rubberArray = new RubberArray(ints);

        System.out.println(rubberArray.deleteByValue(5));
        rubberArray.printArray();
        rubberArray.add(7,8,7);
        rubberArray.printArray();
        rubberArray.deleteAllByValue(7);
        rubberArray.printArray();
    }
}
