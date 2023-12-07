package QA.week_14.Question_14_26;

import java.util.ArrayList;
import java.util.LinkedList;

public class Question_14_26 {
    public static void main(String[] args) {
        wakawakawaka();
    }
    private static void wakawakawaka() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add((int)(Math.random()*100));
        }
        System.out.println("Original LinkedList:\n" + list);
        ArrayList<Integer> gcds = new ArrayList<>();
        for (int i = 0; i < list.size()-1; i++) {
            gcds.add(gcd(list.get(i),list.get(i+1)));
        }
        mergeStructures(list,gcds);

    }

    private static void mergeStructures(LinkedList<Integer> list, ArrayList<Integer> gcds) {
        LinkedList<Integer> updated = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            updated.add(list.get(i));
            if(i<list.size()-1){
                updated.add(gcds.get(i));
            }
        }
        System.out.println("Updated Linked List:\n"+updated);
    }

    private static int gcd(int a,int b){
        int gcd = 1;
        for (int i = 2; i < Math.min(a,b); i++) {
            if(a%i==0&&b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}
