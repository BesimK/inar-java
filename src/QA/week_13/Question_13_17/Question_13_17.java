package QA.week_13.Question_13_17;

import java.util.Scanner;

public class Question_13_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first complex number:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.print("Enter second complex number:");
        double c =input.nextDouble();
        double d =input.nextDouble();
        Complex number1 = new Complex(a,b);
        Complex number2 = new Complex(c,d);
        System.out.println("(" + number1 + ")" + " + " + "(" + number2 + ")" + " = " + number1.add(number2));
        System.out.println("(" + number1 + ")" + " - " + "(" + number2 + ")" + " = " + number1.subtract(number2));
        System.out.println("(" + number1 + ")" + " * " + "(" + number2 + ")" + " = " + number1.multiply(number2));
        System.out.println("(" + number1 + ")" + " / " + "(" + number2 + ")" + " = " + number1.divide(number2));
        System.out.println("|" + number1 + "| -> " + number1.absoluteValue() );

    }
}
