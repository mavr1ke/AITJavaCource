package lesson_53;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws IOException {
//        char ch;
//        System.out.println("press a key and then ENTER");
//        ch = (char) System.in.read();
//        System.out.println("You entered " + ch);

//        byte[] data = new byte[10];
//        System.out.println("Enter several characters");
//        System.in.read(data);
//        System.out.println("You entered the following:");
//        for (byte datum : data) {
//            System.out.print((char) datum);
//        }

//        String hello = "Hello Java!";
//        try (PrintStream printStream = new PrintStream(new FileOutputStream("example.txt"))) {
//            printStream.println(hello);
//        } catch (IOException e ){
//            System.out.println(e.getMessage());
//        }

        try (PrintStream printStream = new PrintStream(new FileOutputStream("example1.txt"))) {

            printStream.println("hello java");
            printStream.print("hello java");

            String word = "Print";
            byte[] wordToBytes = word.getBytes();
            printStream.write(wordToBytes);
        } catch (IOException e ){
            System.out.println(e.getMessage());
        }
    }
}
