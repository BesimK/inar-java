package QA.assignments;

import java.util.Scanner;

public class Question_03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from USD to RMB: ");
        double rate = input.nextDouble();
        System.out.print("Enter 0 to convert USD to RMB and 1 for vice versa: ");
        int choice = input.nextInt();
        double amount;
        if (choice == 0) {
            System.out.print("Enter USD amount:");
            amount = input.nextDouble();
            System.out.println("$" + amount + " is " + (rate * amount) + " yuan.");


        } else if (choice == 1) {
            System.out.print("Enter RMB amount:");
            amount = input.nextDouble();
            System.out.println(amount + " yuan is $" + ((1.0 / rate) * amount));

        } else {

            System.out.println("Incorrect input");

        }

    }
}
