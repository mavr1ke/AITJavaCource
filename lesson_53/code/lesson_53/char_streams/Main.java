package lesson_53.char_streams;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        try (FileWriter writer = new FileWriter("example.txt",true)) {
//            String word = "Hello everybody";
//            writer.write(word);
//            writer.append('\n');
//            writer.append('J');
//            writer.append('a');
//
//            writer.flush();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try (FileReader reader = new FileReader("exampleChar.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try (FileReader reader = new FileReader("exampleChar.txt")) {
            char[] data = new char[512];
            int counter;
            while ((counter = reader.read(data)) != -1) {
                if (counter < 512) {
                    data = Arrays.copyOf(data, counter);
                }
                System.out.print(data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bufferedExample.txt"))) {
            String sentence = "Hello java and everyone!";
            bufferedWriter.write(sentence);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("bufferedExample.txt"))) {
            int ch;
            while ((ch = bufferedReader.read()) != -1)
                System.out.print((char) ch);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("bufferedExample.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)))
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fromConsole.txt"));
            String line;
            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("EXIT")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
