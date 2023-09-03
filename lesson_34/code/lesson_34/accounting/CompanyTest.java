package lesson_34.accounting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    Company company = new Company(3);
    Employee employee = new WageEmployee("Greek", "Salad", 12, 13);
    Employee employee1 = new WageEmployee("John", "Doe", 10, 7);
    Employee employee2 = new WageEmployee("Alice", "Smith", 8, 9);

    @Test
    @DisplayName("Add employee test")
    void addEmployee_test() {
        assertTrue(company.addEmployee(employee));
    }

    @Test
    @DisplayName("Delete employee test")
    void deleteEmployee_test() {
        company.addEmployee(employee);
        assertTrue(company.deleteEmployee(employee));
    }

    @Test
    @DisplayName("Sum of all employees salaries test")
    void sumOfAllEmployeesSalaries_test() {
        company.addEmployee(employee);
        company.addEmployee(employee2);

        double expectedSum = employee.salaryCalculation() + employee2.salaryCalculation();

        assertEquals(expectedSum, company.sumOfAllEmployeesSalaries());
    }

    @Test
    @DisplayName("Delete none existent employee test")
    void deleteNonexistentEmployee_test() {
        assertFalse(company.deleteEmployee(employee1));
    }

    @Test
    @DisplayName("Add employee to full company test")
    void addEmployeeToFullCompany_test() {
        company.addEmployee(employee);
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee);

        assertFalse(company.addEmployee(employee));
    }

    @Test
    @DisplayName("Sort employees by last name test")
    void sortEmployeesByLastName_test() {
        company.addEmployee(employee1);
        company.addEmployee(employee);
        company.addEmployee(employee2);

        company.sortEmployeesByLastName();

        Employee[] sortedEmployees = {employee1, employee, employee2};
        assertArrayEquals(sortedEmployees, company.getEmployees());
    }

    @Test
    @DisplayName("Sort employees by id test")
    void sortEmployeesById_test() {
        company.addEmployee(employee1);
        company.addEmployee(employee);
        company.addEmployee(employee2);

        company.sortEmployeesById();

        Employee[] sortedEmployees = {employee, employee1, employee2};
        assertArrayEquals(sortedEmployees, company.getEmployees());
    }

    @Test
    @DisplayName("Sort employees by first name test")
    void sortEmployeesByFirstName_test() {
        company.addEmployee(employee1);
        company.addEmployee(employee);
        company.addEmployee(employee2);

        company.sortEmployeesByFirstName();

        Employee[] sortedEmployees = {employee2, employee, employee1};
        assertArrayEquals(sortedEmployees, company.getEmployees());
    }
}