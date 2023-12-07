package QA.assignments;

import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string");
        String firstString = input.nextLine();
        System.out.println("Enter second string");
        String secondString = input.nextLine();
        String commonPrefix = "";
        String minString;
        String maxString;
        if (firstString.length() >= secondString.length()) {
            maxString = firstString;
            minString = secondString;
        } else {
            maxString = secondString;
            minString = firstString;
        }
        for (int i = 0; i < minString.length(); i++) {
            if (maxString.charAt(i) == minString.charAt(i)) {
                commonPrefix = commonPrefix.concat(String.valueOf(maxString.charAt(i)));
            }
        }
        if (!commonPrefix.equalsIgnoreCase("")) {
            System.out.println("The common prefix is " + commonPrefix);
        }
        else {
            System.out.printf("%s and %s have no common prefix",firstString,secondString);
        }
    }
}
