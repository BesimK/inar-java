package QA.assignments;

import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits) :");
        int lottery1 = (int) (Math.random() * 10);
        int lottery2 = (int) (Math.random() * 10);
        int lottery3 = (int) (Math.random() * 10);
        System.out.println(lottery1 + "" + lottery2 + "" + lottery3);
        int pick = input.nextInt();
        int pick3 = pick % 10;
        pick = pick / 10;
        int pick2 = pick % 10;
        pick = pick / 10;
        int pick1 = pick;
        if (pick1 == lottery1 && pick2 == lottery2 && pick3 == lottery3) {
            System.out.println("Jackpot! You won $10,000");
        } else if ((pick1 == lottery2 || pick1 == lottery3) && (pick2 == lottery1 || pick2 == lottery3) &&
                (pick3 == lottery1 || pick3 == lottery2)) {
            System.out.println("Matched three number ! You won $3,000 !");
        } else if ((pick1 == lottery2 || pick1 == lottery3) && (pick2 == lottery1 || pick2 == lottery3) ||
                (pick1 == lottery2 || pick1 == lottery3) && (pick3 == lottery1 || pick3 == lottery2) ||
                (pick2 == lottery1 || pick2 == lottery3) && (pick3 == lottery1 || pick3 == lottery2)) {
            System.out.println("Matched two number ! You won $2,000 !");
        } else if ((pick1 == lottery2 || pick1 == lottery3) || (pick2 == lottery1 || pick2 == lottery3) ||
                (pick3 == lottery1 || pick3 == lottery2)) {
            System.out.println("Matched one number ! You won $1,000 !");
        }else {
            System.out.println("Sorry no match :(");
        }
    }


}
