package QA.assignments;

import java.util.Scanner;

public class Question_05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String entry = input.nextLine();
        int upperCaseCounter=0;
        for (int i = 0; i < entry.length(); i++) {
            if (entry.charAt(i)>='A'&&entry.charAt(i)<='Z'){
                upperCaseCounter++;
            }
        }
        System.out.println("The number of uppercase letters is " + upperCaseCounter);
    }
}
