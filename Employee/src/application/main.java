package application;

import entities.employee;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        employee emp = new employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.println();
        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println();
        System.out.print("Enter the tax: ");
        emp.tax = sc.nextDouble();
        System.out.println();

        System.out.println("employee: " + emp);

        System.out.print("What is the percentage for salary increase? ");
        emp.IncreaseSalary(sc.nextDouble());
        System.out.println();

        System.out.println("updated data:" + emp);

        sc.close();


    }
}
