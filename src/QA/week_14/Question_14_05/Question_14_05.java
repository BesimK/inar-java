package QA.week_14.Question_14_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_05 {
    public static void main(String[] args) {
        backInBlack();
    }
    private static void backInBlack(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers for ArrayList nums (enter -1 to stop): ");
        ArrayList<Integer> nums = new ArrayList<>();
        while (true){
            int num = input.nextInt();
            if(num==-1) break;
            nums.add(num);
        }
        dropThatThang(nums);
        System.out.println(nums);
    }
    private static void dropThatThang(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i)==0){
                int temp = nums.remove(i);
                nums.add(temp);
            }
        }
    }
}
