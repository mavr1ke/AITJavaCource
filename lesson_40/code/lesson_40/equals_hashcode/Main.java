package lesson_40.equals_hashcode;

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order(1,"order1");
        Order o2 = new Order(1,"order1");
        Order o3 = new Order(1,"order2");
        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.hashCode());
    }
}
