package homework_36;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HWMain {

    public static List<String> isMatch(List<Integer> list1,
                                       List<Integer> list2) {
        if (list1 == null || list2 == null) {
            throw new IllegalArgumentException("Списки не должны быть null");
        }
        if (list1.size() != list2.size()) {
            throw new IllegalArgumentException("Списки должны быть одинаковой длины");
        }

        List<String> yesOrNoArray = new ArrayList<>(list1.size());

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {
                yesOrNoArray.add("Yes");
            } else {
                yesOrNoArray.add("No");
            }
        }
        return yesOrNoArray;
    }

    public static List<Integer> deleteBiggerNumbers(List<Integer> list, int number) {
        if (list == null) {
            throw new IllegalArgumentException("Список не должен быть null");
        }
        Iterator<Integer> ourIterator = list.iterator();

        while (ourIterator.hasNext()) {
            if (ourIterator.next() > number) {
                ourIterator.remove();
            }
        }
        return list;
    }
}
