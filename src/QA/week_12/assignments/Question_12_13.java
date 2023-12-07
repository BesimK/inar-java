package QA.week_12.assignments;

import java.io.*;
import java.util.*;

public class Question_12_13 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        int lineCounter=0;
        int wordCounter=0;
        int characterCounter=0;

        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_12 sourceFile");
            return;
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("Existential Problem Again?");
            return;
        }
        Scanner input = new Scanner(file);
        while (input.hasNext()){
            String line = input.nextLine();
            lines.add(line);
            String[] words = line.split("\\s+");
            wordCounter+=words.length;
            for (int i = 0; i < words.length; i++) {
                characterCounter+=words[i].length();
            }
        }
        lineCounter=lines.size();
        System.out.println("The file " + file.getName() + " has:");
        System.out.println(characterCounter + " Characters");
        System.out.println(wordCounter + " words");
        System.out.println(lineCounter + " lines");
    }
}
