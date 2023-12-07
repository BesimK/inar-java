package QA.assignments;

import java.util.Scanner;

public class Question_02_12 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the speed and the acceleration: ");
        double speed = scanner.nextDouble();
        double acceleration = scanner.nextDouble();
        System.out.println("The minimum runway length for this airplane is " + ((speed*speed)/(2*acceleration)));
    }
}
