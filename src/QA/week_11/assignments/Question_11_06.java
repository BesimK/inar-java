package QA.week_11.assignments;

import QA.week_10.additionalClasses.Circle2D;
import QA.week_11.additionalClasses.Loan;

import java.util.*;

public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Date myDate = new Date();
        Loan myLoan = new Loan(1,1000,2.5);
        String myString = "InarAcademy";
        Circle2D myCircle = new Circle2D();
        list.add(myLoan);
        list.add(myDate);
        list.add(myString);
        list.add(myCircle);
        for (Object o : list) {
            System.out.println(o.toString());
            System.out.println("---------------------------------");
        }
    }
}
