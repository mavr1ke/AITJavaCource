package homework_37;

import java.util.Arrays;
import java.util.List;

public class HWMain {

    public static String shortestOrLongestString(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List of strings is empty");
        }
        int maxIndex = 0, minIndex = 0;

        String max = list.get(0);
        String min = list.get(0);

        for (String str : list) {
            if (str.length() > max.length()) {
                max = str;
                maxIndex = list.indexOf(str);
            } else if (str.length() < min.length()) {
                min = str;
                minIndex = list.indexOf(str);
            }
        }

        return list.get(Math.min(maxIndex, minIndex));
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("One", "Two", "Three", "Fo", "Five");
        System.out.println(HWMain.shortestOrLongestString(list));

        List<String> testList1 = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        System.out.println(HWMain.shortestOrLongestString(testList1));

        List<String> testList2 = Arrays.asList("Red", "Green", "Blue", "Yellow");
        System.out.println(HWMain.shortestOrLongestString(testList2));
    }
}
