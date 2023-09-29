package homework_54;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person>{

        /*3. Пусть есть текстовый файл такого вида:
        Peter,35
        Simon,5
        John,90
        Нужно написать метод, читающий этот файл и возвращающий список людей старше 18 лет,
        отсортированный по возрасту. Известно, что файл не пустой*/

    /*4. Пусть есть класс Person c полями name  и age. Нужно написать метод, записывающий в файл обьекты
      класса Person в виде строк и одновременно выводящий их на экран*/

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static List<Person> getListOfAdults(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        List<Person> personsList = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            String personName = parts[0].trim();
            int personAge = Integer.parseInt(parts[1].trim());
            if (personAge >= 18) {
                Person person = new Person(personName, personAge);
                personsList.add(person);
            }
        }
        br.close();
        Collections.sort(personsList);
        return personsList;
    }

    public static void writePersonsToFileAndPrint(List<Person> persons,File file) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (Person person : persons) {
            writer.write(person.toString());
            writer.newLine();
            writer.flush();
            System.out.println(person);
        }
        writer.close();
    }
    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Person" +
                " name=" + name +
                ", age=" + age;
    }

    public static void main(String[] args) throws IOException{
        List<Person> adultsList = getListOfAdults(new File("lesson_54/code/homework_54/humans.txt"));
        writePersonsToFileAndPrint(adultsList, new File("lesson_54/code/homework_54/output.txt"));
    }
}
