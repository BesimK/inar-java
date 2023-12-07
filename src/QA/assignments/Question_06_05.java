package QA.assignments;

import java.util.Scanner;

public class Question_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        displaySortedNumbers(number1,number2,number3);
    }
    public static void displaySortedNumbers(double number1,double number2,double number3){
        double max = Math.max(number1,Math.max(number2,number3));
        double min = Math.min(number1,Math.min(number2,number3));
        double mid;
        if (number1!=max&&number1!=min){
            mid=number1;
        } else if (number2!=max&&number2!=min) {
            mid=number2;
        }else mid=number3;
        System.out.printf("%.1f %.1f %.1f",min,mid,max);
    }
}
