package lesson_55.object_serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.dat"))) {

            Employee employee = new Employee("John", 35, 5000, true);
            objectOutputStream.writeObject(employee);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Employee employee = (Employee) objectInputStream.readObject();
            System.out.println("Name: " + employee.name + "\nAge: " + employee.age + "\nSalary: "
                    + employee.salary + "\nManager: " + employee.isManager);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50, 2000, false));
        employees.add(new Employee("Ann", 25, 5000, true));

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            outputStream.writeObject(employees);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        List<Employee> newEmployees = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"))) {
            newEmployees = (ArrayList<Employee>) inputStream.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for(Employee employee : newEmployees) {
            System.out.println(employee.name);
            System.out.println(employee.age);
            System.out.println(employee.salary);
            System.out.println(employee.isManager);
        }
    }
}
