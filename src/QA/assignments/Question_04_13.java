package QA.assignments;

import java.util.Scanner;

public class Question_04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = input.nextLine();
        if ((int) letter.charAt(0) >= 0 && (int) letter.charAt(0) <= 127 && letter.length()<2){

            char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

            for (int i = 0; i < vowel.length - 1; i++) {
                if (letter.charAt(0) == vowel[i]) {
                    System.out.println(letter + " is a vowel");
                    System.exit(1);
                }

            }
            System.out.println(letter + " is a constant");

        }
        else{
            System.out.println(letter.charAt(0) + " is an invalid input ");
        }
    }
}