package QA.interview;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class JohnWick {
    public static void main(String[] args) throws Exception{
        if(args.length!=3){
            System.out.println("Usage : java JohnWick.java filePath oldStr newStr");
            System.exit(4127);
        }
        File file = new File(args[0]);
        if(!file.exists()){
            System.out.println("Existential problems bruh!");
            System.exit(4127);
        }
        String s = "";
        Scanner input = new Scanner(file);
        while (input.hasNextLine()){
            s += (input.nextLine().replace(args[1],args[2])) + "\n";
        }
        PrintWriter writer = new PrintWriter(file);
        writer.print(s);
        writer.close();
    }
}
