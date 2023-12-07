package QA.assignments;

import java.util.Scanner;

public class Question_04_21 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a SSN: ");
        String SSN = input.nextLine();
        if     (SSN.charAt(0) >47 && SSN.charAt(0) < 58 &&
                SSN.charAt(1) >47 && SSN.charAt(1) < 58 &&
                SSN.charAt(2) >47 && SSN.charAt(2) < 58 &&
                SSN.charAt(3) == '-' &&
                SSN.charAt(4) >47 && SSN.charAt(4) < 58 &&
                SSN.charAt(5) >47 && SSN.charAt(5) < 58 &&
                SSN.charAt(6) == '-' &&
                SSN.charAt(7) >47 && SSN.charAt(7) < 58 &&
                SSN.charAt(8) >47 && SSN.charAt(8) < 58 &&
                SSN.charAt(9) >47 && SSN.charAt(9) < 58 &&
                SSN.charAt(10) >47 && SSN.charAt(10) < 58){


            System.out.println(SSN + " is a valid social security number");
        }
        else {
            System.out.println(SSN + " is not a valid social security number");

        }
    }
}
