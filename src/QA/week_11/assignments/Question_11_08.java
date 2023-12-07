package QA.week_11.assignments;

import QA.week_11.additionalClasses.Account;

public class Question_11_08 {
    public static void main(String[] args) {
        Account myAccount = new Account("George",1122,1000,1.5);
        myAccount.deposit(30);
        myAccount.deposit(40);
        myAccount.deposit(50);
        myAccount.withdraw(5);
        myAccount.withdraw(4);
        myAccount.withdraw(2);
        System.out.println(myAccount+"\n");

        for (int i = 0; i < myAccount.transactions.size(); i++) {
            System.out.println(myAccount.transactions.get(i)+"\n");
        }
    }
}
