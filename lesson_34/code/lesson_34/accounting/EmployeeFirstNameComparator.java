package lesson_34.accounting;

import java.util.Comparator;

public class EmployeeFirstNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getFirstName().compareTo(e2.getFirstName()) == 0) {
            return Integer.compare(e1.getId(),e2.getId());
        } else {
            return e1.getFirstName().compareTo(e2.getFirstName());
        }
    }
}
