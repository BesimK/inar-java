package QA.interview;

import java.util.*;

public class CountSpecificWords {
    public static void main(String[] args) {
        String s = "Java Python C# C++ java python c# c++ Java, Python, C#, C++, Java. Python. C#. C++." +
                "This is a sample string in order to fake algorithm. Thumbs up for this guy." +
                "All hail the king!! Long live the king. God bless our king. The king of the North.";

        s=s.replaceAll("\\."," ").replaceAll(",","");

        Map<String,Integer> values = new HashMap<>();
        String[] splinter =s.split(" ");

        for (String word:splinter) {
            if(word.equalsIgnoreCase("java")){
                values.put("Java",values.getOrDefault("Java",0)+1);
            }
            else if(word.equalsIgnoreCase("python")){
                values.put("Python",values.getOrDefault("Python",0)+1);
            }
            else if(word.equalsIgnoreCase("c++")){
                values.put("C++",values.getOrDefault("C++",0)+1);
            }
            else if(word.equalsIgnoreCase("c#")){
                values.put("C#",values.getOrDefault("C#",0)+1);
            }
        }
        System.out.println(values);
    }
}
