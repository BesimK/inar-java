package QA.assignments;

import java.util.Scanner;

public class Question_02_13 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount : ");
        double saving = scanner.nextDouble();
        System.out.println("Enter expected saving time in month : ");
        double month = scanner.nextDouble();
        double account = saving;
        double rate = 0.00417;
        for(int i =0;i<month;i++){
            account=(account)+(account*rate);
            if (i==month-1)System.out.println("After " + month + " months, the account value is : " +account);
            account=account+saving;

        }




    }
}
