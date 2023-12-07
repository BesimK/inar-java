package QA.assignments;

import java.util.Scanner;

public class Question_04_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String myString = input.nextLine();
        System.out.print("Enter string 1: ");
        String subString = input.nextLine();
        if(myString.contains(subString)){
            System.out.println(subString + " is a substring of " + myString);


        }else {
            System.out.println(subString + " is not a substring of " + myString);
        }
    }
}
