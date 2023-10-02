package lesson_54.practice;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

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
        amountOfEquipment("employees.txt", "result.txt");
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

    /*
     Пусть есть файл содержащий следующую информацию:
     name,surname (  могут повторяться),equipment,price.
     Нужно написать метод, который принимает в качестве параметра имя этого файла и записывает информацию в другой
     файл в таком виде :
     name surname sumPrice

     Eugene,Black,Notebook,1000
     Peter,White,Mac,800
     Eugene,Black,Keyboard,25
     John,Green,Mouse pad,5
     Peter,White,Mobile,600

     Eugene Black 1025
     Peter White 1400
     John Green 5
     */

    public static void amountOfEquipment(String inFile, String outFile) {
        Map<String, Integer> employeeMap = new HashMap<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(inFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String fullName = parts[0].trim().concat(" ").concat(parts[1].trim());
                int employeeEquipmentPrice = Integer.parseInt(parts[3].trim());
                employeeMap.put(fullName, employeeMap.getOrDefault(fullName, 0) + employeeEquipmentPrice);
            }

            for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
                bw.write(entry.getKey() + " " + entry.getValue());
                bw.newLine();
            }

            System.out.println("Done");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}