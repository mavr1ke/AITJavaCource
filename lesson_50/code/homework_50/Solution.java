package homework_50;

import java.util.ArrayDeque;

public class Solution {

    /*В ресторан периодически попадает заказ. У заказа есть время, когда он был сделан ( milliseconds ).
    Для каждого заказа нужно определить количество заказов, сделанных за N  минут до него.
    @param orderTimes -  массив отсортированных по времени моментов, когда происходили заказы
    @param minutes
    @return  для соответствующего заказа возвращает количество заказов, сделанных в предыдущие minutes минут
    public countOrdersNumber(long[] orderTimes , int minutes)

    long[] orderTimes ={1_000_000, 1_200_000, 1_250_000, 1_300_000, 1_600_000, 1_700_000, 1_800_000, 1_850_000, 1_890_000}
    minutes = 5 min
    millis = 5 *60 *1000 = 300 000
    int[] result =    {0, 1, 2, 3, 1, 1, 2, 3, 4}

    написать метод с использованием двусторонней очереди*/

    public static int[] countOrdersNumber(long[] orderTimes, int minutes) {
        int[] result = new int[orderTimes.length];
        long millis = (long) minutes * 60 * 1000;
        ArrayDeque<Long> queue = new ArrayDeque<>();

        for (int i = 0; i < orderTimes.length; i++) {
            long currentTime = orderTimes[i];

            while (!queue.isEmpty() && queue.peekFirst() < currentTime - millis) {
                queue.pollFirst();
            }

            result[i] = queue.size();
            queue.offerLast(currentTime);
        }

        return result;
    }
    public static void main(String[] args) {
        long[] orderTimes = {1_000_000, 1_200_000, 1_250_000, 1_300_000, 1_600_000, 1_700_000, 1_800_000, 1_850_000, 1_890_000};
        int minutes = 5;
        int[] result = countOrdersNumber(orderTimes, minutes);

        for (int count : result) {
            System.out.print(count + " ");
        }
    }
}
