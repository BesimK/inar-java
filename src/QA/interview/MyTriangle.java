package QA.interview;

import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }
    public static boolean isValid(double side1,double side2,double side3){
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }
    public static double area(double side1,double side2,double side3){
    return side1*side2*side3;
    }
}
