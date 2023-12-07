package QA.week_12.assignments;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_18 {
    private static final String USAGE = "java Exercise12_18 srcRootDirectory";
    private static final String SUB_DIR_PATTERN = "chapter*";
    private static final String SRC_FILE_PATTERN = "*.java";
    private static final String RESOLVE_PACKAGE_PATH = "src\\ch_12\\exercise12_18\\";

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage" + USAGE);
            System.exit(2);
        }
        ArrayList<File> directories = new ArrayList<>();
        String srcRootDirectory = args[0];
        File file = new File(srcRootDirectory);
        if (file.isDirectory()) {
            directories.add(file);
        }
        while (!directories.isEmpty()) {
            File currentFile = directories.remove(0);
            File[] files = currentFile.listFiles();
            if (files.length > 0) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        directories.add(f);
                    } else if (f.isFile()) {
                        changePackage(f, currentFile.getName());
                    }
                }
            }
        }
    }

    private static void changePackage(File f, String packageName) throws IOException {
        StringBuilder s = new StringBuilder();
        Scanner input = new Scanner(f);
        while (input.hasNextLine()) {
            s.append(input.nextLine()).append("\n");

        }
        input.close();
        PrintWriter writer = new PrintWriter(f);
        writer.println("package " + packageName + "\n" + s);
        writer.close();
    }
}
