package QA.assignments;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, input ends if it is 0:");
        int number = input.nextInt();
        double total = 0;
        int negativeNumber = 0;
        int positiveNumber = 0;
        if (number == 0) {
            System.out.println("No numbers are entered except 0");
        }
        else{
            while (number != 0) {
                if(number>0){
                    positiveNumber++;
                }
                if(number<0){
                    negativeNumber++;
                }
                total = total + number;

                number = input.nextInt();
            }
            double average = total / (positiveNumber + negativeNumber);
            System.out.println("The number of positives is " + positiveNumber);
            System.out.println("The number of negative is " + negativeNumber);
            System.out.println("The total is " + total);
            System.out.println("The average is " + average);
        }
    }
}
