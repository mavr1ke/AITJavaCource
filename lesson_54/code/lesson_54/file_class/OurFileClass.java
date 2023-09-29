package lesson_54.file_class;

import java.io.File;
import java.io.IOException;

public class OurFileClass {
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");
        System.out.println("File name:" + file.getName());
        System.out.println("does file exist: " + file.exists());
        System.out.println("File size: " + file.length());
        System.out.println(file.createNewFile());
        System.out.println("does file exist: " + file.exists());
        System.out.println("File size: " + file.length());
        System.out.println(file.delete());
        System.out.println("does file exist: " + file.exists());
    }
}
