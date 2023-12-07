package QA.interview;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HangBoy {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the absolute path of the text file:");
        String filePath = input.next();

        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Existential problems bruh!");
            System.exit(4127);
        }
        if (!file.isFile()) {
            System.out.println("This ain't a file bruh!");
            System.exit(4127);
        }
        input = new Scanner(file);
        ArrayList<String> words = new ArrayList<>();
        while (input.hasNextLine()) {
            words.addAll(Arrays.asList(input.nextLine().split("\\s+")));
        }
        String wordChosen = words.get((int) (Math.random() * words.size()));
        char[] mask = new char[wordChosen.length()];
        Arrays.fill(mask, '*');
        boolean condition = true;
        System.out.println(wordChosen);
        int counter = 0;
        input = new Scanner(System.in);
        while (condition) {
            boolean found = false;
            System.out.print("(Guess) Enter a letter in word " + Arrays.toString(mask) + " -> ");
            char guess = input.next().charAt(0);
            if(shownLetters(guess,mask)){
                System.out.println(guess + " is already in the word");
                continue;
            }
            if(letterNotFound(guess,wordChosen)){
                System.out.println(guess + " is not in the word");
                counter++;
                continue;
            }
            for (int i = 0; i < wordChosen.length(); i++) {
                if (guess == wordChosen.charAt(i)) {
                    mask[i] = guess;
                    found=true;
                }
            }
            for (int i = 0; i < mask.length; i++) {
                if ((mask[i] == '*')) {
                    break;
                }
                condition = false;

            }
        }
        System.out.println("Word is " + wordChosen + " Total guess -> " +counter + ((counter<=1)?" time": " times"));
    }

    private static boolean letterNotFound(char guess, String wordChosen) {
        for (int i = 0; i < wordChosen.length(); i++) {
            if(wordChosen.charAt(i)==guess){
                return false;
            }
        }
        return true;
    }

    private static boolean shownLetters(char guess, char[] mask) {
        for (int i = 0; i < mask.length;i++) {
            if(mask[i]==guess){
                return true;
            }
        }
        return false;
    }
}
