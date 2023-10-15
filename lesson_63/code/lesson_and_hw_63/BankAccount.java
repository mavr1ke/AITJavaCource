package lesson_and_hw_63;

public class BankAccount {
    private final String IBAN;

    public BankAccount(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getIBAN() {
        return IBAN;
    }
}
