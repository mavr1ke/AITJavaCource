package lesson_43.other_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Map<Integer,String> ourLinkedMap = new LinkedHashMap<>();
        ourLinkedMap.put(23,"bbb");
        ourLinkedMap.put(2,"q");
        ourLinkedMap.put(15,"bb");
        ourLinkedMap.put(1,"aaa");

        System.out.println(ourLinkedMap);
    }
}
