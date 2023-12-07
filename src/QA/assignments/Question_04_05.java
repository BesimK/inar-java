package QA.assignments;

import java.util.Scanner;

public class Question_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides :");
        double numberOfSides = input.nextDouble();


        System.out.print("Enter the length of a side :");
        double sidesLength = input.nextDouble();

        double area = (numberOfSides * (Math.pow(sidesLength,2)))/(4.0 * Math.tan(Math.PI/numberOfSides));

        System.out.println("The area of the polygon is " + area);

    }
}
