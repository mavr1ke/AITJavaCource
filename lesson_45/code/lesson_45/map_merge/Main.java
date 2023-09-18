package lesson_45.map_merge;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> prices = new HashMap<>();

        prices.put("Laptop", 1000);
        prices.put("TV", 500);
        prices.put("Mouse", 20);

        System.out.println(prices);

        prices.merge("Mobile", 300, (oldValue, newValue) -> oldValue + newValue);

        System.out.println(prices);

        prices.merge("Laptop", 500, (oldValue, newValue) -> oldValue + newValue);
        System.out.println(prices);

        HashMap<String, String> cities = new HashMap<>();
        cities.put("Berlin", "Germany");
        cities.put("London", "England");
        cities.put("Paris", "France");
        System.out.println("\nCapitals: ");
        System.out.println(cities);

        cities.merge("London", "GreatBritain", (oldValue, newValue) -> oldValue + "/" + newValue);
        cities.merge("Rome", "Italy", (oldValue, newValue) -> oldValue + "/" + newValue);

        System.out.println("Cities changed:");
        System.out.println(cities);

        HashMap<String,Integer> prices1 = new HashMap<>();
        prices1.put("Notebook", 500);
        prices1.put("Scanner", 350);

        HashMap<String,Integer> prices2 = new HashMap<>();
        prices2.put("TV", 700);
        prices2.put("Scanner", 310);

        prices2.forEach((key,value) -> prices1.merge(key,value, (oldValue,newValue) -> {
            if (oldValue < newValue) {
                return oldValue;
            } else {
                return newValue;
            }
        }));

        System.out.println("\nMerged map:");
        prices1.forEach((key,value) -> System.out.println("key: " + key + " value: " + value));
    }
}
