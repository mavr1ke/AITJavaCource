package lesson_46.other_collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("John");
        queue.add("Jack");
        queue.add("Ann");
        queue.add("Mary");

        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.remove("Ann"));

        System.out.println(queue);

        System.out.println("poll(): " + queue.poll());
        System.out.println("poll(): " + queue.poll());
        System.out.println("poll(): " + queue.poll());

        queue.offer("Jack");
        queue.offer("Ann");
        queue.offer("Mary");
        queue.offer("Jim");

        System.out.println("Head of the queue is " + queue.element());
        System.out.println("Head of the queue is " + queue.peek());

        /*
        addFirst(elt), offerFirst()
        addLast, offerLast()

        getFirst(), peekFirst()
        getLast(), peekLast()

        pollFirst(), removeFirst()
        pollLast(), removeLast()

        pop()
        push()
        peek()

        */
        System.out.println("\n*******************************");
        ArrayDeque<String> fruits = new ArrayDeque<>();
        fruits.add("Lemon");
        fruits.addFirst("Orange");
        System.out.println(fruits);
        fruits.push("Kiwi");
        System.out.println(fruits);
        fruits.addLast("Apple");
        System.out.println(fruits);

        String first = fruits.getFirst();
        System.out.println(first + "\n");

        while (fruits.peek() != null) {
            System.out.println(fruits.pop());
        }

        System.out.println("\n*******************************");
        PriorityQueue<String> names = new PriorityQueue<>(new PriorityComparator());
        names.add("aaa");
        names.add("a");
        names.add("aaaaaa");
        names.add("aaaa");

        while (names.size() != 0) {
            System.out.println(names.poll());
        }


    }

}
