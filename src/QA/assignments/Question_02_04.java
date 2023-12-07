package QA.assignments;

import java.util.Scanner;

public class Question_02_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pounds = scan.nextDouble();
        System.out.println(pounds + " pounds is " + pounds * 0.454);
    }
}