package QA.week_14.Question_14_21;

import java.util.*;

public class Question_14_21 {
    public static void main(String[] args) {
        doTheTrickBabe();
    }
    public static void doTheTrickBabe() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Enter 6 numbers: ");
        for (int i = 0; i < 6; i++) {
            list1.add(input.nextInt());
        }
        System.out.print("Enter 6 numbers: ");
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list2.add(input.nextInt());
        }
        System.out.println("Intersection -> " + getIntegers(list1, list2));

    }

    private static ArrayList<Integer> getIntegers(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashMap<Integer,Integer> union = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            union.put(list1.get(i), union.getOrDefault(list1.get(i),0)+1);
        }
        for (int i = 0; i < list2.size(); i++) {
            union.put(list2.get(i), union.getOrDefault(list2.get(i),0)+1);
        }
        ArrayList<Integer> intersection = new ArrayList<>();
        for (Map.Entry<Integer,Integer> m : union.entrySet()){
            if(m.getValue()==2){
                intersection.add(m.getKey());
            }
        }
        return intersection;
    }
}
