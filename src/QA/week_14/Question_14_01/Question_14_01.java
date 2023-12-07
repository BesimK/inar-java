package QA.week_14.Question_14_01;

import java.util.*;

public class Question_14_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*100));
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
       /* ArrayList<Integer> reversedList = reverseList(list);
        System.out.println(reversedList);*/
    }
    public static ArrayList<Integer> reverseList(ArrayList<Integer> list){
        ArrayList<Integer> resultArray = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            resultArray.add(list.get(list.size()-1-i));
        }
        return resultArray;
    }
}
