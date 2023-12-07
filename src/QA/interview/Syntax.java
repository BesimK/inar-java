package QA.interview;

import java.util.*;

public class Syntax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: (-1 finishes)");
        HashMap<Integer,Integer> map = new HashMap<>();
        while (true){
            int n = input.nextInt();
            if(n==-1) break;
            map.put(n,map.getOrDefault(n,0)+1);
        }
        System.out.println(map);
    }
}
