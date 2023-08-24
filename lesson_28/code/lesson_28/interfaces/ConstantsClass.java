package lesson_28.interfaces;

public class ConstantsClass implements InterfaceConstants{

    public static void main(String[] args) {
        int[] ints = new int[MAX];

        for (int i = MIN; i < 11; i++) {
            if (i == MAX) {
                System.out.println(ERROR);
            } else {
                ints[i] = i;
                System.out.print(ints[i] + " ");
            }
        }
    }
}
