package QA.assignments;

import java.util.Scanner;

public class Question_02_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 0 - 1000: ");
        int number = scan.nextInt();
        int sum = (number%10)+((number%100)/10)+((number%1000)/100);
        System.out.println("The sum of the digits is: " + sum);

    }
}
