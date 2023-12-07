package QA.week_14.Question_14_16;

import java.nio.file.*;
import java.util.*;
import java.io.*;

public class Question_14_16 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String absPath = input.next();
        absPath="C:\\Users\\BESIM\\workspace\\inar-java\\src\\QA\\ChangeNames\\"+absPath;
        File file = new File(absPath);
        final List<String> lines = Files.readAllLines(Path.of(absPath));
        String text = String.valueOf(lines);
        StringTokenizer tkn = new StringTokenizer(text," .:;,?()-&=*{}[]/+!<>'\"",false);
        HashMap<String,Integer> words = new HashMap<>();
        while (tkn.hasMoreTokens()){
            String s = tkn.nextToken();
            words.put(s,words.getOrDefault(s,0)+1);
        }
        System.out.println("Word count:");
        for(Map.Entry<String,Integer> m : words.entrySet()){
            System.out.println(m.getKey() + ":\t" + m.getValue());
        }
    }
}
