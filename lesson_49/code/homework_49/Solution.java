package homework_49;

import java.util.*;

public class Solution {

    /*
    Написать метод, принимающий упорядоченный лист целых чисел и целое число N и проверяющий есть ли в этом листе
    такие 2 числа что их произведение равно N. Метод в этом случае возвращает true иначе false
    {2,5,18,70}, 36 -> true
    {2,5,18,70}, 40 -> false

    {37,38,48,23}, 36 -> false

    Решить задачу двумя способами :
    1. без вложенных циклов и без использования коллекций
    2. С использованием ArrayDeque
    */

    public static boolean multiplyTwoElementEqualsN(List<Integer> list, int n) {
//        Collections.sort(list);
        if (list.get(0) > n ||
                list.get(list.size() - 1) < n / list.get(0)) {
            return false;
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) * list.get(i) == n) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean multiplyTwoElementEqualsNV2(List<Integer> list, int n) {
//        Collections.sort(list);
        if (list.get(0) > n ||
                list.get(list.size() - 1) < n / list.get(0)) {
            return false;
        }

        for (int i = 0; i < list.size(); i++) {
            if (n % list.get(i) == 0 && list.contains(n / list.get(i))) {
                return true;
            }
        }
        return false;
    }


    public static boolean multiplyTwoElementEqualsNV3(List<Integer> list, int n) {
//        Collections.sort(list);
        if (list.get(0) > n ||
                list.get(list.size() - 1) < n / list.get(0)) {
            return false;
        }

        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            int result = list.get(i) * list.get(j);
            if (result < n) {
                i++;
            } else if (result > n) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean multiplyTwoElementEqualsNV4(List<Integer> list, int n) {
//        Collections.sort(list);

        Deque<Integer> deque = new ArrayDeque<>(list);

        while (!deque.isEmpty()) {
            int first = deque.peekFirst();
            int last = deque.peekLast();

            if (first > n || last < n / first) {
                return false;
            }
            if (first * last == n) {
                return true;
            } else if (first * last < n) {
                deque.pollFirst();
            } else {
                deque.pollLast();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> testArray = Arrays.asList(2, 5, 18, 70);

        System.out.println(multiplyTwoElementEqualsN(testArray, 36));
        System.out.println(multiplyTwoElementEqualsN(testArray, 40));

        System.out.println("***********");
        System.out.println(multiplyTwoElementEqualsNV2(testArray, 36));
        System.out.println(multiplyTwoElementEqualsNV2(testArray, 40));

        System.out.println("***********");
        System.out.println(multiplyTwoElementEqualsNV3(testArray, 36));
        System.out.println(multiplyTwoElementEqualsNV3(testArray, 40));

        System.out.println("***********");
        System.out.println(multiplyTwoElementEqualsNV4(testArray, 36));
        System.out.println(multiplyTwoElementEqualsNV4(testArray, 40));


    }
}
