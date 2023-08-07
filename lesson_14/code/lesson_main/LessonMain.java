package lesson_main;

import java.util.Arrays;
import java.util.Random;

public class LessonMain {
    public static void main(String[] args) {
        /*Написать метод возвращающий массив целых чисел, заданной длины.
          Массив должен быть заполнен случайными числами.
          Перегрузка. Диапозон случайных  чисел, может быть задан вторым параметром вызова метода.
         */
        System.out.println(Arrays.toString(randomArrayMethod(0 ,0)));
        System.out.println(Arrays.toString(randomArrayMethod(0)));

    }
    public static int[] randomArrayMethod(int size, int bound) {
        int boundDefault = 100;
        if (size < 0) return new int[0];
        if (bound <= 0) {
            bound = boundDefault;
        }
        int[] randomArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(bound);
        }
        return randomArray;
    }

    public static int[] randomArrayMethod(int size) {
        int boundDefault = 100;
        return randomArrayMethod(size,boundDefault);
    }
}
