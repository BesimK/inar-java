package QA.assignments;

import java.util.Scanner;

public class Question_03_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit integer: ");

        int palindrome = input.nextInt();
        int firstDigit = palindrome / 100;
        int remaining = palindrome % 100;
        int secondDigit = remaining / 10;
        remaining = palindrome % 10;
        int test = (remaining * 100) + (secondDigit * 10) + (firstDigit);
        if(palindrome == test){
            System.out.println(palindrome + " is a palindrome");
        }
        else {
            System.out.println(palindrome + " is not a palindrome");
        }


    }
}
