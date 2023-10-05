package lesson_57.predefined_func_interfaces;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = num -> num > 0;
        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(-10));

        UnaryOperator<Integer> unaryOperator = num -> num / 2;
        System.out.println(unaryOperator.apply(4));

        Function<Integer, String> function = String::valueOf;
        System.out.println(function.apply(10));

        Function<Integer, String> function1 = num -> num + " times";

        BinaryOperator<Integer> sum = Integer::sum;
        System.out.println(sum.apply(1, 2));

        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");

        /*
        Supplier<T> - не принимает ничего, возращает обьект типа Т
        его метод T get()
        TODO: придумать пример
        */

        /*
        BiFunction<T,U,R> - принимает параметры типа T,U , возращает обьект типа R
        метод apply
        */
//        BiFunction<Integer,Integer,Integer> biFunction = Integer::sum;
//        TODO: придумать пример

        Predicate<Integer> age18 = num -> num > 18;
        Predicate<Integer> age80 = num -> num < 80;
        System.out.println(age18.and(age80).test(12));
        System.out.println(age18.and(age80).test(40));
        System.out.println(age18.and(age80).test(90));
    }
}
