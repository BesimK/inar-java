package QA.assignments;

import java.util.Scanner;

public class Question_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number = input.nextLong();
        System.out.printf("The approximate square root of %d is  %.1f ",number,sqrt(number));
    }
    public static double sqrt(long number){
        double lastGuess=1;
        double nextGuess=(lastGuess + (number/lastGuess))/2;
        while (Math.abs(lastGuess-nextGuess)>0.00001){
            lastGuess=nextGuess;
            nextGuess=(lastGuess + (number/lastGuess))/2;
        }
        return Math.round(nextGuess);
    }
}
