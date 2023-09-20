package lesson_47.our_stack;

import java.util.Stack;

public class OurStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("aaa");
        stack.push("bbb");
        stack.push("ccc");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        System.out.println(stack);

        stack.push("ddddd");
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
