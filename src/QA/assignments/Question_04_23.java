package QA.assignments;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name:  ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week:  ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate:  ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate :  ");
        double taxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate :  ");
        double stateRate = input.nextDouble();
        double grossPay=(hourlyPayRate * hoursWorked);
        double federalTotalTax = (taxRate*grossPay);
        double stateTotalTax = (stateRate*grossPay);
        System.out.println("Employee name: " + name);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Pay rate: $" + hourlyPayRate);
        System.out.println("Gross pay: $" + grossPay);
        System.out.println("Deductions: ");
        System.out.printf("\tFederal Withholding (%2.1f%s): $%3.1f%n" ,(taxRate*100),"%", federalTotalTax);
        System.out.printf("\tState Withholding (%2.1f%s): $%3.2f%n" ,(stateRate*100),"%", stateTotalTax);
        System.out.printf("\tTotal deduction: $%3.2f%n" , (federalTotalTax + stateTotalTax));
        System.out.printf("Net Pay: $%2.2f" , (grossPay - federalTotalTax -stateTotalTax));
    }
}
