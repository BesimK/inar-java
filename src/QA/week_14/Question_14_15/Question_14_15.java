package QA.week_14.Question_14_15;

import java.util.*;

public class Question_14_15 {
    public static void main(String[] args) {
    callThatMethod();
    }
    private static void callThatMethod(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n ->");
        Map<Integer,Integer> userInputs = new HashMap<>();
        int n = input.nextInt();
        System.out.println("Enter numbers between 1-" + n);
        for (int i = 0; i < n; i++) {
            userInputs.put(i+1,0);
        }
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            if(num>n){
                System.out.println("Invalid input");
                --i;
            }
            userInputs.put(num,userInputs.get(num)+1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer,Integer> a: userInputs.entrySet()) {
            if(a.getValue()==0){
                result.add(a.getKey());
            }
        }
        System.out.println("Numbers missing from the ArrayList -> " + result);
    }
}
