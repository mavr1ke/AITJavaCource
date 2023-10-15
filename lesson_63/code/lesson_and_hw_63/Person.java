package lesson_and_hw_63;

import java.util.List;

public class Person {
    private final String name;
    private final List<BankAccount> bankAccounts;

    public Person(String name, List<BankAccount> bankAccounts) {
        this.name = name;
        this.bankAccounts = bankAccounts;
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }
}
