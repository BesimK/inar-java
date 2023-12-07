package QA.week_14.Question_14_06;

import java.util.*;

public class Question_14_06 {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add((int)(Math.random()*100));
        }
        System.out.println(randomNumbers);
        for (int i = 0; i < 10; i++) {
            if(randomNumbers.get(i)%2==0){
                int temp = randomNumbers.remove(i);
                randomNumbers.add(temp);
            }
        }
        System.out.println(randomNumbers);
    }
}
