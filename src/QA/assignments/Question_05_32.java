package QA.assignments;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstDigit = (int)(Math.random()*10);
        int secondDigit = (int)(Math.random()*10);
        while(true){
            secondDigit = (int)(Math.random()*10);
            if(firstDigit==secondDigit){
                secondDigit = (int)(Math.random()*10);
            }
            else{
                break;
            }
        }
        int lottery = (firstDigit*10)+secondDigit;
        System.out.println("Enter your lottery pick (two distinct digits): ");
        int guess = input.nextInt();
        System.out.println(("Lottery number is " + firstDigit )+ secondDigit);
        if(guess/10==firstDigit && guess%10==secondDigit){
            System.out.println("Match two digits: You win $10,000");
        }
        else if(guess/10==secondDigit && guess%10==firstDigit){
            System.out.println("Match two digits: You win $3,000");
        }
        else if(guess/10==secondDigit || guess%10==firstDigit ||
                guess/10==firstDigit || guess%10==secondDigit){
            System.out.println("Match one digits: You win $1,000");
        }
        else {
            System.out.println("Sorry, no match");
        }
    }

}
