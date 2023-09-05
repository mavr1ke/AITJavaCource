package lesson_36.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
//        List<String> names = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        names.add("John");
        System.out.println(names);
        names.add("Bill");
        System.out.println(names);

        names.add(1,"Mary");
        System.out.println(names);

        names.add(3,"Jack");
        System.out.println(names);

        List<String> listCapacity = new ArrayList<>(20);
        System.out.println(listCapacity);

        System.out.println(names.size());
        System.out.println(listCapacity.size());

        names.set(2,"Ann");
        System.out.println(names);

        System.out.println(names.get(0));
        System.out.println(names.get(names.size() - 1));
        System.out.println(names);

        names.remove("Mary");
        System.out.println(names);
        names.add(1, "Mary");
        System.out.println(names);
        System.out.println("Removing " + names.remove(1));
        System.out.println(names);

        ints.add(1);
        ints.add(12);
        ints.add(11);
            ints.add(15);
            ints.remove(Integer.valueOf(1));

        int position = names.indexOf("Ann");
        System.out.println(position);

        System.out.println(names.contains("Jack"));
        System.out.println(names.contains("Bill"));

        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }

        for (String name: names) {
            System.out.println(name);
        }

        Iterator<String> ourIterator = names.iterator();

        while (ourIterator.hasNext()) {
            if (ourIterator.next().equals("Ann")) {
                ourIterator.remove();
            }
            //System.out.println(ourIterator.next());
        }
        System.out.println(names);
    }
}
