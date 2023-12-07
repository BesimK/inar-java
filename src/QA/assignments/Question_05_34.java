package QA.assignments;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int CPU ;
        int CPUCounter=0;
        int playerCounter=0;
        boolean control=true;
        while (control) {
            CPU = (int)(Math.random()*3);
            System.out.println("scissors (0),rock (1),paper (2): ");
            int choice = input.nextInt();

            if (CPU == 0) {
                System.out.print("Computer is scissors ");
                if (choice == 0) {
                    System.out.print("You are scissors too. It's a draw. \n");
                }
                else if (choice == 1) {
                    System.out.print("You are rock. You won. \n");
                    playerCounter++;
                }
                else if (choice == 2) {
                    System.out.print("You are paper. You lose. \n");
                    CPUCounter++;
                }
                else {
                    System.out.println("Invalid entry.\n");
                    continue;
                }
            }
            else if (CPU == 1) {
                System.out.print("Computer is rock ");
                if (choice == 0) {
                    System.out.print("You are scissors . You lose. \n");
                    CPUCounter++;
                }
                else if (choice == 1) {
                    System.out.print("You are rock. It's a draw. \n ");

                }
                else if (choice == 2) {
                    System.out.print("You are paper. You win. \n");
                    playerCounter++;
                }
                else {
                    System.out.println("Invalid entry.\n");
                    continue;
                }
            }
            else if (CPU == 2) {
                System.out.print("Computer is paper ");
                if (choice == 0) {
                    System.out.print("You are scissors . You won. \n");
                    playerCounter++;
                }
                else if (choice == 1) {
                    System.out.print("You are rock. You lose. \n");
                    CPUCounter++;
                }
                else if (choice == 2) {
                    System.out.print("You are paper. It's a draw. \n");
                }
                else {
                    System.out.println("Invalid entry.\n");
                    continue;
                }
            }
            System.out.println("Computer wins: " + CPUCounter);
            System.out.println("User wins: " + playerCounter);

            if(Math.abs(CPUCounter-playerCounter)==2){
                control=false;
            }
        }
    }
}
