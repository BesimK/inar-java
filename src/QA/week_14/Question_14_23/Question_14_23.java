package QA.week_14.Question_14_23;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Question_14_23 {
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
        ArrayList<String> ascending = new ArrayList<>();
        for (Map.Entry<String,Integer> m: words.entrySet()){
            if(m.getValue()==1){
                ascending.add(m.getKey());
            }
        }
        Collections.sort(ascending);
        //Collections.reverse(ascending);
        System.out.println("Ascending order!");
        System.out.println(ascending);
    }
}
