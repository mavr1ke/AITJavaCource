package lesson_and_hw_63;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HWMain {
    /*
    1. Используя стримы, написать метод, принимающий лист стрингов в формате "13 Oct 2023"
    и возвращающий  упорядоченный по возрастанию дат лист стрингов в формате  "Fri, 13 Oct 2023"
    */

    private static LocalDate createLocalDateFromString(String s) {
        return LocalDate.parse(s, DateTimeFormatter.ofPattern("dd MMM yyyy", new Locale("en")));
    }

    private static String createStingFromLocalDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("EEE, dd MMM yyyy", new Locale("en")));
    }

    public static List<String> getFormattedStings(List<String> dates) {
        return dates
                .stream()
                .map(HWMain::createLocalDateFromString)
                .sorted()
                .map(HWMain::createStingFromLocalDate)
                .collect(Collectors.toList());

    }

    /*
    2. Написать метод, принимающий строку и возвращающий  количество слов, начинающихся в этой строке
    с определенной буквы.  Между словами  только пробел. Слова состоят из маленьких букв латинского алфавита
    В решении использовать стримы
    Пример: "aaaaaaaa fffffffffff ab bbbbbb a bbb aaa ttttttttttt", "a" -> 4
    */

    public static long numberOfWords(String input, String w) {
        return Stream.of(input.split(" "))
                .filter(s -> s.startsWith(w))
                .count();
    }

    /*
    3. Пусть есть класс BankAccount  с полем  String IBAN   и класс Person c  полями name и List<BankAccount>.
    Нужно написать метод, который вернет список IBANs  с номерами замененными звездочкой после 3 третьего символа
    */

    private static String maskIBAN(String IBAN) {
        if (IBAN.length() < 4) {
            return IBAN;
        }
        return IBAN.substring(0, 3) + "*".repeat(IBAN.length() - 3);
    }

    public static List<String> maskIBANs(List<Person> people) {
        return people.stream()
                .flatMap(person -> person.getBankAccounts().stream())
                .map(account -> maskIBAN(account.getIBAN()))
                .collect(Collectors.toList());
    }

    /*
    Пусть есть класс Person1 с полями String name и int age.
    Написать метод, принимающий лист Persons и возвращающий суммарный возраст тех, кто старше 17 лет
    Написать метод, принимающий лист Persons и возвращающий имена тех, кто старше 17 лет в виде строки.
    Должна быть возвращена строка примерно такого вида:
    In this list John and Peter and Ann are older than 17 (В этом списке Джон и Питер и Анн старше 17 лет)
    */

    public static int sumOfAgeMoreThan17(List<Person1> list) {
        return list.stream()
                .filter(person -> person.getAge() > 17)
                .mapToInt(Person1::getAge)
                .sum();
    }

    public static String namesOfPeopleOlderThan17(List<Person1> list) {
        List<String> olderThan17Names = list.stream()
                .filter(person -> person.getAge() > 17)
                .map(Person1::getName)
                .collect(Collectors.toList());

        return olderThan17Names.stream()
                .collect(Collectors.joining(" and ", "In this list ", " are older than 17."));
    }

    public static void main(String[] args) {
        List<String> stringDates = new LinkedList<>();
        Collections.addAll(stringDates, "13 Oct 2023", "09 Jul 2018", "21 Dec 2010");
        System.out.println(getFormattedStings(stringDates));

        System.out.println(numberOfWords("aaaaaaaa fffffffffff ab bbbbbb a bbb aaa ttttttttttt", "a"));

        BankAccount account1 = new BankAccount("12345678901234567890");
        BankAccount account2 = new BankAccount("98765432109876543210");
        BankAccount account3 = new BankAccount("32323231249876543210");
        BankAccount account4 = new BankAccount("46892847573920188472");
        Person person1 = new Person("John", List.of(account1, account2));
        Person person2 = new Person("Ann", List.of(account3, account4));

        List<String> maskedIBANs = maskIBANs(List.of(person1, person2));
        System.out.println(maskedIBANs);

        List<Person1> people = List.of(
                new Person1("John", 25),
                new Person1("Peter", 30),
                new Person1("Ann", 16),
                new Person1("Mary", 20)
        );

        int sum = sumOfAgeMoreThan17(people);
        System.out.println("Sum of ages older than 17: " + sum);

        String olderThan17Names = namesOfPeopleOlderThan17(people);
        System.out.println(olderThan17Names);
    }
}
