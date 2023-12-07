package QA.week_12.assignments;

import java.io.*;
import java.util.*;

public class Question_12_17 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("There lies no such file, my dear!");
            return;
        }
        Scanner input = new Scanner(file);

        ArrayList<String> words = new ArrayList<>();
        while (input.hasNextLine()) {
            words.addAll(Arrays.asList(input.nextLine().split("\\s+")));
        }
        String wordChosen = words.get((int) (Math.random() * words.size()));
        System.out.println(wordChosen);
        char[] mask = new char[wordChosen.length()];
        Arrays.fill(mask, '*');
        var gameContinues = true;
        var guessCounter = 0;
        while (gameContinues) {
            System.out.print("(Guess) Enter a letter in word " + Arrays.toString(mask) + " -> " );
            char guess = scanner.next().charAt(0);
            if (alreadyShown(guess,mask)) {
                System.out.println(guess + " is already in the shown part!");
                continue;

            }
            if (doesNotExist(guess,mask,wordChosen)) {
                System.out.println(guess + " is not in the word!");
                guessCounter++;
                continue;
            }
            for (char index : mask) {
                if ((index == '*')) {
                    gameContinues = true;
                    break;
                }
                gameContinues = false;
            }
        }
        System.out.println("The word is \"" + wordChosen + "\" . You missed " + ((guessCounter==0)?"none" :( guessCounter + ((guessCounter>1)?" times":" time"))));
    }

    private static boolean doesNotExist(char guess, char[] mask, String wordChosen) {
        var condition = true;
        for (int i = 0; i < wordChosen.length(); i++) {
            if (guess == wordChosen.charAt(i)) {
                mask[i] = guess;
                condition = false;
            }
        }
        return condition;
    }

    private static boolean alreadyShown(char guess, char[] mask) {
        for (char c : mask) {
            if (guess == c) {
                return true;
            }
        }
        return false;
    }
}
