package QA.week_12.assignments;

import java.io.File;
import java.util.ArrayList;

public class Question_12_26 {
    public static void main(String[] args) {
      //  if(args.length != 1 && !args[0].equals("*")){
       //     System.out.println("Usage java Question_12_27 *");
       //        System.exit(1);
       // }
        String filePath = "C:\\Users\\BESIM\\workspace\\inar-java\\src\\QA.ChangeNames\\Checker26";
        File file = new File(filePath);
        ArrayList<File> directories = new ArrayList<>();
        if (file.exists() && file.isDirectory()) {
            directories.add(file);
        }
        while (!directories.isEmpty()) {
            File currentDirectory = directories.remove(0);
            File[] files = currentDirectory.listFiles();
            if (files != null) {
                for (File f : files) {
                    if ((f.getName().matches("Question\\d_\\d"))) {
                        String fileName = f.getName();
                        String[] parts = fileName.split("_");

                        if (parts.length == 2) {
                            String k = parts[0].substring("Question".length());
                            String l = parts[1];
                            String newFileName = "Question" + padWithZeros(k) + "_" + padWithZeros(l);
                            String newPath = f.getParentFile() + "\\" + newFileName;
                            f.renameTo(new File(newPath));
                        }
                    }
                }
            }
        }
    }

    public static String padWithZeros(String str) {
        return str.length() == 1 ? "0" + str : str;
    }
}