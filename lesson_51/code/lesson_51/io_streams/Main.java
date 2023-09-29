package lesson_51.io_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String str = "Hello Java";
        try (FileOutputStream fileOutputStream = new FileOutputStream("ok.txt")) {

            byte[] buffer = str.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
            System.out.println("we made it");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try (FileInputStream fileInputStream = new FileInputStream("ok1.txt")) {
            int i;
            while ((i =fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
