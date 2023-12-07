package QA.assignments;

import java.util.Scanner;

public class Question_02_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int offset = scan.nextInt();

        // Obtain the milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        //Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        // Compute the current second in the minute for hour
        long currentSecond = totalSeconds % 60;
        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;
        // Obtain the total hours
        long totalHours = totalMinutes / 60;
        // Compute the current hour
        long currentHour = totalHours % 24;
        // Display results
        System.out.println("Current time is " +(currentHour+offset) + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
