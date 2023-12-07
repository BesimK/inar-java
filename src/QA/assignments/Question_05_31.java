package QA.assignments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial deposit amount: ");
        double initialAmount = input.nextDouble();

        System.out.println("Enter annual percentage yield: ");
        double annualPercentageYield = input.nextDouble();
        double monthlyPercentageYield = annualPercentageYield/1200;

        System.out.println("Enter maturity period (number of months): ");
        double maturityPeriod = input.nextDouble();
        System.out.println("Month CD Value");
        for (int i = 1; i <=maturityPeriod ; i++) {
            initialAmount = initialAmount*(1+monthlyPercentageYield);
            System.out.printf("%d %.2f\n",i,initialAmount);
        }

    }
}
