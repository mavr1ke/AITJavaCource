package lesson_41.our_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> ourMap = new HashMap<>();
        ourMap.put(1200, "Notebook");
        ourMap.put(10, "Mouse");
        ourMap.put(500, "TV");
        ourMap.put(130, "Printer");

        System.out.println(ourMap);

        ourMap.put(10, "Clock");

        System.out.println(ourMap);

        ourMap.remove(10);

        System.out.println(ourMap);

        System.out.println(ourMap.get(500));

        System.out.println(ourMap.size());

        System.out.println(ourMap.containsKey(500));
        System.out.println(ourMap.containsKey(550));

        System.out.println(ourMap.containsValue("TV"));
        System.out.println(ourMap.containsValue("Clock"));

        System.out.println(ourMap.keySet());

        Set<Integer> mapKeySet = ourMap.keySet();
        System.out.println(mapKeySet);
    }
}
