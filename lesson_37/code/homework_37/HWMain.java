package homework_37;

import java.util.LinkedList;
import java.util.ListIterator;

public class HWMain {

    public static String shortestOrLongestString(LinkedList<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List of strings is empty");
        }

        String shortest = list.getFirst();
        String longest = list.getFirst();

        ListIterator<String> iterator = list.listIterator();
        int index = 0, longestIndex = 0, shortestIndex = 0;

        while (iterator.hasNext()) {
            String current = iterator.next();
            if (current.length() > longest.length()) {
                longest = current;
                longestIndex = index;
            } else if (current.length() < shortest.length()) {
                shortest = current;
                shortestIndex = index;
            }
            index++;
        }

        return list.get(Math.min(longestIndex, shortestIndex));
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Fo");
        list.add("Five");

        System.out.println(HWMain.shortestOrLongestString(list));

        LinkedList<String> testList1 = new LinkedList<>();
        testList1.add("Apple");
        testList1.add("Banana");
        testList1.add("Cherry");
        testList1.add("Date");
        System.out.println(HWMain.shortestOrLongestString(testList1));

        LinkedList<String> testList2 = new LinkedList<>();
        testList2.add("Red");
        testList2.add("Green");
        testList2.add("Blue");
        testList2.add("Yellow");
        System.out.println(HWMain.shortestOrLongestString(testList2));
    }
}
