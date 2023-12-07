package QA.assignments;

import java.util.Scanner;

public class Question_03_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c:");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b,2) - (4 * a * c);

        if (discriminant < 0){
            System.out.println("The equation has no roots.");

        } else if (discriminant == 0) {
            double root = (-b + Math.sqrt(Math.pow(b,2) - (4 * a * c))) / (2 * a);;
            System.out.printf("The equation has one root %.0f" , root);


        }
        else {
            double root1 = (-b + Math.sqrt(Math.pow(b,2) - (4 * a * c))) / (2 * a);
            double root2 = (-b - Math.sqrt(Math.pow(b,2) - (4 * a * c))) / (2 * a);
            System.out.printf("The equation has two roots %0,6f %0,6f " , root1 , root2);
        }

    }
}
