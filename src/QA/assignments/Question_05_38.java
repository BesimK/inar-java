package QA.assignments;

import java.util.Scanner;

public class Question_05_38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer : ");

        int decimalNumber = input.nextInt();

        int quotient = decimalNumber;

        String octalNumber = "";

        String remainder = "";


        while (quotient != 0) {

            remainder = Integer.toString(quotient % 8);

            quotient = quotient / 8;

            octalNumber = remainder.concat(octalNumber);
        }

        System.out.printf("The binary value of the decimal \"%d\" is : %s",decimalNumber,octalNumber);


    }
}