package QA.assignments;

import java.util.Scanner;

public class Question_04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int ascii = input.nextInt();

        if (ascii >= 0 && ascii <= 127 ){
            System.out.println("The character for ASCII code " + ascii
            + " is " + ((char)ascii));
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
