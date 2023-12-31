package QA.week_02.assignments;

import java.util.Scanner;

public class Question_02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int year = input.nextInt();
        double futureInvestmentValue = investment * (Math.pow(1 + (annualInterestRate / 1200), year * 12));
        System.out.println("Accumulated value is $" + (int)(futureInvestmentValue*100)/100.0);
    }
}
