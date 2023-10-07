package lesson_and_hw_58.practice;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Transformer {

        /*
        Написать метод, принимающий строку, состоящую из слов разделенных пробелом и два функциональных интерфейса
         - function  и predicate.
         Метод должен предоставлять возможность реализации следующих действий:
         1. При длине слова = 3 изменить все буквы этого слова на заглавные и вернуть измененную строку
         Пример: "aaa BBBB deF vbghR bbb" -> "AAA BBBB DEF vbghR BBB"
         2. При длине слова = 4 изменить все буквы этого слова на строчные(маленькие) и вернуть измененную строку
         Пример: "aaa BBBB deF vbghR bbb" -> aaa bbbb deF vbghR bbb
         3. При длине слова = 5 изменить все буквы слова на звездочки  и вернуть измененную строку
         Пример: "aaa BBBB deF vbghR bbb" -> aaa BBBB deF ***** bbb
          Слова состоят только из букв латинского алфавита
          Протестировать.
         */

    public static String transformString(String input, Predicate<String> predicate, UnaryOperator<String> unaryOperator) {
        String[] strings = input.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (predicate.test(strings[i])) {
                strings[i] = unaryOperator.apply(strings[i]);
            }
        }
        return String.join(" ", strings);
    }

    //    Тоже самое, но использовать свойства наследования классов
    public static String transformStringWithoutLambdas(String input, StringTransform transform) {
        String[] strings = input.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (transform.check(strings[i])) {
                strings[i] = transform.apply(strings[i]);
            }
        }
        return String.join(" ", strings);
    }

    abstract static class StringTransform {
        abstract boolean check(String s);

        abstract String apply(String s);
    }

    static class Length3StringTransform extends StringTransform {
        @Override
        boolean check(String s) {
            return s.length() == 3;
        }

        @Override
        String apply(String s) {
            return s.toUpperCase();
        }
    }

    static class Length4StringTransform extends StringTransform {
        @Override
        boolean check(String s) {
            return s.length() == 4;
        }

        @Override
        String apply(String s) {
            return s.toLowerCase();
        }
    }

    static class Length5StringTransform extends StringTransform {
        @Override
        boolean check(String s) {
            return s.length() == 5;
        }

        @Override
        String apply(String s) {
            return "*****";
        }
    }

    //    Тоже самое, но использовать интерфейсы

    public static String transformStringWithInterfaces(String input, WordCondition condition) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (condition.test(words[i])) {
                words[i] = condition.transform(words[i]);
            }
        }
        return String.join(" ", words);
    }

    interface WordCondition {
        boolean test(String word);
        String transform(String word);
    }

    static class Length3Condition implements WordCondition {
        @Override
        public boolean test(String word) {
            return word.length() == 3;
        }

        @Override
        public String transform(String word) {
            return word.toUpperCase();
        }
    }

    static class Length4Condition implements WordCondition {
        @Override
        public boolean test(String word) {
            return word.length() == 4;
        }

        @Override
        public String transform(String word) {
            return word.toLowerCase();
        }
    }

    static class Length5Condition implements WordCondition {
        @Override
        public boolean test(String word) {
            return word.length() == 5;
        }

        @Override
        public String transform(String word) {
            return "*****";
        }
    }

    public static void main(String[] args) {

        String input = "aaa BBBB deF vbghR bbb";

        System.out.println("First");
        Predicate<String> predicate = s -> s.length() == 3;
        UnaryOperator<String> unaryOperator = String::toUpperCase;
        String result = transformString(input, predicate, unaryOperator);
        System.out.println(result);

        System.out.println("Second");
        String result1 = transformStringWithoutLambdas(input, new Length3StringTransform());
        System.out.println(result1);

        System.out.println("Third");
        String result2 = transformStringWithInterfaces(input, new Length3Condition());
        System.out.println(result2);

    }
}
