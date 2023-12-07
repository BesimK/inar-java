package QA.week_12.assignments;

import java.io.*;
import java.util.*;

public class Question_12_12 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
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
        while (input.hasNextLine()) {
            String line = input.nextLine();
            lines.add(line);
        }
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).contains("{")) {
                String processingLine = lines.get(i);
                processingLine = processingLine.replace('{', ' ');
                String precedingLine = lines.get(i - 1);
                precedingLine = precedingLine + " {";
                lines.set(i, processingLine);
                lines.set(i - 1, precedingLine);
            }
        }
        PrintWriter writer = new PrintWriter(file);
        for (String line : lines) {
            writer.println(line);
        }
        writer.close();
    }
}
