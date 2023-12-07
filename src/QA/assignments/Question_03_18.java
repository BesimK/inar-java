package QA.assignments;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the wight of the package ( in pounds ) :  ");
        double weight = input.nextDouble();
        if (weight > 0 && weight <= 1) {
            System.out.println("Shipping cost of the package is $" + (3.5 * weight));
        } else if (weight <= 3) {
            System.out.println("Shipping cost of the package is $" + (5.5 * weight));
        } else if (weight <= 10) {
            System.out.println("Shipping cost of the package is $" + (8.5 * weight));
        } else if (weight <= 20) {
            System.out.println("Shipping cost of the package is $" + (10.5 * weight));
        }
        else {
            System.out.println("The package cannot be shipped.");
        }
    }
}