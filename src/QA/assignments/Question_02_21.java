package QA.assignments;

import java.util.Scanner;

public class Question_02_21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter investment amount : ");
        double investmentAmount = scanner.nextDouble();
        System.out.print("Enter annual interest rate : ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate/12/100;
        System.out.print("Enter number of years : ");
        double numberOfYears = scanner.nextDouble();
        double futureInvestmentValue = investmentAmount * Math.pow((1+(monthlyInterestRate)),(numberOfYears*12));

        System.out.println("Accumulated value is : $" + futureInvestmentValue);
    }
}
