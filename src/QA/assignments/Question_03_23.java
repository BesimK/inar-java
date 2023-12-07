package QA.assignments;

import java.util.Scanner;

public class Question_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x >= -5 && x <= 5 && y >= -2.5 && y <= 2.5){
            System.out.println("Point (" + x + ", " + y + ") is in the rectangular");
        }
        else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangular");
        }
    }
}
