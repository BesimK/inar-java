package QA.week_14.Question_14_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_14_04 {
    public static void main(String[] args) {
        methodABC();
    }
    public static void methodABC() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size \"n\" for Arraylist A: ");
        int n = input.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        System.out.print("Enter " + n +" Integers for ArrayList A: ");
        for (int i = 0; i < n; i++) {
            A.add(input.nextInt());
        }
        System.out.print("Enter the size \"n\" for Arraylist B: ");
        n = input.nextInt();
        ArrayList<Integer> B = new ArrayList<>(n);
        System.out.print("Enter " + n +" Integers for ArrayList B: ");
        for (int i = 0; i < n; i++) {
            B.add(input.nextInt());
        }
        input.close();
        Collections.sort(A);
        Collections.reverse(B);
        ArrayList<Integer> C = new ArrayList<>();
        C.addAll(A);
        C.addAll(B);
        System.out.print("Merged and sorted ArrayList C: \n" + C);

    }
}
