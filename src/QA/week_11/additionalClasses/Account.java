package QA.week_11.additionalClasses;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    public ArrayList<Transactions> transactions = new ArrayList<>();
    private int id;
    private double balance;
    private double annualInterestRate;
    private final Object dateCreated = new Date();

    public Account() {
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public Account(String name,int id, double balance, double annualInterestRate) {
        this.name=name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Object getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance = balance - amount;
        transactions.add(new Transactions('W',amount,balance,"Withdrawal from ATM"));

    }
    public void deposit(double amount) {
        this.balance = balance + amount;
        transactions.add(new Transactions('D',amount,balance,"Deposit to Bank Account "));
    }

    @Override
    public String toString() {
        return "Name : " + name+
                "\nId : " + id +
                "\nBalance : " + balance;
    }
}
