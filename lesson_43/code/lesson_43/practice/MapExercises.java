package lesson_43.practice;

import java.util.Map;

public class MapExercises {

    /*Дана Map<String> map, написать метод который вернет мапу, такую что если в исходной мапе есть,
     ключи "a" и "b" то нужно создрать новый ключ "ab" и в качестве значения для него должна быть сумма значеий
     ключей a и b.
     Если нет то ничего в мапе не менять

     Примеры:
     mapAB {
     */

    public static Map<String, String> findKeysAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab",map.get("a").concat(map.get("b")));
        }
        return map;
    }
}
