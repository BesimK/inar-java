package QA.assignments;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String entry = input.nextLine();
        int vowelCounter = 0;
        int consonantCounter = 0;
        for (int i = 0; i < entry.length(); i++) {
            if(String.valueOf(entry.charAt(i)).equalsIgnoreCase("a")||
                    String.valueOf(entry.charAt(i)).equalsIgnoreCase("e")||
                    String.valueOf(entry.charAt(i)).equalsIgnoreCase("i")||
                    String.valueOf(entry.charAt(i)).equalsIgnoreCase("o")||
                    String.valueOf(entry.charAt(i)).equalsIgnoreCase("u")){
                vowelCounter++;
            }
            else if(String.valueOf(entry.charAt(i)).equalsIgnoreCase(" ")){
                continue;
            }
            else {
                consonantCounter++;
            }
        }
        System.out.println("The number of vowels is " + vowelCounter);
        System.out.println("The number of consonants is " + consonantCounter);

    }
}
