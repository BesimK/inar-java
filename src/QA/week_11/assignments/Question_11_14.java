package QA.week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = getListFromUser();
        ArrayList<Integer> list2 = getListFromUser();
        ArrayList<Integer> unionList = union(list1, list2);
        System.out.println("The combined list is " + unionList);
    }

    private static ArrayList<Integer> getListFromUser() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five integers :");
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            list.add(number);
        }
        return list;
    }

    private static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> union = new ArrayList<>();
        union.addAll(list1);
        union.addAll(list2);
        return union;
    }
}