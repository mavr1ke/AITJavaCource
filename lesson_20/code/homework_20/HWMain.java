package homework_20;

import java.util.Arrays;

public class HWMain {
    public static void main(String[] args) {

        System.out.println("\n***Task 0***\n");
        System.out.println("Constant INCREASE: " + DogV3.INCREASE);
        DogV3 dog = new DogV3("Rax", 153);
        DogV3 dog1 = new DogV3("Max", 100);

        int[] barriers = {120, 180, 160, 280, 350, 50, 304};
        int countBarriers = 0;
        for (int barrier : barriers) {
            if (dog.getBarrier(barrier)) {
                countBarriers++;
            }
        }
        System.out.println("\nCount of jumped over barriers by " + dog.getName() + ": " + countBarriers +"\n");

        countBarriers = 0;
        for (int barrier : barriers) {
            if (dog1.getBarrier(barrier)) {
                countBarriers++;
            }
        }
        System.out.println("\nCount of jumped over barriers by " + dog1.getName() + ": " + countBarriers);

        DogV3.ShowBarrierCount();

        System.out.println("\n***Task 1***\n");
        RubberArray rubberArray = new RubberArray();

        rubberArray.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Size of array: " + rubberArray.length());
        System.out.println("Real size of array: " + rubberArray.size());
        System.out.println("\nArray:");
        rubberArray.printArray();
        System.out.println("Full array:");
        rubberArray.printFullArray();

        System.out.println("Method toArray: " + Arrays.toString(rubberArray.toArray()));

        System.out.println("MULTIPLIER constant: " + RubberArray.MULTIPLIER);

        System.out.println("\nArray after del by index 2:");
        rubberArray.deleteByIndex(2);
        rubberArray.printArray();

        System.out.println("Sum of array: " + rubberArray.sumOfValues());
        System.out.println("Min in array: " + rubberArray.min());
        System.out.println("Max in array: " + rubberArray.max());

    }
}
