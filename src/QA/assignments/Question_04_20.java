package QA.assignments;

import java.util.Scanner;

public class Question_04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String entry = input.nextLine();

        System.out.println("Length of this string: " + entry.length());
        System.out.print("First character of the string: " + entry.charAt(0));


    }
}
