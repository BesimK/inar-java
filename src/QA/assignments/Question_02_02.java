package QA.assignments;
import java.util.Scanner;

public class Question_02_02 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius and length of the cylinder");
        double radius = scan.nextDouble();
        double length = scan.nextDouble();
        final double PI = Math.PI;
        double area = radius * radius * PI;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }
}

