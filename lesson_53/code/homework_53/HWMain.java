package homework_53;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HWMain {

    public static String readTextFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return content.toString();
    }

    public static void main(String[] args) {
        String filePath = "D:\\IdeaProjects\\Lessons\\lesson_53\\code\\homework_53\\file.txt";
        String fileContent = readTextFile(filePath);

        System.out.println("File:");
        System.out.println(fileContent);
    }
}
