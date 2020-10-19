package pl.logic;

import pl.model.Company;

import java.util.Scanner;

public class EmployeeService {

    private Employee add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imię:");
        String firstName = scanner.nextLine();
        System.out.println("Nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Wynagrodzenie:");
        int payment = scanner.nextInt();
        scanner.nextLine();
        return new Employee(firstName, lastName, payment);
    }

    public void addEmployessToBase(Employee[] employees, int employeeNumber) {
        employees[employeeNumber] = add();
    }

    public int getSumOfPayment(Employee[] employees, int numberOfEmployees) {
        int sumOfPayment = 0;
        for (int i = 0; (i < numberOfEmployees); i++) {
            sumOfPayment += employees[i].getPayment();
        }
        return sumOfPayment;
    }

    public void showEmployessInfo(Employee[] employees, int numberOfEmployees) {
        for (int i = 0; (i < numberOfEmployees); i++) {
            employees[i].employeeInfo();
        }
        System.out.println();
    }
}