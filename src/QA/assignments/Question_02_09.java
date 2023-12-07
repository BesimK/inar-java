package QA.assignments;

import java.util.Scanner;

public class Question_02_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter v0 v1 and t : ");
        double v0 = scan.nextDouble();
        double v1 = scan.nextDouble();
        double t = scan.nextDouble();
        System.out.println("The average acceleration is " + ((v1-v0)/t));

    }
}
