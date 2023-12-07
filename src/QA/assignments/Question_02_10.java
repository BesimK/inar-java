package QA.assignments;

import java.util.Scanner;

public class Question_02_10 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms : ");
        double amount = scanner.nextDouble();
        System.out.println("Enter the initial temperature in celsius : ");
        double initialTemperature = scanner.nextDouble();
        System.out.println("Enter the final temperature in celsius : ");
        double finalTemperature = scanner.nextDouble();

        System.out.println("The needed energy is : "+ ( amount * (finalTemperature-initialTemperature) * 4184));




    }
}
