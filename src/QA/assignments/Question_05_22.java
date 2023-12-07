package QA.assignments;

import java.util.Scanner;

public class Question_05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        double loanAmount=input.nextDouble();
        System.out.print("Number of years: ");
        double numberOfYears=input.nextDouble();
        System.out.println("Annual Interest Rate: ");
        double annualInterestRate=input.nextDouble();
        double monthlyInterestRate=annualInterestRate/(12.0*100.0);
        double monthlyPayment=(loanAmount*monthlyInterestRate)/
                (1.0-(1.0/(Math.pow((1.0+monthlyInterestRate),(numberOfYears*12.0)))));
        System.out.println("Monthly Payment: " + monthlyPayment);
        double totalPayment=monthlyPayment*numberOfYears*12;
        System.out.println("Total Payment: " + totalPayment);
        double interest,principal,balance;
        balance =loanAmount;

        System.out.println("Payment#\t\tInterest\t\t    Principal\t\t\tBalance");
        for (int i = 1; i <=numberOfYears*12 ; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%d\t\t\t\t%2.2f\t\t\t\t%3.2f\t\t\t\t%4.2f%n",i,interest,principal,balance);

        }

    }
}
