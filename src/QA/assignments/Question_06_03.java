package QA.assignments;

import java.util.Scanner;

public class Question_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int number = input.nextInt();
        if(isPalindrome(number)){
            System.out.println(number + " is a palindrome");
        }
        else {
            System.out.println(number + "is not a palindrome");
        }

    }
    public static int reverse(int number){
        String reversedNumber="";
        while(number!=0){
            reversedNumber=reversedNumber + number%10;
            number=number/10;
        }

    return Integer.parseInt(reversedNumber);
    }
    public static boolean isPalindrome(int number){
        int control=reverse(number);
        return control == number;
    }
}
