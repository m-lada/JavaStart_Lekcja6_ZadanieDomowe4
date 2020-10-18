package pl.model;

import pl.logic.Employee;

public class CompanyService {
    public static void main(String[] args) {
        Company company = new Company();
        Employee[] employees = company.createEmployessBase();
        company.companyServices(employees);
    }
}
