package QA.week_14.Question_14_13;

import java.util.*;

public class Question_14_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*3));
        }
        System.out.println("Generated Array -> " + list);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer number:list) {
            map.put(number,map.getOrDefault(number,0)+1);
        }
        list.clear();
        for (Map.Entry<Integer,Integer> hm: map.entrySet()) {
            if(hm.getValue() > 3){
                list.add(hm.getKey());
            }
        }
        System.out.println("Elements appearing more than n/3 times ->" + list);

    }
}
