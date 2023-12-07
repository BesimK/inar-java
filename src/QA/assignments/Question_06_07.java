package QA.assignments;

import java.util.Scanner;

public class Question_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualRate= input.nextDouble();
        double monthlyInterestRate=annualRate/1200;
        System.out.println("Years Future Value: ");
        for (int i = 1; i <= 30 ; i++) {
            System.out.printf("%d %.2f%n",i,futureInvestmentValue(amount,monthlyInterestRate,i));
        }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount*Math.pow((1+monthlyInterestRate),years*12);
    }
}
