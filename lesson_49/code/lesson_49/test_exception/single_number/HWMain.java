package lesson_49.test_exception.single_number;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class HWMain {

    public static int findSingleNumber(List<Integer> numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : numbers) {
            countMap.merge(num, 1, (oldValue, newValue) -> oldValue + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }

       // return -1;
        throw new NoSuchElementException();
    }
}
