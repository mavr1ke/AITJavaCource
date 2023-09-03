package lesson_34.accounting;

import java.util.Arrays;

public class Company {

    private final Employee[] employees;
    private int companySize;

    public Company(int capacity) {
        employees = new Employee[capacity];
        companySize = 0;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getCompanySize() {
        return companySize;
    }

    public boolean addEmployee(Employee employee) {
        if(employee == null) {
            return false;
        }
        if (companySize < employees.length) {
            employees[companySize] = employee;
            companySize++;
            System.out.println("Employee added");
            return true;
        }
        return false;
    }

    public boolean deleteEmployee(Employee employee) {
        if(isCompanyEmpty() || employee == null) {
            return false;
        }
        for (int i = 0; i < companySize; i++) {
            if (employees[i] != null && employees[i].equals(employee)) {
                employees[i] = null;

                for (int j = i; j < companySize - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                
                employees[companySize - 1] = null;

                companySize--;
                System.out.println("Employee deleted");
                return true;
            }
        }
        return false;
    }

    public void listOfAllEmployees() {
        if(isCompanyEmpty()) {
            return;
        }
        for (int i = 0; i < companySize; i++){
            System.out.println(employees[i]);
        }
        System.out.println();
    }

    public double sumOfAllEmployeesSalaries() {
        if(isCompanyEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < companySize; i++){
            sum += employees[i].salaryCalculation();
        }
        System.out.println("Sum: " + sum);
        return sum;
    }

    private boolean isCompanyEmpty() {
        if (companySize == 0) {
            System.out.println("Company is empty");
            return true;
        }
        return false;
    }

    public void sortEmployeesByLastName() {
        Arrays.sort(employees, 0, companySize);
    }

    public void sortEmployeesById() {
        Arrays.sort(employees, 0, companySize, new EmployeeIdComparator());
    }

    public void sortEmployeesByFirstName() {
        Arrays.sort(employees, 0, companySize, new EmployeeFirstNameComparator());
    }
}
