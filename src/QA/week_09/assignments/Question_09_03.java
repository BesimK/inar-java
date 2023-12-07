package QA.week_09.assignments;
import java.util.*;
public class Question_09_03 {
    public static void main(String[] args) {
        Date date1 = new Date(10000);
        Date date2 = new Date(100000);
        Date date3 = new Date(1000000);
        Date date4 = new Date(10000000);
        Date date5 = new Date(100000000);
        Date date6 = new Date(1000000000);
        Date date7 = new Date(10000000000L);
        Date date8 = new Date(100000000000L);
        System.out.println("For elapsed time for 10000 is " + date1.toString());
        System.out.println("For elapsed time for 100000 is " + date2.toString());
        System.out.println("For elapsed time for 1000000 is " + date3.toString());
        System.out.println("For elapsed time for 10000000 is " + date4.toString());
        System.out.println("For elapsed time for 100000000 is " + date5.toString());
        System.out.println("For elapsed time for 1000000000 is " + date6.toString());
        System.out.println("For elapsed time for 10000000000 is " + date7.toString());
        System.out.println("For elapsed time for 100000000000 is " + date8.toString());



    }

}