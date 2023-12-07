package QA.assignments;

import java.util.Scanner;

public class Question_02_22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount as integer, for example 1156 for 11.56 : ");
        int amount = scanner.nextInt();
        System.out.println("Your amount " + amount + " consists of ");
        int remaining = amount;
        System.out.println( remaining / 100 + " dollars");
        remaining = remaining % 100;
        System.out.println( remaining / 25 + " quarters");
        remaining = remaining % 25;
        System.out.println( remaining / 10 + " dimes");
        remaining = remaining % 10;
        System.out.println( remaining / 5 + " nickels");
        remaining = remaining % 5;
        System.out.println( remaining + " pennies");

    }

}
