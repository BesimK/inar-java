package QA.week_12.assignments;

import java.io.*;
import java.util.*;

public class Question_12_22 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage : java Question_12_22 directoryPath oldString newString");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("Existential problems bruh!");
            System.exit(1);
        }
        recursiveDirectory(file, args[1], args[2]);
    }

    private static void recursiveDirectory(File file, String oldStr, String newStr) {
        ArrayList<File> directories = new ArrayList<>();
        if (file.isFile()) {
            changeFile(file, oldStr, newStr);
            return;
        } else if (file.isDirectory()) {
            directories.add(file);
        }
        while (!directories.isEmpty()) {
            File currentDirectory = directories.remove(0);
            File[] files = currentDirectory.listFiles();
            for (File f : files) {
                if (f.isDirectory()) {
                    directories.add(f);
                } else if (f.isFile()) {
                    changeFile(f, oldStr, newStr);
                }
            }
        }
    }
    public static void changeFile(File file, String oldString, String newString) {
        StringBuilder page = new StringBuilder();
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String line = input.nextLine();
                line = line.replaceAll(oldString, newString);
                page.append(line).append("\n");
            }
            PrintWriter output = new PrintWriter(file);
            output.println(page);
            output.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
    }
}