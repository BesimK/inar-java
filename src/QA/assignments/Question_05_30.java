package QA.assignments;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount (e.g. 100): ");
        double amount = input.nextDouble();
        double lastAmount = amount;
        System.out.print("Enter the annual interest rate (e.g. 5): ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate/1200;
        System.out.print("Enter the number of months (e.g. 6): ");
        int numberOfMonths = input.nextInt();
        for (int i = 1; i < numberOfMonths ; i++) {
            lastAmount = (amount+lastAmount)*(1+monthlyInterestRate);

        }
        System.out.printf("Amount in savings account after %d months : $%.2f", numberOfMonths, lastAmount);

    }
}
