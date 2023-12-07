package QA.assignments;

import java.util.Scanner;

public class Question_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Loan amount: ");
        double loanAmount=input.nextDouble();
        System.out.println("Number of years: ");
        double numberOfYears=input.nextDouble();
        System.out.println("Interest Rate\t\tMonthly Payment\t\tTotal Payment");
        double interestRate=5.0;
        double monthlyPayment;
        double totalPayment;
        while(interestRate<=8.0){

            monthlyPayment=(loanAmount*(interestRate/(12*100.0))/(1.0-(1.0/(Math.pow((1.0+(interestRate/(12*100.0))),(numberOfYears*12.0))))));
            totalPayment=monthlyPayment*numberOfYears*12;
            System.out.printf("%1.3f%%\t\t\t\t%3.2f\t\t\t\t%5.2f%n",interestRate,monthlyPayment,totalPayment);
            interestRate+=0.125;
        }
    }
}
