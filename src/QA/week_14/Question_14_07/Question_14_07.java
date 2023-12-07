package QA.week_14.Question_14_07;

import java.util.*;

public class Question_14_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*100));
        }
        System.out.println(list);
        int k = (int)(Math.random()*10);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("What is " + (k+1) + ". greatest element?");
        System.out.println(list.get(k));
    }
}
