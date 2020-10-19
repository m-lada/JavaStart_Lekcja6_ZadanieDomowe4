package pl.model;

import pl.logic.Employee;
import pl.logic.EmployeeService;

public class Company {

    private int employessCounter;
    private Employee[] employees;

    public Company(int size) {
        employees = new Employee[size];
    }

    public Employee getEmployee(int index) {
        return employees[index];
    }

    public void add() {
        EmployeeService employeeService = new EmployeeService();
        employees[employessCounter] = employeeService.add();
        employessCounter++;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getEmployessCounter() {
        return employessCounter;
    }

    public void setEmployessCounter(int employessCounter) {
        this.employessCounter = employessCounter;
    }
}
