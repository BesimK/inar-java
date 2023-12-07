package QA.assignments;
import java.util.*;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter milliseconds: ");
        long milliseconds=input.nextLong();
        System.out.println("hours:minutes:seconds:" + convertMillis(milliseconds));
    }
    public static String convertMillis(long milliseconds){
        int totalSeconds=(int)milliseconds / 1000;
        int currentSeconds=totalSeconds % 60;
        int totalMinutes=totalSeconds / 60;
        int currentMinutes=totalMinutes % 60;
        int totalHours=totalMinutes / 60;

        return totalHours + ":" + currentMinutes + ":" + currentSeconds;
    }
}
