package QA.assignments;

import java.util.Scanner;

public class Question_06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side : ");
        double side = input.nextDouble();

        double areaOfPentagon = area(side);

        System.out.println("The area of pentagon is " + areaOfPentagon);
    }

    public static double area(double side) {
        return (5 * (Math.pow(side, 2))) / (4 * Math.tan(Math.PI / 5));
    }
}