package QA.week_11.assignments;

import java.util.Scanner;

import QA.week_11.additionalClasses.Triangle;

public class Question_11_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        System.out.print("Enter a color: ");
        String color = input.next();
        System.out.println("Is the triangle filled (true/false) ?: ");
        boolean filled = input.nextBoolean();
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);


        System.out.println(triangle.toString());
    }
}
