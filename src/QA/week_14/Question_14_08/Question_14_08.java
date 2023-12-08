package QA.week_14.Question_14_08;

import QA.week_13.Question_13_08.MyStack;

import java.util.Stack;

public class Question_14_08 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        try {
            System.out.println("Top method :" + stack.pop());

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println("Size :" + stack.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
