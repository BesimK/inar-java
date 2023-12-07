package QA.week_11.additionalClasses;

import java.util.Date;

public class Loan {
    private int numberOfYears;
    private double loanAmount;
    private double annualInterestRate;
    private final Object dateCreated = new Date();

    public Loan() {
    }
    public Loan(int numberOfYears, double loanAmount, double annualInterestRate) {
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
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
        return loanAmount * getMonthlyInterestRate();
    }

    @Override
    public String toString() {
        return "Annual Interest Rate : " + annualInterestRate +
                "\nNumber Of Years : " + numberOfYears +
                "\nLoan Amount : " + loanAmount +
                "\nDate Created : " + dateCreated;
    }
}
