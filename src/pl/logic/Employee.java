package pl.logic;

import java.util.Scanner;

public class Employee {

    private String firstName;
    private String lastName;
    private int payment;

    public Employee(String firstName, String lastName, int payment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.payment = payment;
    }

    public void employeeInfo() {
        System.out.println("Imie i nazwisko: " + firstName + " " + lastName +
                ", wynagrodzenie: " + payment);
    }

    public int getPayment() {
        return payment;
    }
}
