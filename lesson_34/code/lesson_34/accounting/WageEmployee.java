package lesson_34.accounting;

public class WageEmployee extends Employee {

    private final double perHourRate;

    public WageEmployee(String firstName, String lastName,
                        int hours, double perHourRate) {
        super(firstName,
                lastName, hours);
        this.perHourRate = perHourRate;
    }

    @Override
    public double salaryCalculation() {
        double actualSalary = getHours() * perHourRate;
        double minimumWageSalary = getHours() * StateConstants.MINIMAL_WAGE;

        return Math.max(minimumWageSalary, actualSalary);
    }

    @Override
    public String toString() {
        return "WageEmployee " + super.toString() +
                ", perHourRate = " + perHourRate;
    }
}
