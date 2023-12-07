package QA.assignments;

import java.util.Scanner;

public class Question_03_26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer :");

        int user = input.nextInt();


        System.out.println("Is " + user + " divisible by 5 and 6 ?" + (user % 5 == 0 && user % 6 == 0));
        System.out.println("Is " + user + " divisible by 5 or 6 ?" + (user % 5 == 0 || user % 6 == 0));
        System.out.println("Is " + user + " divisible by 5 or 6, but not both ?" + (user % 5 == 0 ^ user % 6 == 0));
    }
}
