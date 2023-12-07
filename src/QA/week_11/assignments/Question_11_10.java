package QA.week_11.assignments;

import QA.week_11.additionalClasses.MyStack;

import java.util.Scanner;

public class Question_11_10 {
    public static void main(String[] args) {
        getStack();

    }
    private static void getStack(){
        Scanner input = new Scanner(System.in);
        MyStack myStack = new MyStack();
        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            String a = input.next();
            myStack.push(a);
        }
        displayStack(myStack);
    }

    private static void displayStack(MyStack myStack) {
        System.out.println(myStack);
        System.out.println("Displaying them in reverse order");
        for (int i = 4; i >=0 ; i--) {
            System.out.print(myStack.get(i) + " ");

        }
    }
}
