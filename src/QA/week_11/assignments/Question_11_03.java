package QA.week_11.assignments;

import QA.week_09.additionalClasses.Account;
import QA.week_11.additionalClasses.CheckingAccount;
import QA.week_11.additionalClasses.SavingsAccount;

public class Question_11_03 {
    public static void main(String[] args) {
        Account myAccount = new Account(10,1000,2);
        CheckingAccount myCheckingAccount = new CheckingAccount(11,1450,-500);
        SavingsAccount mySavingsAccount = new SavingsAccount(16,4820);
        System.out.println(myCheckingAccount);
        System.out.println("--------------------------------------");
        System.out.println(mySavingsAccount);
    }
}
