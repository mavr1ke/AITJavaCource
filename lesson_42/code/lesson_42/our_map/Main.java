package lesson_42.our_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Product> productsByName = new HashMap<>();
        Product computer = new Product("Computer", "Computer can calculate fast");
        Product tv = new Product("TV", "TV can show shows");
        Product printer = new Product("Printer", "Printer can print something");

        productsByName.put(computer.getName(), computer);
        productsByName.put(tv.getName(), tv);
        productsByName.put(printer.getName(), printer);

        System.out.println(productsByName);

        Product product = productsByName.get("Printer");
        System.out.println(product);
        System.out.println(productsByName.get("Mouse"));

        Product mouse = new Product("Mouse", "This is a mouse");
        productsByName.put("Printer", mouse);

        System.out.println(productsByName);

        productsByName.remove("Printer");
        System.out.println(productsByName);

        System.out.println(productsByName.containsKey("Printer"));
        System.out.println(productsByName.containsValue(computer));

        System.out.println("\n******************************");
        System.out.println("Print with key set");
        for (String key : productsByName.keySet()) {
            Product p = productsByName.get(key);
            System.out.println(key + ":" + p);
        }
        System.out.println("\nPrint with entry set");
        for (Map.Entry<String, Product> entry : productsByName.entrySet()) {
            String key = entry.getKey();
            Product pr = entry.getValue();
            System.out.println(key + ":" + pr);
        }
        System.out.println("\nPrint with method.values and list");
        List<Product> products = new ArrayList<>(productsByName.values());
        System.out.println(products);

        System.out.println("\nPrint with method.forEach");
        productsByName.forEach((key, value) -> System.out.println(key + ":" + value));

        Product car = new Product("Car", "can drive");
        System.out.println("Without gerOrDefault");
        System.out.println(productsByName.containsKey("Computer") ? productsByName.get("Computer") : car);

        System.out.println("With gerOrDefault");
        System.out.println(productsByName.getOrDefault("Car", car));

        System.out.println("\n*****************************************************");
        Map<Product, Integer> priceByProduct = new HashMap<>();
        priceByProduct.put(computer, 1000);
        priceByProduct.put(tv, 600);
        priceByProduct.put(printer, 200);

        System.out.println(priceByProduct);
    }
}
