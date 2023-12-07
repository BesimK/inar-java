package QA.assignments;

import java.util.Scanner;

public class Question_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String ISBN = input.next();

        String checkSum = "";
        int lastDigit = ( (Character.getNumericValue(ISBN.charAt(0)) * 1) +
                (Character.getNumericValue(ISBN.charAt(1)) * 2) +
                (Character.getNumericValue(ISBN.charAt(2)) * 3) +
                (Character.getNumericValue(ISBN.charAt(3)) * 4) +
                (Character.getNumericValue(ISBN.charAt(4)) * 5) +
                (Character.getNumericValue(ISBN.charAt(5)) * 6) +
                (Character.getNumericValue(ISBN.charAt(6)) * 7) +
                (Character.getNumericValue(ISBN.charAt(7)) * 8) +
                (Character.getNumericValue(ISBN.charAt(8)) * 9)) % 11;

        if ( lastDigit == 10 ){
            checkSum = "X";
            System.out.println("The ISBN-10 number is " + ISBN + checkSum);
        }
        else {
            System.out.println("The ISBN-10 number is " + ISBN + lastDigit);
        }


    }
}
