package homework_40;

import java.util.*;

public class HWMain {

//  С помощью множеств реализовать метод, который принимает лист имен и возвращает лист без повторяющихся элементов

    public static List<String> deleteRepeatingElements(List<String> list) {
        Set<String> linkedHashSetNames = new LinkedHashSet<>(list);
        return new ArrayList<>(linkedHashSetNames);
    }

    public static void main(String[] args) {
        String[] arrayOfNames = {"Bill", "Jack", "John", "Bill", "Ann"};
        List<String> names = new ArrayList<>(Arrays.asList(arrayOfNames));
        System.out.println(names);
        System.out.println(HWMain.deleteRepeatingElements(names));
    }
}
