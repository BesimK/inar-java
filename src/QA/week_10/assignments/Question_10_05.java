package QA.week_10.assignments;

import java.util.Scanner;
import QA.week_10.additionalClasses.StackOfIntegers;

public class Question_10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();
        StackOfIntegers stack = new StackOfIntegers(number);
        System.out.println(stack.toString());
        System.out.println(stack.reverseDisplay());
    }
}
