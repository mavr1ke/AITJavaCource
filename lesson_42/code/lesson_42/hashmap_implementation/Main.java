package lesson_42.hashmap_implementation;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        for(int i = 1; i <= 43; i++) {
//            System.out.println(i % 10);
//        }

        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"aa");
        newMap.put(2,"cc");
        newMap.put(1,"bb");

        System.out.println(newMap.size());
        System.out.println(newMap.get(1));
        System.out.println(newMap.get(2));
        System.out.println(newMap.get(3));

        System.out.println(newMap.remove(1));
        System.out.println(newMap.contains(9));
        System.out.println(newMap.contains(1));

        System.out.println(newMap.get(1));
        System.out.println(newMap.get(3));

    //        Map<Integer,Integer> map = new HashMap<>();
    //        map.put(2,34);
    //        System.out.println(map.get(1));
    }
}
