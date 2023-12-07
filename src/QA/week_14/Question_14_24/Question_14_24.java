package QA.week_14.Question_14_24;

import java.util.*;

public class Question_14_24 {
    public static void main(String[] args) {
        System.out.println("Rule acquired? " + callOfMother());
    }

    public static boolean callOfMother() {
        int k = (int)(Math.random()*9)+1;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        System.out.println(k);
        System.out.println(numbers);
        HashSet<Integer> check = new HashSet<>(numbers);
        if (check.size() == numbers.size()) {
            return false;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (Objects.equals(numbers.get(i), numbers.get(j)) && (Math.abs(numbers.get(i) - numbers.get(j)) < (k+1))) {
                    return true;
                }
            }
        }
        return false;
    }
}