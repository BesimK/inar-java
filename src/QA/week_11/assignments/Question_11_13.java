package QA.week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getListFromUser();
        displayDistinctNumbers(list);
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
    private static void displayDistinctNumbers(ArrayList<Integer> list){
        ArrayList<Integer> distinctList = new ArrayList<>();
        for (Integer integer:list) {
            if(!distinctList.contains(integer)){
                distinctList.add(integer);
            }
        }
        System.out.print("Distinct numbers are: " + distinctList);
    }
}
