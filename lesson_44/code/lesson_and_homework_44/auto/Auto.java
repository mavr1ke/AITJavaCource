package lesson_and_homework_44.auto;

import java.util.*;

public class Auto implements Comparable<Auto>{

    /*
   Есть класс автомобиль, в котором есть три поля: Марка, Модель, Цена. Написать метод, который принимает
   лист автомобилей, а возвращает TreeMap,  ключами которого являются марки автомобилей, а значениями TreeSet
   автомобилей, в котором автомобили расположены в лексикографическом порядке относительно модели, причем дешевые вперед если
   модели одинаковые.
   public Map<String, Set<Auto>> autoByMake( List<Auto> autos)


   BMW
   make BMW
   model BMWModel1
   price 100 000

   make BMW
   model BMWModel2
   price 150 000

   BMW = [ {make = BMW, model = BMWModel1, price 100000},{make = BMW, model = BMWModel2, price 100000}]

   Map<

    */

    private final String brand;
    private final String model;
    private final double price;

    public Auto(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public static Map<String, Set<Auto>> autoByBrand(List<Auto> autos) {
        Map<String, Set<Auto>> mapAuto = new TreeMap<>();

        for (Auto auto : autos) {
            String brand = auto.getBrand();
            Set<Auto> setAuto = mapAuto.getOrDefault(brand, new TreeSet<>());
            setAuto.add(auto);
            mapAuto.put(brand, setAuto);
        }
        return mapAuto;
    }

    @Override
    public int compareTo(Auto auto) {
        int modelCompare = this.model.compareTo(auto.getModel());

        if (modelCompare != 0) {
            return modelCompare;
        } else {
            return Double.compare(this.price,auto.getPrice());
        }

    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: " + price;
    }

    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>();
        autos.add(new Auto("BMW", "Model3", 25000.0));
        autos.add(new Auto("Audi", "A4", 30000.0));
        autos.add(new Auto("BMW", "Model2", 22000.0));
        autos.add(new Auto("Audi", "A3", 28000.0));
        autos.add(new Auto("BMW", "Model2", 20000.0));

        Map<String, Set<Auto>> autoByBrandMap = autoByBrand(autos);

        for (Map.Entry<String, Set<Auto>> entry : autoByBrandMap.entrySet()) {
            String brand = entry.getKey();
            Set<Auto> autosByBrand = entry.getValue();

            System.out.println("Brand: " + brand);
            for (Auto a : autosByBrand) {
                System.out.println("  " + a.toString());
            }
        }

    }
}
