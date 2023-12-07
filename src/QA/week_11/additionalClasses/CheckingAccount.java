package QA.week_11.additionalClasses;

import QA.week_09.additionalClasses.Account;

public class CheckingAccount extends Account {
    public final double overDraftLimit;

    public CheckingAccount(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public String toString() {
        return "ID :" + getId() + "\n" +
                "Balance is $" + getBalance() + "\n" +
                "Limit is $" + overDraftLimit;

    }
}
