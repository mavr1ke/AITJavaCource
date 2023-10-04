package lesson_56.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int height = 1000;

//        Flyable f = new Flyable(){
//            public void fly() {
//                System.out.println("Flying at " + height);
//            }
//        };
//
//        f.fly();

        Flyable fLambda = () -> System.out.println("We are flying at " + height);
        fLambda.fly();

        Walkable w = () -> "I can walk";

        System.out.println(w.walk());

        Eatable e = food -> "A man can eat " + food;

        System.out.println(e.eat("apple"));

        Summable s = (i, j) -> i + j;
        System.out.println(s.sum(1, 2));

        List<String> fruits = new ArrayList<>();
        fruits.add("Lemon");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Kiwi");

        fruits.forEach(
                fruit -> System.out.println(fruit)
        );

        List<Product> items = new ArrayList<>();
        items.add(new Product("mouse", 25));
        items.add(new Product("laptop", 1000));
        items.add(new Product("keyboard", 75));

        Collections.sort(items, (p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println(items);
        Collections.sort(items, (p1, p2) -> p1.price - p2.price);
        System.out.println(items);

        Operational<Integer> op1 = (a, b) -> a + b;
        System.out.println(op1.calc(1, 2));

        Operational<String> op2 = (a, b) -> a + b;
        System.out.println(op2.calc("1", "2"));

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        IsMoreThan isMoreThan = num -> num > 3;
        System.out.println(isMoreThan.isMore(2));
        System.out.println(isMoreThan.isMore(5));

//        isMoreThan = num -> num > 10;
//        System.out.println(isMoreThan.isMore(9));
//        System.out.println(isMoreThan.isMore(50));

        System.out.println(sumIfCondition(numbers, isMoreThan));
    }

    public static int sumIfCondition(int[] ints, IsMoreThan exp) {
        int sum = 0;
        for (int elt : ints) {
            if (exp.isMore(elt)) {
                sum += elt;
            }
        }
        return sum;
    }
}
