package QA.assignments;

import java.util.Scanner;

public class Question_06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int matrix = input.nextInt();
        printMatrix(matrix);
    }
    public static void printMatrix(int number){
        for (int i = 1; i <= number*number ; i++) {
            if(i%number==0) {
                System.out.println((int) (Math.random() * 2));
            }
            else System.out.print((int) (Math.random() * 2) + "  ");
        }
    }
}
