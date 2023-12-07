package QA.week_13.Question_13_19;

import QA.week_13.Question_13_18.Rational;

import java.util.Scanner;
public class Question_13_19 {
    public static void main(String[] args) {
        printRationalNumber();
        }
    private static void printRationalNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        double number = input.nextDouble();
        input.close();
        String str = String.valueOf(number);
        String[] array = str.split("\\.");
        double power = array[1].length();
        number = number*Math.pow(10,power);
        Rational rational1 = new Rational((long)number,(long)Math.pow(10,power));
        System.out.println(rational1);
    }
}