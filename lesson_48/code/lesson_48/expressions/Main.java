package lesson_48.expressions;

import java.io.IOException;

public class Main {
    public static int example() {
        try {
            return 1;
        } finally {
            System.out.println("Finally runs even when return is present");
        }
    }

    public static void example1(int num) {
        int t;
        int[] ints = new int[2];

        System.out.println("received " + num);
        try {
            switch (num) {
                case 0:
                    t = 20 / num;  // \ by zero
                    break;

                case 1:
                    ints[10] = 100; // uncorrected index
                    break;

                case 2:
                    return; // returning from try-block
            }

        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No such index is found");
        } finally {
            System.out.println("Finally always executes");
        }
    }
    public static void checkCandidates(int age, int weight) {
        if (age < 10 && weight < 40) {
            throw new ArithmeticException("Sorry you are not good for our section");

        } else {
            System.out.println("Welcome aboard!");
        }
    }

    public static void example2() throws ArithmeticException,NullPointerException{
        System.out.println(2/0);

        String nullStr = null;
        nullStr.length();
    }

    public static void example3(int number) throws ClassNotFoundException, IOException {
        if(number == 1) {
            throw new IOException("IOExceptions occured");
        } else
            throw new ClassNotFoundException("Class not found");
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException{
        System.out.println(example());

        System.out.println("************");
        for(int i = 0; i < 3; i++) {
            example1(i);
            System.out.println();
        }

        System.out.println("************");
        checkCandidates(19,20);

        try{
            example2();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

        example3(1);
    }
}
