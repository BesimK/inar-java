package QA.week_10.assignments;

import QA.week_09.additionalClasses.Account;

import java.util.Scanner;

public class Question_10_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }
        while (true) {
            System.out.print("Enter an id :");
            int id = input.nextInt();
            if (id > 9 || id < 0) {
                System.out.println("Wrong id try again!");
                continue;
            }
            while (true) {

                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice :");
                int choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("The balance is " + accounts[id].getBalance());
                } else if (choice == 2) {
                    System.out.println("Enter an amount to withdraw :");
                    double amount = input.nextDouble();
                    accounts[id].withdraw(amount);
                } else if (choice == 3) {
                    System.out.println("Enter an amount to deposit :");
                    double amount = input.nextDouble();
                    accounts[id].deposit(amount);
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("Wrong choice try again!");
                }
            }
        }
    }
}

