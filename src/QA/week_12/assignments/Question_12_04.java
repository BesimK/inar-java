package QA.week_12.assignments;

import QA.week_12.additionalClasses.Loan;

public class Question_12_04 {
    public static void main(String[] args) {
        Loan testLoan = new Loan();
        try {
            testLoan.setLoanAmount(-1.0);
            System.out.println(testLoan);
        } catch (IllegalArgumentException ex) {
            System.out.println("Wrong input! Please greater than 0 (zero)");
        }try {
            testLoan.setAnnualInterestRate(0);
            System.out.println(testLoan);
        } catch (IllegalArgumentException ex) {
            System.out.println("Wrong input! Please greater than 0 (zero)");
        }
        try {
            testLoan.setLoanAmount(-100);
            System.out.println(testLoan);
        } catch (IllegalArgumentException ex) {
            System.out.println("Wrong input! Please greater than 0 (zero)");
        }
    }

}
