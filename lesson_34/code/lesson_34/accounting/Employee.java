package lesson_34.accounting;

public abstract class Employee implements Comparable<Employee>{

    private final int id;
    private String firstName;
    private String lastName;
    private int hours;
    static private int idCounter;


    public Employee(String firstName,
                    String lastName, int hours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = hours;
        this.id = idCounter++;
    }

    public abstract double salaryCalculation();

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return  "id = " + id + ", firstName = " + firstName
                + ", lastName = " + lastName + ", hours = " + hours;
    }

    public int compareTo(Employee e) {
        return getLastName().compareTo(e.getLastName());
    }
}
