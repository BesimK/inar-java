package QA.assignments;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");

        String grade = input.nextLine();

        switch (grade){
            case "a","A":
                System.out.println("The numeric value for " + grade + " is 4");
                break;
            case "b","B":
                System.out.println("The numeric value for " + grade + " is 3");
                break;
            case "c","C":
                System.out.println("The numeric value for " + grade + " is 2");
                break;
            case "d","D":
                System.out.println("The numeric value for " + grade + " is 1");
                break;
            case "f","F":
                System.out.println("The numeric value for " + grade + " is 0");
                break;
            default:
                System.out.println(grade + " is an invalid grade");
        }
    }
}
