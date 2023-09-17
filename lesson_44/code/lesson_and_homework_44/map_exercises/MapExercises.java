package lesson_and_homework_44.map_exercises;

import java.util.*;

public class MapExercises {

    /*
    Пусть есть лист имен, где некоторые имена повторяются. Написать метод принимающий этот лист и имя, возвращающий
    сколько раз это имя встречается в листе
    Пример: [John, John, Bill, Ann, Ann] John -> 2
    */

    public static int nameToNumberOccurrence(List<String> names, String name) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : names) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        return map.getOrDefault(name, 0);
    }

    /*
    Пусть есть лист имен и их анаграмм. Написать метод, принимающий этот лист  и имя, по которому он возвращает список
    всех его анаграмм, включая само имя
    [john, ann, bill, nan, nna, llbi, ohnj],ann -> [ann,nan,nna]
    List<String> findAnagrams( String str, List<String>strings).
    Решение с помощью мапы.
    */

    public static List<String> findNameAndAnagrams(List<String> names, String name){
        Map<String, String> map = new LinkedHashMap<>();
        String sortedInputName = sortChars(name);

        for (String str : names) {
            String sortedName = sortChars(str);
            map.put(str, sortedName);
        }

        Map<String, String> result = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(sortedInputName)) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return new ArrayList<>(result.keySet());
    }

    public static List<String> findNameAndAnagramsV2(List<String> strings, String str){

        Map<String,List<String>> anagrams = new HashMap<>();

        for (String s : strings) {
            String sortedKey = sortChars(s);

            List<String> value;
            if(anagrams.containsKey(sortedKey))  {
                value = anagrams.get(sortedKey);
            } else {
                value = new ArrayList<>();
            }
            value.add(s);
            anagrams.put(sortedKey,value);
        }
        return anagrams.getOrDefault(sortChars(str),List.of());
    }

    private static String sortChars(String str) {
        char[] nameChars = str.toCharArray();
        Arrays.sort(nameChars);
        return new String(nameChars);
    }
}
