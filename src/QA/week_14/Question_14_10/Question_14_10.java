package QA.week_14.Question_14_10;

import java.util.Scanner;

public class Question_14_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Post Fix Expression: ");
        String postFix = input.nextLine();
        String[] arr = postFix.split(" ");
        mathBabe(arr);
        System.out.printf("((%s %s %s) %s %s)", arr[0], arr[2], arr[1], arr[4], arr[3]);
    }

    private static void mathBabe(String[] arr) {
        int result = switch (arr[2]) {
            case "+" -> Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            case "-" -> Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);
            case "*" -> Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
            case "/" -> Integer.parseInt(arr[0]) / Integer.parseInt(arr[1]);
            default -> 0;
        };
        switch (arr[4]) {
            case "+":
                result += Integer.parseInt(arr[3]);
                break;
            case "-":
                result -= Integer.parseInt(arr[3]);
                break;
            case "*":
                result *= Integer.parseInt(arr[3]);
                break;
            case "/":
                result /= Integer.parseInt(arr[3]);
                break;
        }
        System.out.println("Output : " + result);
    }

}
