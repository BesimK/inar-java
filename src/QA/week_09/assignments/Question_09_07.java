package QA.week_09.assignments;
import QA.week_09.additionalClasses.Account;

public class Question_09_07 {
    public static void main(String[] args) {
        Account accountObject = new Account(1122,20000,4.5);
        accountObject.withdraw(2500);
        accountObject.deposit(3000);
        System.out.println("\t\tAccount Statement  :\n-----------------------------------------------");
        System.out.println("Account ID\t: " + accountObject.getId());
        System.out.println("Date Created\t: " + accountObject.getDateCreated());
        System.out.printf("Balance\t: $%.2f\n" , accountObject.getBalance());
        System.out.printf("Monthly Interest\t: $%.2f" , accountObject.getMonthlyInterest());
    }
}
