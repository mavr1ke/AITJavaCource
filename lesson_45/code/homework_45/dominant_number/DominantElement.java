package homework_45.dominant_number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DominantElement {

    public static void main(String[] args) {
        DominantElement dominantElement = new DominantElement();
        int[] array = {7,7,6,6,7};
        System.out.println(Arrays.toString(array));
        System.out.println("Method 1:" + dominantElement.findDominant(array));
        System.out.println("Method 2:" + dominantElement.findDominantMerge(array));
    }

    public int findDominant(int[] ints) {
        Map<Integer, Integer> occurrencesByNumber = new HashMap<>();
        for (int number : ints) {
            if (occurrencesByNumber.containsKey(number)) {
                occurrencesByNumber.put(number, occurrencesByNumber.get(number) + 1);
            } else occurrencesByNumber.put(number, 1);
        }
        for (int key : occurrencesByNumber.keySet()) {
            if (occurrencesByNumber.get(key) > ints.length / 2) {
                return key;
            }
        }
        return -1;
    }

    public int findDominantMerge(int[] ints) {
        Map<Integer, Integer> occurrencesByNumber = new HashMap<>();

        for (int i : ints) {
           int res = occurrencesByNumber.merge(i, 1, (oldValue, newValue) -> oldValue + 1);
           if (res > ints.length/2) {
               return i;
           }
        }
        return -1;
    }
}
