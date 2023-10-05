package lesson_57.predefined_func_interfaces;

import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //  Встроенные функциональные интерфейсы
        // 1. Predicate ( предиката) - проверяет соблюдение некоторого условия. Возвращает true либо false  соответственно

    /* методом предикаты является метод
     public interface Predicate<T>{
            boolean test( T t)
    }
     */
        Predicate<Integer> isPositive = num -> num > 0;
        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(-10));
        // UnaryOperator<T> -  принимает обьект типа Т , что-то с ним делает  и возвращает обьект типа типа Т
        /*
        public interface UnaryOperator<T>{
               T apply( T obj)
        }
         */
        UnaryOperator<Integer> unaryOperator = num -> num / 2;
        System.out.println(unaryOperator.apply(4));
//      Function<T,R> -  преобразует обьект типа T  в обьект типа R
        /*
        Function<T,R>{
            R apply( T obj)
        }
         */
        Function<Integer, String> function = String::valueOf;
        System.out.println(function.apply(10));

        Function<Integer, String> function1 = num -> num + " times";
        System.out.println(function1.apply(2));
//      BinaryOperator<T> -  принимает два параметра типа T  , выполняет с ними операции и возвращает результат
        // типа T
        /*
         T apply ( T obj1, T obj2)
         */
        BinaryOperator<Integer> sum = Integer::sum;
        System.out.println(sum.apply(1, 2));
 /*
        Consumer<T> -  что-то делает с обьектом типа T , ничего не возвращает
         его метод accept( T t)
         */
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");

        /*
        Supplier<T> - не принимает ничего, возращает обьект типа Т
        его метод T get()
        */
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);
        System.out.println(randomSupplier.get());

        /*
        BiFunction<T,U,R> - принимает параметры типа T,U , возращает обьект типа R
        метод apply
        BiFunction<Integer,Integer,Integer> biFunction = Integer::sum;
        */
        BiFunction<Integer, Integer, Integer> sumFunction = Integer::sum;
        int result = sumFunction.apply(5, 7);
        System.out.println(result);

        Predicate<Integer> age18 = num -> num > 18;
        Predicate<Integer> age80 = num -> num < 80;
        System.out.println(age18.and(age80).test(12));
        System.out.println(age18.and(age80).test(40));
        System.out.println(age18.and(age80).test(90));

        Predicate<String> containsJava = str -> str.contains("Java");
        Predicate<String> containsHello = str -> str.contains("Hello");

        System.out.println(containsJava.or(containsHello).test("hello java"));
        System.out.println(containsJava.or(containsHello).test("java"));
        System.out.println(containsJava.or(containsHello).test("hello world"));
        System.out.println(containsJava.or(containsHello).test("world"));

        Predicate<Integer> age1 = num -> num > 18;
        System.out.println(age1.negate().test(19));
    }
}
