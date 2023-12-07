package QA.week_12.assignments;

import java.io.*;
import java.util.*;

public class Question_12_20 {
    public static void main(String[] args) throws Exception {
        ArrayList<File> directories = new ArrayList<>();
        if (args.length != 1) {
            System.out.println("Usage : java Question_12_20.java srcRootDirectory");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (file.isDirectory()) {
            directories.add(file);
        }
        while (!directories.isEmpty()) {
            File currentDirectory = directories.remove(0);
            File[] files = currentDirectory.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        directories.add(f);
                    }
                    else if (f.isFile()) {
                        changeFile(f, currentDirectory);
                    }
                }
            }
        }
    }
    public static void changeFile(File file, File directory) throws FileNotFoundException {
        StringBuilder page = new StringBuilder();
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String line = input.nextLine();
            if (!line.startsWith("//package " + directory.getName() + ";")) {
                page.append(line).append("\n");
            }
        }
        PrintWriter output = new PrintWriter(file);
        output.println(page);
        output.close();
    }
}