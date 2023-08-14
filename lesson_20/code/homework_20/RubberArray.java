package homework_20;

import java.util.Arrays;

public class RubberArray {

    private int[] array;

    int cursor;

    public static final int MULTIPLIER = 2;

    public RubberArray() {
        this.array = new int[10];
        cursor = 0;
    }

    public RubberArray(int[] array) {
        this();
        add(array);
    }

    public void add(int value) {
        if (isArrayFull()) {
            extractArray();
        }
        array[cursor] = value;
        cursor++;
    }

    public void add(int... ints) { // принимает произвольное количество аргуметов типа int
        for (int value : ints) {
            add(value);
        }
    }

    private boolean isArrayFull() {
        return  cursor == array.length - 1;
    }

    private void extractArray() {
        array = Arrays.copyOf(array, array.length * MULTIPLIER);
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < cursor; i++) {
            System.out.print(array[i]);
            if (i < cursor - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]\n");
    }

    public void printFullArray() { // вывести в консоль весь массив
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]\n");
    }

    public int size() {
        return cursor;
    }

    public int length() {
        return array.length;
    }

    public int sumOfValues() {
        int sum = 0;
        for (int i = 0; i < cursor; i++) {
            sum += array[i];
        }
        return sum;
    }

    public double averageOfValues() {
        if (array.length == 0) return Double.MIN_VALUE;
        return (double) sumOfValues() / size();
    }

    public int min() {
        if (array.length == 0) return Integer.MIN_VALUE;

        int min = array[0];
        for (int i = 0; i < cursor; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max() {
        if (array.length == 0) return Integer.MAX_VALUE;

        int max = array[0];
        for (int i = 0; i < cursor; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int[] toArray() {
        return Arrays.copyOf(array, cursor);
    }


    public int searchByIndex(int index) {
        if (index < array.length && index >= 0) {
            return array[index];
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public int searchByValue(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void deleteByIndex(int index) {
        if (cursor >= 1 && index >= 0 && index < cursor) {
//            int[] result = new int[array.length - 1];
            for (int i = index; i < cursor; i++) {
                array[i] = array[i + 1];
            }
//            System.out.println("Result: " + result);
            cursor--;
        }
    }

    public boolean deleteByValue(int value) {
        int delIndex = searchByValue(value);
        if (delIndex >= 0) {
            deleteByIndex(delIndex);
            return true;
        }
        return false;
    }

    public int deleteAllByValue(int value) {
        int count = 0;
        while (deleteByValue(value)) {
            count++;
        }
        return count;
    }

    public void replaceByIndex(int index, int newValue) {
        if (index >= 0 && index < cursor) {
            array[index] = newValue;
        }
    }

    public void replaceByValue(int oldValue, int newValue) {
        int replaceIndex = searchByValue(oldValue);
        if (replaceIndex >= 0) {
            replaceByIndex(replaceIndex, newValue);
        }
    }
}
