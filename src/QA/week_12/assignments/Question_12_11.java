package QA.week_12.assignments;

import java.io.*;
import java.util.Scanner;

public class Question_12_11 {
    public static void main(String[] args) throws FileNotFoundException{
        if(args.length!=2){
            System.out.println("Usage java Question_12_11 John filepath");
            System.exit(2);
        }
        File file = new File(args[1]);
        if(!file.exists()){
            System.out.println("There seems to be an existential problem bruh!");
            System.exit(2);
        }
        String s = "";
        Scanner input = new Scanner(file);
        while (input.hasNextLine()){
            String line = input.nextLine();
            s += line.replaceAll(args[0],"") + "\n";
        }
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print(s);
        printWriter.close();
    }
}
