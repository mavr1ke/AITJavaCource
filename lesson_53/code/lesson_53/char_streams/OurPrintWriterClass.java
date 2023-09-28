package lesson_53.char_streams;

import java.io.PrintWriter;

public class OurPrintWriterClass {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        int i = 100;
        double d = 123.45;
        pw.println("We use printWriter here");
        pw.println(i);
        pw.println(d);
    }
}
