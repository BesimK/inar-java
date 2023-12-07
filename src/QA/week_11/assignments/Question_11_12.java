package QA.week_11.assignments;

import java.util.*;

public class Question_11_12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getListFromUser();
        displaySum(list);
    }
    private static ArrayList<Integer> getListFromUser(){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers :");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            list.add(number);
        }
        input.close();
        return list;
    }
    private static void displaySum(ArrayList<Integer> list){
        int sum =0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println("Sum of the list: " +sum);
    }
}
