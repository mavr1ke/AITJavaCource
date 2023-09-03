package lesson_34.accounting;

public class SalesManager extends Employee {

    private final double salesVolume;
    private final double percent;

    public SalesManager(String firstName, String lastName,
                        int hours, double salesVolume, double percent) {
        super(firstName,
                lastName, hours);
        this.salesVolume = salesVolume;
        this.percent = percent;
    }

    @Override
    public double salaryCalculation() {
        double actualSalary = salesVolume * percent;
        double minimumSalary = getHours() * StateConstants.MINIMAL_WAGE;

        return Math.max(actualSalary, minimumSalary);
    }

    @Override
    public String toString() {
        return "SalesManager " + super.toString() +
                ", salesVolume = " + salesVolume +
                ", percent = " + percent;
    }
}
