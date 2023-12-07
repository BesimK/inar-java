package QA.week_12.additionalClasses;

import java.util.Date;

public class Loan {
    private int numberOfYears;
    private double loanAmount;
    private double annualInterestRate;
    private final Object dateCreated = new Date();

    public Loan() {
        this(2.5,1,100);
    }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        if(numberOfYears<=0||loanAmount<=0||annualInterestRate<=0){
            throw new IllegalArgumentException();
        }
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears<=0){
            throw new IllegalArgumentException();
        }
        this.numberOfYears = numberOfYears;

    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount<=0){
            throw new IllegalArgumentException();
        }
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate<=0){
            throw new IllegalArgumentException();
        }
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
