package QA.assignments;
import QA.interview.MyTriangle;

import java.util.Scanner;

public class Question_06_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 sides of a triangle");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (MyTriangle.isValid(a,b,c)){
            System.out.println("The area of the triangle is " + MyTriangle.area(a,b,c));
        }
        else System.out.println("Invalid input");
    }
}
