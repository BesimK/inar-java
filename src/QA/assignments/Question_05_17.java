package QA.assignments;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int lines = input.nextInt();
        for (int i = 1; i <= lines; i++) {
            for (int j = lines-i; j >=0 ; j--) {
                System.out.print("\t");
                }
            for (int k = i; k >0 ; k--) {
                System.out.print(k + "\t");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + "\t");
            }

            System.out.println();
        }
    }
}
