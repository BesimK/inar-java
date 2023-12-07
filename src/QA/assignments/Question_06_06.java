package QA.assignments;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        displayPattern(rows);
    }
    public static void displayPattern(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print("\t");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        
        
    }
}
