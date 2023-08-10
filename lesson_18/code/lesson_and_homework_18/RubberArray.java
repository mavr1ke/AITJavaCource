package lesson_and_homework_18;

import java.util.Arrays;

public class RubberArray {

    int[] array;

    public RubberArray() {
        this.array = new int[0];
    }

    public RubberArray(int[] array) {
        this.array = array;
    }

    public void add(int value) {
        extractArray();
        array[array.length - 1] = value;
    }

    public void add(int... ints) { // принимает произвольное количество аргуметов типа int
        for (int value : ints) {
            add(value);
        }
    }

    public void extractArray() {
        array = Arrays.copyOf(array, array.length + 1);
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]\n");
    }

    public int size() {
        return array.length;
    }

    public int sumOfValues() {
        int sum = 0;
        for (int value : array) {
            sum += value;
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
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public int max() {
        if (array.length == 0) return Integer.MAX_VALUE;

        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int[] toArray() {
        return Arrays.copyOf(array, array.length);
    }


    public int searchByIndex(int index) {
        if (index < array.length && index >= 0) {
            return array[index];
        } else {
            return -1;
        }
    }

    public int searchByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void deleteByIndex(int index) {
        if (array.length >= 1 && index >= 0 && index < array.length) {
            int[] result = new int[array.length - 1];
            for (int i = 0; i < result.length; i++) {
                if (i < index) {
                    result[i] = array[i];
                } else {
                    result[i] = array[i + 1];
                }
            }
//            System.out.println("Result: " + result);
            array = result;
        }
    }

    public void deleteByValue(int value) {
        int delIndex = searchByValue(value);
        if (delIndex >= 0) {
            deleteByIndex(delIndex);
        }
    }

    public void replaceByIndex(int index, int newValue) {
        if (index >= 0 && index < array.length) {
            array[index] = newValue;
        }
    }

    public void replaceByValue(int oldValue, int newValue) {
        int replaceIndex = searchByValue(oldValue);
        if (replaceIndex >= 0) {
            replaceByIndex(replaceIndex,newValue);
        }
    }
}
