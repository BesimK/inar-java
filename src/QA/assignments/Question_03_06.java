package QA.assignments;

import java.util.Scanner;

public class Question_03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        double totalInches = inches + (feet * 12);
        double kilogram = weight * 0.45359237;
        double meter = totalInches * 0.0254;
        double BMI = kilogram / (meter * meter);

        System.out.println("BMI is " + BMI);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI < 25) {
            System.out.println("Normal");
        } else if (BMI < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
}
