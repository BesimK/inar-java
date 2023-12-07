package QA.week_14.Question_14_25;

import java.util.*;

public class Question_14_25 {
    public static void main(String[] args) {
        makeSomeNoise();
    }

    private static void makeSomeNoise() {
        int target = (int) (Math.random() * 100);
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }
        System.out.println("Generated ArrayList:\n" + nums);
        System.out.println("Generated Target : " + target);
        findThatGuy(nums, target);
    }

    private static void findThatGuy(ArrayList<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    System.out.println("Numbers: " + nums.get(i) + ", " + nums.get(j));
                    System.out.println("Result : true");
                    return;
                }
            }
        }
        System.out.println("No way!");
    }
}
