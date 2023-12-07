package QA.week_10.assignments;

import QA.week_10.additionalClasses.StackOfIntegers;

import java.util.Arrays;

public class Question_10_06 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        stack.primeCounter(120);
        stack.primeArrayFiller(120);
        System.out.println(Arrays.toString(stack.getData()));
    }
}
