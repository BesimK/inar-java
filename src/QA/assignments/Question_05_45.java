package QA.assignments;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        double sum = 0;
        double totalPows=0;
        for (int i = 1; i <=10 ; i++) {
            double number = input.nextDouble();
            sum += number;
            totalPows += Math.pow(number,2);
        }
        System.out.println("The mean is " + (sum/10.0));
        double deviation = Math.sqrt((totalPows-((Math.pow(sum,2)/10.0)))/9);
        System.out.printf("The deviation is %.5f",deviation);


    }
}