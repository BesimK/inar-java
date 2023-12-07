package QA.week_11.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getListFromUser();
        System.out.println("Before sorting..");
        printList(numbers);
        sort(numbers);
        System.out.println("\nAfter sorting..");
        printList(numbers);
    }

    public static ArrayList<Integer> getListFromUser() {
        ArrayList<Integer> result = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of integers ending with 0 :");
        int value;
        do {
            value = input.nextInt();
            if (value != 0) {
                result.add(value);
            }

        } while (value != 0);
        return result;
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}