package QA.assignments;

import java.util.Scanner;

public class Question_02_11 {
    public static void main (String[] args){
        double population = 312032486;
        double secondsOfYear = 365*24*60*60;
        double yearlyChange = ((secondsOfYear/7.0) + (secondsOfYear/45.0) - (secondsOfYear/13.0));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of years : ");
        int years = scanner.nextInt();
        System.out.println("The population in " + years + " years is " + (int)(population+(years*yearlyChange)));
    }
}
