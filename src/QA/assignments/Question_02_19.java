package QA.assignments;

import java.util.Scanner;

public class Question_02_19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three points for triangle : ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double side1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double side2 = Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
        double side3 = Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));
        double s = (side1+side2+side3)/2.0;
        double area = Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
        System.out.println("The area of triangle is : " + area);
    }
}
