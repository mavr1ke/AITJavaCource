package lesson_34.accounting;

public class Main {
    /*
    Написать программу для бухгалтерии.
    Программа должна уметь:
    -добавлять сотрудников в штат
    -удалять сотрудников из штата
    -рассчитывать зарплату для двух категорий сотрудников
            - сотрудник с почасовой оплатой
            - менеджер по продажам
     У программы должны быть следующие классы:
     - Company, в котором содержатся методы для добавления сотрудника, удаления сотрудника, вывода на экран списка
        всех сотрудников, и метод для суммирования зарплат всех сотрудников
     - классы сотрудников:
        -abstract Employee
        -WageEmployee
        -SalesManager

        У сотрудников  должны быть такие поля: id, имя, фамилия, количество проработанных часов. Также должен быть
     метод подсчета зарплаты
     У сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен учитывать
     минимальный размер оплаты труда
     У менеджера по продажам нет фиксированной оплаты, его зарплата рассчитывается как процент от обьема продаж.
     Но его метод оплаты тоже должен учитывать минимальный размер оплаты труда

     Дополнительно:
     Программа также должна содержать методы, предоставляющие возможность сортировки списка сотрудников
     по следующим критериям:
     - по фамилии
     - по id
     - по имени а если имена одинаковые, то по id
    */
    public static void main(String[] args) {
        Company company = new Company(10);
        Employee employee = new WageEmployee("Greek", "Salad", 12, 13);
        Employee employee1 = new WageEmployee("John", "Doe", 10, 7);
        Employee employee2 = new WageEmployee("Alice", "Smith", 8, 9);
        company.addEmployee(employee);
        company.addEmployee(employee1);
        company.addEmployee(employee2);

        company.listOfAllEmployees();

        System.out.println(employee.salaryCalculation());
        System.out.println(employee2.salaryCalculation());

        company.sumOfAllEmployeesSalaries();

        System.out.println();

        company.sortEmployeesById();
        company.listOfAllEmployees();

        company.sortEmployeesByLastName();
        company.listOfAllEmployees();

        company.sortEmployeesByFirstName();
        company.listOfAllEmployees();
    }
}
