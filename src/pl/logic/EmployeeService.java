package pl.logic;

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

    public Employee[] createBaseOfEmployess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę pracowników:");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();
        Employee[] employees = new Employee[numberOfEmployees];
        return employees;
    }

    public void addEmployessToBase(Employee[] employees) {
//        Scanner scanner = new Scanner(System.in);
//        final int exit = 0;
//        final int addEmployee = 1;
//        int indexTmp = 0;
//        int i = 0;
//        int option = 1;
//        boolean indexFree = (i+1) != indexTmp;
//        while(i < employees.length && option == 1) {
//            if (indexFree) {
//                employees[i] = add();
//                employees[i].setIndex(i + 1);
//                indexTmp++;
//                i++;
//                System.out.println("Wprowadzić kolejnego pracownika?");
//                System.out.println(exit + " - nie");
//                System.out.println(addEmployee + " - tak");
//                option = scanner.nextInt();
//                scanner.nextLine();
//            }
//        }
//    }
    int tmp = 0;
        for (int i = 0; (i < employees.length); i++) {
            boolean indexTaken = (i+1) != tmp;
            if (indexTaken) {
                employees[i] = add();
                employees[i].setIndex(i + 1);
                tmp++;
            }
        }
    }

    public int getSumOfPayment(Employee[] employees) {
        int sumOfPayment = 0;
        for (Employee employee : employees) {
            sumOfPayment += employee.getPayment();
        }
        return sumOfPayment;
    }

    public void showEmployessInfo(Employee[] employees) {
        for (int i = 0; (i < employees.length); i++) {
//            if (employees[i].getIndex() != 0) {
                employees[i].employeeInfo();
//            } else {
//                System.out.println("-");
//            }
        }
    }
}