package QA.assignments;

import java.util.Scanner;

public class Question_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount (e.g 11,56): ");
        double amount = input.nextDouble();
        System.out.println("Your amount " + amount + " consist of");

        int remaining = (int) (amount * 100);

        System.out.println((remaining / 100) + " dollars");
        remaining = remaining % 100;

        System.out.println((remaining / 25) + " quarters");
        remaining = remaining % 25;

        System.out.println((remaining / 10) + " dimes");
        remaining = remaining % 10;

        System.out.println((remaining / 5) + " nickels");
        remaining = remaining % 5;

        System.out.println(remaining + " pennies");

    }
}
