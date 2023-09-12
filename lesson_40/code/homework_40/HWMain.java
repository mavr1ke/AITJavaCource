package homework_40;

import java.util.*;

public class HWMain {

//  С помощью множеств реализовать метод, который принимает лист имен и возвращает лист без повторяющихся элементов

    public static List<String> deleteRepeatingElements(List<String> list) {
        Set<String> linkedHashSetNames = new LinkedHashSet<>(list);
        return new ArrayList<>(linkedHashSetNames);
    }

    public static List<String> getDuplicates(List<String> list) {
//        Set<String> linkedHashSet = new LinkedHashSet<>(list);
//        for (String string: linkedHashSet) {
//            list.remove(string);
//        }
//        linkedHashSet.clear();
//        linkedHashSet.addAll(list);

        Set<String> uniqueElements = new LinkedHashSet<>();
        Set<String> duplicateElements = new LinkedHashSet<>();

        for (String element : list) {
            if (!uniqueElements.add(element)) {
                duplicateElements.add(element);
            }
        }

        return new ArrayList<>(duplicateElements);
    }

    public static void main(String[] args) {
        String[] arrayOfNames = {"Bill", "Jack", "John", "Bill", "Ann", "Bill", "Ann", "Ann"};
        List<String> names = new ArrayList<>(Arrays.asList(arrayOfNames));
        System.out.println(names);
        System.out.println(HWMain.deleteRepeatingElements(names));
        System.out.println(HWMain.getDuplicates(names));
    }
}
