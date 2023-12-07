package QA.week_09.assignments;

import QA.week_09.additionalClasses.QuadraticEquation;

import java.util.Scanner;

public class Question_09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminants() > 0) {
            System.out.println("Equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminants() == 0) {
            System.out.println("Equation has one root " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Equation has no real roots");
        }
    }
}
