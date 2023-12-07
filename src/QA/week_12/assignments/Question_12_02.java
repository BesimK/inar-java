package QA.week_12.assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers to sum: ");
        int a,b;
        while (true) {
            try {
                a = input.nextInt();
                b = input.nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println(ex.getClass());
            }
            System.out.print("Wrong input !! Please enter integer -->");
            input.nextLine();
        }
        System.out.printf("Sum of %d + %d is %d",a,b,a+b);
        input.close();
    }
}
