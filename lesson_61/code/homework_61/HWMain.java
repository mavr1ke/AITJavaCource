package homework_61;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class HWMain {
    // another flatMap example
    /*
    flatMapToInt()
    IntStream(a,b)
     */
    public static void main(String[] args) {
//        Stream.of(2,3,0,1,3)
//                .flatMapToInt(i -> IntStream.range(0,i))
//                .forEach(System.out::print);
//
//
//        System.out.println("\nwith map");
//        Stream.of(2,3,0,1,3)
//                .map(i -> IntStream.range(0,i))
//                .forEach(System.out::println);

        List<BankAccount> bankAccounts = List.of(
                new BankAccount("DE1234567890", new Person1("Person1")),
                new BankAccount("FR9876543210", new Person1("Person2")),
                new BankAccount("ES5678901234", new Person1("Person1")),
                new BankAccount("IT3456789012", new Person1("Person3")),
                new BankAccount("TR2321323434", new Person1("Person2"))
        );

        Map<Person1, List<BankAccount>> accountMap = mapAccountsToPerson(bankAccounts);

        System.out.println("\nMap of Person1 to BankAccounts:");
        accountMap.forEach((person, accounts) -> {
                    System.out.println("Person: " + person.getName());
                    System.out.println("Bank Accounts: " + accounts);
                });

        List<String> maskedIBANs = maskIBANs(bankAccounts);
        System.out.println("\nMasked IBANs:");
        maskedIBANs.forEach(System.out::println);

    }
    // 1.Есть классы Person1  и BankAccount   нужно написать метод, принимающий  лист BankAccounts и возвращающий
    // мапу  где Person1  будет ключом, а лист его\ ее счетов значением
    public static Map<Person1, List<BankAccount>> mapAccountsToPerson(List<BankAccount> input){
        return input
                .stream()
                .collect(Collectors.groupingBy(BankAccount::getOwner));
    }
    // 2. Есть класс BankAccount. Нужно написать метод, принимающий лист BankAccounts и
    // возвращающий лист IBANNs со звездочкой после третьего символа
    // DE4****************,DE5*******************,
    public static List<String> maskIBANs(List<BankAccount> input) {
        return input
                .stream()
                .map(BankAccount::getIBAN)
                .map(iban -> iban.substring(0, 3) + "********")
                .collect(Collectors.toList());
    }
}
