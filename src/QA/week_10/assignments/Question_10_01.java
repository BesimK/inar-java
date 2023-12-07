package QA.week_10.assignments;
import QA.week_10.additionalClasses.Time;
public class Question_10_01 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        System.out.println(time1.toString());
        System.out.println(time2.toString());
    }
}