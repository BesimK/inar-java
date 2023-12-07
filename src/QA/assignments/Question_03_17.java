package QA.assignments;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int CPU = (int) (Math.random() * 3);

        System.out.println("scissors (0), rock (1), paper(2):");
        int player = input.nextInt();
        if (CPU == 0) {
            System.out.print("Computer is scissors.");
            if (player == 0) {
                System.out.println("You are scissors too. It is a draw.");

            } else if (player == 1) {
                System.out.println("You are rock. You won.");
            } else {
                System.out.println("You are paper. You lost.");
            }
        } else if (CPU == 1) {
            System.out.print("Computer is rock.");
            if (player == 0) {
                System.out.println("You are scissors. You lost.");

            } else if (player == 1) {
                System.out.println("You are rock too. It is a draw.");
            } else {
                System.out.println("You are paper. You won.");
            }
        } else if (CPU == 2) {
            System.out.print("Computer is paper.");
            if (player == 0) {
                System.out.println("You are scissors. You won.");

            } else if (player == 1) {
                System.out.println("You are rock. You lost.");
            } else {
                System.out.println("You are paper too. It is a draw.");
            }
        }
    }
}