package QA.assignments;

import java.util.Scanner;

public class Question_03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 integers :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = Math.max(a,Math.max(b,c));
        int min = Math.min(a,Math.min(b,c));
        int mid = a + b + c - max - min;

        System.out.println(min + " < " + mid + " < " + max);
    }
}
