package QA.assignments;

import java.util.Scanner;

public class Question_03_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int) (Math.random()*100);
        int b = (int) (Math.random()*100);
        int result = a + b;

        System.out.println("What is " + a + " + " + b);
        int answer = input.nextInt();
        if (answer == result){
            System.out.println("You are correct!");
        }
        else {
            System.out.println("You are wrong ! " + a + " + " + b + " should be " + result);
        }
    }
}
