package lesson_43.other_maps;

import java.util.*;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<Integer, String> ourTreeMap = new TreeMap<>();
        ourTreeMap.put(23, "Bbb");
        ourTreeMap.put(2, "aaa");
        ourTreeMap.put(1, "dd");
        ourTreeMap.put(118, "bbbrrr");
        ourTreeMap.put(100, "aaaaaaaaaaa");

        System.out.println(ourTreeMap);

        Set<Map.Entry<Integer, String>> set = ourTreeMap.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, String> me = it.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        Map<String, String> mapReverse = new TreeMap<>(Collections.reverseOrder());
        mapReverse.put("k1","Jack");
        mapReverse.put("k2","John");
        mapReverse.put("k3","Ann");
        mapReverse.put("k4","Bill");
        mapReverse.put("k5","Jill");

        System.out.println(mapReverse);
    }
}
