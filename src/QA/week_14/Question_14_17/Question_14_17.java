package QA.week_14.Question_14_17;

import java.util.*;

public class Question_14_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter numbers (0 stops)");
        int a = input.nextInt();
        while (a!=0){
            numbers.add(a);
            a = input.nextInt();
        }
        HashMap<Integer,Integer> numbersTotal = new HashMap<>();
        for (int m : numbers) {
            numbersTotal.put(m,numbersTotal.getOrDefault(m,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> n : numbersTotal.entrySet()) {
            if(n.getValue()>max){
                max=n.getValue();
            }
        }
        for (Map.Entry<Integer,Integer> n : numbersTotal.entrySet()) {
            if(n.getValue()==max){
                System.out.println(n.getKey() + " --> " + max + " times.");
            }
        }

    }
}
