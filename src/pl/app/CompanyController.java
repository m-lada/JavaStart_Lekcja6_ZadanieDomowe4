package pl.app;

import pl.logic.Employee;
import pl.model.Company;
import pl.model.CompanyService;

import java.util.Scanner;

public class CompanyController {
    public static void main(String[] args) {
        CompanyService companyService = new CompanyService();
        companyService.companyServices();

    }
}

