package QA.week_12.assignments;

import QA.week_12.additionalClasses.IllegalTriangleException;
import QA.week_12.additionalClasses.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        try {
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            Triangle myTriangle = new Triangle(a,b,c);
            System.out.println(myTriangle);
        }catch (InputMismatchException ex){
            System.out.println("Input Mismatch");
        }catch (IllegalTriangleException ex){
            System.out.println(ex);
        }




    }
}
