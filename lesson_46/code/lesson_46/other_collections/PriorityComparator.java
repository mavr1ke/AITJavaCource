package lesson_46.other_collections;

import java.util.Comparator;

public class PriorityComparator implements Comparator<String> {

    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
