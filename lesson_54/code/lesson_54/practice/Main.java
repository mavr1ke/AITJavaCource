package lesson_54.practice;

import java.io.*;

public class Main {
    /*1. Пусть есть текстовый файл такого вида:
    1
    2
    3
    4
    5
    Нужно написать метод, принимающий файл и возвращающий
    сумму всех значений*/

    /*2. Написать метод, принимающий текстовый файл, состоящий из нескольких строчек
        разной длины и возвращающий самую длинную строчку
        Пример:
        файл
        aaa
        bbbbbbbbbb
        cc
        вернет метод  bbbbbbbbbb*/

    public static void main(String[] args) throws IOException {
        System.out.println(sumOfFileValues(new File("123.txt")));
        System.out.println(maxStringInFile(new File("strings.txt")));
    }

    public static int sumOfFileValues(File file) throws IOException {
        int sum = 0;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int lineNumber = 0;
        while ((line = br.readLine()) != null) {
            lineNumber++;
            try {
                sum += Integer.parseInt(line);
            } catch (NumberFormatException e) {
                throw new IOException("Error in" + lineNumber + ": Cant convert in integer");
            }
        }
        br.close();
        return sum;
    }

    public static String maxStringInFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        String maxString = br.readLine();
        while ((line = br.readLine()) != null) {
            if (line.length() > maxString.length()) {
                maxString = line;
            }
        }
        br.close();
        return maxString;
    }
}