package homework_40;

import java.util.*;

public class HWMain {

        /*
         С помощью множеств реализовать метод, который принимает лист имен и возвращает лист без повторяющихся элементов
        */

    public static List<String> deleteRepeatingElements(List<String> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        Set<String> linkedHashSetNames = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(linkedHashSetNames);
        return list;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        String[] arrayOfNames = {"Bill", "Jack", "John", "Bill", "Ann"};
        Collections.addAll(names, arrayOfNames);
        System.out.println(names);
        System.out.println(HWMain.deleteRepeatingElements(names));
    }
}
