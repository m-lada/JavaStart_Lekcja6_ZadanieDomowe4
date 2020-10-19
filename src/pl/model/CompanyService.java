package pl.model;

import pl.logic.Employee;
import pl.logic.EmployeeService;

import java.util.Scanner;

public class CompanyService {

    private int employessCounter;

//    public void createBase() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ilu pracowników w firmie");
//        int size = scanner.nextInt();
//        Company company = new Company(size);
//    }

    public void companyServices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilu pracowników jest w firmie:");
        int size = scanner.nextInt();
        Company company = new Company(size);

        final int exit = 0;
        final int addEmployee = 1;
        final int showEmployeeList = 2;
        final int showDirectEmployee = 3;
        final int showEmployeesPayment = 4;
        int option = -1;
        Scanner input = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        while (option != exit) {
            System.out.println("Dostępne opcje: ");
            System.out.println(exit + " - wyjście z programu");
            System.out.println(addEmployee + " - dodanie pracownika");
            System.out.println(showEmployeeList + " - przedstawienie listy pracowników");
            System.out.println(showDirectEmployee + " - przedstawienie informacji o danym pracowniku");
            System.out.println(showEmployeesPayment + " - przedstawienie sumy wynagrodzeń pracowników");

            System.out.println("Wybierz opcję: ");

            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case addEmployee:
                    if (employessCounter < size) {
                        company.add(employessCounter);
                        employessCounter++;
                    } else {
                        System.out.println("Nie można wprowadzić więcej pracowników");
                    }
                    break;
                case showEmployeeList:
                    employeeService.showEmployessInfo(company.getEmployees(), employessCounter);
                    break;
                case showDirectEmployee:
                    System.out.println("Wskaż, o którego pracownika chodzi:");
                    int employeeIndex = scanner.nextInt() - 1;
                    company.getEmployee(employeeIndex).employeeInfo();
                    break;
                case showEmployeesPayment:
                    if (employessCounter < size) {
                        System.out.println("Suma wynagrodzeń: " + employeeService.getSumOfPayment(company.getEmployees(), employessCounter));
                        System.out.println();
                    } else {
                        System.out.println("Nie ma takiego pracownika");
                    }
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




