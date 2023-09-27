package homework_51;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HWMain {
    /*Написать программу, сравнивающую два файла . Программа должна считывать файлы и затем
    сравнивать содержимое. Если найдено отличие, значит файлы не равны и программа выводит
    на экрае соответствующее сообщение. Если конец обоих файлов достигается одновременно и отличий не найдено
    - значит файлы одинаковые и программа также выводит на экран соответствующее сообщение.
    Предварительно создать файлы в корневой директории first.txt, second.txt*/

    public static void main(String[] args) {
        String file1Path = "D:\\IdeaProjects\\Lessons\\lesson_51\\code\\homework_51\\first.txt";
        String file2Path = "D:\\IdeaProjects\\Lessons\\lesson_51\\code\\homework_51\\second.txt";

        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2Path));

            int lineNumber = 1;
            String line1, line2;

            while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
                if (!line1.equals(line2)) {
                    System.out.println("Difference found at line " + lineNumber + ":");
                    System.out.println("File 1: " + line1);
                    System.out.println("File 2: " + line2);
                    System.out.println("Files are not identical.");
                    return;
                }
                lineNumber++;
            }

            // Check if both files have the same number of lines
            if (reader1.readLine() != null || reader2.readLine() != null) {
                System.out.println("Files have different line counts.");
            } else {
                System.out.println("Files are identical.");
            }

            reader1.close();
            reader2.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
