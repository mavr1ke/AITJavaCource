package homework_46;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    /*
        Пусть есть массив, принимающий три вида скобок : '(' ,')' ,'{', '}','[', ']'  ( 6 различных символов).
        Нужно написать метод, определяющий является ли порядок скобок в массиве корректным.
        {}([]) - корректный порядок
        {}([]{()}) - корректный порядок
        {(] - некорректный порядок
        {}([])} - некорректный порядок
        {}([])( - некорректный
        {(})
        Использовать деку при решении

        public boolean areBracketsCorrect( char[] brackets)
         */
    public static boolean areBracketsCorrect(char[] brackets) {
        if (brackets.length % 2 != 0) {
            return false;
        }
        Deque<Character> deque = new ArrayDeque<>();

        for (char bracket : brackets) {
            if (bracket == '{' || bracket == '(' || bracket == '[') {
                deque.addLast(bracket);
            } else if (deque.size() > 0) {
                char lastOpenBracket = deque.getLast();

                if (bracket == '}' && lastOpenBracket == '{' ||
                        bracket == ']' && lastOpenBracket == '[' ||
                        bracket == ')' && lastOpenBracket == '(') {
                    deque.removeLast();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return deque.isEmpty();
    }
}
