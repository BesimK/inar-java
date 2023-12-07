package QA.assignments;

import java.util.Scanner;

public class Question_02_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a the number of minutes: ");
        int minutes = scan.nextInt();
        int years = minutes / 60 / 24 / 365;
        int days = minutes / 60 / 24 % 365;
        System.out.println(minutes +" minutes is aproximately " + years + " years and " + days + " days.");

    }
}
