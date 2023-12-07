package QA.week_09.assignments;
import QA.week_09.additionalClasses.LinearEquation;
import java.util.Scanner;

public class Question_09_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c,d,e,f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);
        System.out.println((linearEquation.isSolvable())?
                "x is " + linearEquation.getX() + " y is " + linearEquation.getY():
                "The equation has no solution");
    }
}
