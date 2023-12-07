package QA.assignments;

import java.util.Scanner;

public class Question_02_16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of the hexagon : ");
        double side = scanner.nextDouble();
        System.out.println("The area of the hexagon is : " + (((3.0*Math.sqrt(3.0)/2.0)*Math.pow(side,2.0))));
        }
}
