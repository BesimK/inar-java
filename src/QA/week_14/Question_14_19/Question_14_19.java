package QA.week_14.Question_14_19;

import java.util.*;

public class Question_14_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> repeatedLetters = new ArrayList<>();
        String DNA = input.next();
        int cursor = 0;

        while (cursor<DNA.length()-5){
            for (int i = cursor+1; i < DNA.length()-5; i++) {
                if(DNA.substring(cursor,cursor+5).equalsIgnoreCase(DNA.substring(i,i+5))){
                    repeatedLetters.add(DNA.substring(cursor,cursor+5));
                    break;
                }
            }
            ++cursor;
        }
        System.out.println("Repeated 5-Letter sequences ->" + repeatedLetters);
    }
}
