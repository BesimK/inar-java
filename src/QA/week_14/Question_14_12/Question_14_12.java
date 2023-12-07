package QA.week_14.Question_14_12;

import java.security.Key;
import java.util.*;

public class Question_14_12 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringTokenizer tokenizer;
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        tokenizer = new StringTokenizer(s," ");
        Map<Character,Integer> counter = new HashMap<>();
        while (tokenizer.hasMoreTokens()){
            for(char c:tokenizer.nextToken().toCharArray()){
                counter.put(c, counter.getOrDefault(c,0)+1);
            }
        }
        ArrayList<Character> resultChecker = new ArrayList<>();
        int minIndex=-1;
        if(counter.containsValue(1)){
            for (Map.Entry<Character,Integer> element : counter.entrySet()){
                if(element.getValue()==1){
                    resultChecker.add(element.getKey());
                }
            }
            minIndex = s.indexOf(resultChecker.get(0));
            for (int i = 1;i<resultChecker.size();++i) {
                if(s.indexOf(resultChecker.get(i))<minIndex){
                    minIndex=s.indexOf(resultChecker.get(i));
                }
            }
        }
        if(minIndex!=-1){
            System.out.println("First non-repeating char is '" + s.charAt(minIndex)+1 + "' : " +
                    minIndex + ". character of the string. ");
        }
        else System.out.println("There lies no non-repeating char, Master!");
    }
}
