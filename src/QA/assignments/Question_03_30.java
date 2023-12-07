package QA.assignments;

import java.util.Scanner;

public class Question_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT : ");
        long timeZone = input.nextInt();
        long totalMiliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMiliSeconds / 1000 ;
        long currentSeconds = totalSeconds % 60 ;
        long totalMinutes = totalSeconds / 60 ;
        long currentMinutes = totalMinutes % 60 ;
        long totalHours = totalMinutes / 60 ;
        long currentHours = totalHours % 24 ;
        currentHours = currentHours + timeZone ;

        if( currentHours >= 12) {
            System.out.println("The current time is " + (currentHours - 12) + ":" + currentMinutes + ":" + currentSeconds + " PM" );
        }
        else {
            System.out.println("The current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " AM" );
        }


      }
}
