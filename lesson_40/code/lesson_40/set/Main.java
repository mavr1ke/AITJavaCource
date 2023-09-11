package lesson_40.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> hSet = new HashSet<>();
        HashSet<String> hashSet = new HashSet<>();

        System.out.println(hashSet.add("aa"));
        hashSet.add("bb");
        hashSet.add("cc");
        hashSet.add("dd");

        System.out.println(hashSet);

        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println(hashSet.add("aa"));
        System.out.println(hashSet.add("bb"));
        System.out.println(hashSet);

        hashSet.remove("bb");
        System.out.println(hashSet);

        System.out.println(hashSet.size());

        System.out.println(hashSet.contains("aa"));

        System.out.println(hashSet.isEmpty());

        Iterator<String> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<String> setNames = new HashSet<>();
        setNames.add("John");
        setNames.add("Jack");
        setNames.add("Ann");
        setNames.add("Bill");
        System.out.println(setNames);

        Set<String> linkedSetNames = new LinkedHashSet<>();
        linkedSetNames.add("John");
        linkedSetNames.add("Jack");
        linkedSetNames.add("Ann");
        linkedSetNames.add("Bill");
        System.out.println(linkedSetNames);

        Set<String> treeSetNames = new TreeSet<>();
        treeSetNames.add("John");
        treeSetNames.add("Jack");
        treeSetNames.add("Ann");
        treeSetNames.add("Bill");
        System.out.println(treeSetNames);
        System.out.println("*****************************");

        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        System.out.println(setA);

        Set<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(4);
        setB.add(6);
        setB.add(8);
        System.out.println(setB);

//        intersection

        Set<Integer> intersectionSet = new HashSet<>(setA);
        intersectionSet.retainAll(setB);
        System.out.println("intersection\n" + intersectionSet);

//        union

        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
        System.out.println("union\n" + unionSet);

//        relative compliment

        Set<Integer> relativeComplimentSet = new HashSet<>(setA);
        relativeComplimentSet.removeAll(setB);
        System.out.println("relative compliment\n" + relativeComplimentSet);


    }
}
