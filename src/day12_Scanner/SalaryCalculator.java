package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;
         */

        System.out.println("Please enter your hourly payment: ");
        double hourlyRate = scan.nextDouble();

        System.out.println("Please enter how many hours do you work in a week: ");
        double weeklyHours = scan.nextDouble();

        System.out.println("Please enter the tax rate in your state (in percentage): ");
        double taxRate = scan.nextDouble();

        System.out.println("Please enter federal tax rate (in percentage): ");
        double federalTaxRate = scan.nextDouble();

        double salary = hourlyRate * weeklyHours * 52;
        double stateTax = salary * taxRate / 100;
        double federalTax = salary * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - totalTax;

        System.out.println("Your salary is: " + salary);
        System.out.println("Your state tax is: " + stateTax);
        System.out.println("Your federal tax is: " + federalTax);
        System.out.println("Your tax total is: " + totalTax);
        System.out.println("Your net income is: " + netIncome);

        scan.close();





    }
}
