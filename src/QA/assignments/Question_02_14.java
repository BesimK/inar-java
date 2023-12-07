package QA.assignments;

import java.util.Scanner;

public class Question_02_14 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds : ");
        double pounds = scanner.nextDouble();
        System.out.println("Enter height in inches : ");
        double inches = scanner.nextDouble();
        double kilogram = pounds * 0.45359237;
        double meter = inches *  0.0254;
        System.out.println("BMI is " + (kilogram / (Math.pow(meter,2))));

        }
}
