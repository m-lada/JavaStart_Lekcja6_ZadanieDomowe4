package pl.model;

import pl.logic.Employee;
import pl.logic.EmployeeService;

import java.util.Scanner;

public class Company {

    private Employee[] employees;

    public Company(int size) {
        employees = new Employee[size];
    }

    public Employee getEmployee(int index) {
        return employees[index];
    }

    public void add(int employeeNumber) {
        EmployeeService employeeService = new EmployeeService();
        employeeService.addEmployessToBase(employees, employeeNumber);
    }

    public Employee[] getEmployees() {
        return employees;
    }
}
