package pl.model;

import pl.logic.Employee;
import pl.logic.EmployeeService;

import java.util.Scanner;

public class Company {

    public Employee[] createEmployessBase() {
        System.out.println("Napisz, ilu masz pracowników w firme: ");
        EmployeeService employeeService = new EmployeeService();
        Employee[] employees = employeeService.createBaseOfEmployess();
        return employees;
    }

    public void companyServices(Employee[] employees) {
        final int exit = 0;
        final int addEmployee = 1;
        final int showEmployeeList = 2;
        final int showEmployeesPayment = 3;
        int option = -1;
        Scanner input = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
        while (option != exit) {
            System.out.println("Dostępne opcje: ");
            System.out.println(exit + " - wyjście z programu");
            System.out.println(addEmployee + " - dodanie pracownika");
            System.out.println(showEmployeeList + " - przedstawienie listy pracowników");
            System.out.println(showEmployeesPayment + " - przedstawienie sumy wynagrodzeń pracowników");

            System.out.println("Wybierz opcję: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case addEmployee:
                    employeeService.addEmployessToBase(employees);
                    break;
                case showEmployeeList:
                    employeeService.showEmployessInfo(employees);
                    break;
                case showEmployeesPayment:
                    System.out.println("Suma wynagrodzeń: " + employeeService.getSumOfPayment(employees));
                    System.out.println();
                    break;
                case exit:
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
                    System.out.println();
            }
        }
    }
}
