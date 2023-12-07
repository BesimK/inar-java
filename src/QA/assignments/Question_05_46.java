package QA.assignments;

import java.util.Scanner;

public class Question_05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String entry = input.nextLine();
        String reversed="";
        for (int i = entry.length(); i>0; i--) {
            reversed = reversed.concat(String.valueOf(entry.charAt(i-1)));
        }
        System.out.println("Reversed string is " + reversed);
    }
}
