package pl.logic;

public class Employee {
    private int index;
    private String firstName;
    private String lastName;
    private int payment;

    public Employee(String firstName, String lastName, int payment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.payment = payment;
    }

    public void employeeInfo() {
        System.out.println("ID pracownika: " + index +
                "; Imie i nazwisko: " + firstName + " " + lastName +
                ", wynagrodzenie: " + payment);
        System.out.println();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPayment() {
        return payment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
