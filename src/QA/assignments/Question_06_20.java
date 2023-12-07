package QA.assignments;

import java.util.Scanner;

public class Question_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = input.nextLine();
        System.out.println("Number of letters in the string " + sentence +" is " + countLetters(sentence));
    }
    public static int countLetters(String sentence){
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i)!=' '){
                counter++;
            }
        }
    return counter;
    }
}
