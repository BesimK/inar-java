package QA.week_11.additionalClasses;

import QA.week_09.additionalClasses.Account;

public class SavingsAccount extends Account {
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public String toString() {
        return "ID : " + getId() + "\n" +
                "Balance is $" + getBalance();
    }
}
