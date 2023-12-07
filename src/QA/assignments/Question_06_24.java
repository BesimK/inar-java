package QA.assignments;

public class Question_06_24 {
    public static void main(String[] args) {
        long milliseconds = System.currentTimeMillis();
        System.out.println(milliseconds);
        int totalSeconds = getTotalSeconds(milliseconds);
        int totalMinutes = getTotalMinutes(totalSeconds);
        int totalHours = getTotalHours(totalMinutes);
        int currentSeconds = getCurrentSeconds(totalSeconds);
        int currentMinutes = getCurrentMinutes(totalMinutes);
        int currentHours = getCurrentHours(totalHours);
        int totalDays = getTotalDays(totalHours);
        int month = getMonth(totalDays);
        int year = getTotalYears(totalDays);
        System.out.printf("Current time and date is :\t%d:%d:%d",currentHours,currentMinutes,currentSeconds);


    }
    public static int getTotalSeconds(long ms){return (int) (ms / 1000);}
    public static int getTotalMinutes(long s){return (int) (s / 60);}
    public static int getTotalHours(long m){return (int) (m / 60);}
    public static int getCurrentSeconds(long ms){return (int) (ms % 60);}
    public static int getCurrentMinutes(long s){return (int) (s % 60);}
    public static int getCurrentHours(long m){return (int) (m % 24);}
    public static int getTotalDays(long hours){return (int)(hours/24);}
    public static int getTotalYears(int days){
        int year = 1970;
        while(days>((isLeapYear(year))?365:366)){
         year++;
         days-=((isLeapYear(year))?365:366);
        }
        return year;
    }
    public static boolean isLeapYear(int year){
        return year % 4 == 0 && (( year % 100 != 0) || ( year % 400 == 0));
    }
    public static int getMonth(int days){
        int year = 1970;
        int month = 1;
        while(days>((isLeapYear(year))?365:366)){
            year++;
            days-=((isLeapYear(year))?365:366);
        }
        while(days>((daysOfMonth(month)))){
            month++;
            days-=((daysOfMonth(month)));
        }
        return month;
    }
    public static int daysOfMonth(int month){
        return 0;

        }

}
