package QA.week_09.assignments;

import java.util.GregorianCalendar;

public class Question_09_05 {
    public static void main(String[] args) {
        GregorianCalendar grego = new GregorianCalendar();
        System.out.printf("""
                Current year : %d
                Current month: %d
                Current day  : %d
                """,
                grego.get(GregorianCalendar.YEAR),
                grego.get(GregorianCalendar.MONTH),
                grego.get(GregorianCalendar.DAY_OF_MONTH));
        grego.setTimeInMillis(1234567898765L);
        System.out.println("\nAfter setTimeInMillis()\n");
        System.out.printf("""
                Current year : %d
                Current month: %d
                Current day  : %d
                """,
                grego.get(GregorianCalendar.YEAR),
                grego.get(GregorianCalendar.MONTH),
                grego.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
