package QA.week_14.Question_14_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Question_14_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add((int)(Math.random()*100));
        }
        Set<Integer> integerSet = new HashSet<>(list);
        System.out.println("Generated ArrayList:\n" + list);
        list.clear();
        list.addAll(integerSet);
        System.out.println("Arraylist after removing duplicates:\n" + list);
    }
}
