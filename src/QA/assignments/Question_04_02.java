package QA.assignments;

import java.util.Scanner;

public class Question_04_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 6371.01;
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");

        double x1 = input.nextDouble();
        x1 = Math.toRadians(x1);
        double y1 = input.nextDouble();
        y1 = Math.toRadians(y1);

        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");

        double x2 = input.nextDouble();
        x2 = Math.toRadians(x2);
        double y2 = input.nextDouble();
        y2 = Math.toRadians(y2);

        double distance = radius * Math.acos((Math.sin(x1)*Math.sin(x2))+(Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2)));

        System.out.printf("Distance between the two point is %6.2f",distance);

    }
}
