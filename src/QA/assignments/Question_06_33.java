package QA.assignments;

public class Question_06_33 {
    public static void main(String[] args) {
        printDateAndTime();
    }

    public static void printDateAndTime() {
        int day = getTime("day");
        int month = getTime("month");
        int year = getTime("year");
        int hour = getTime("hour");
        int minute = getTime("minute");
        int second = getTime("second");
        String stringOfMonth = getMonthName(month);

        System.out.printf("Current date and time is %s %d, %d %d:%d:%d",
                stringOfMonth, day, year, hour, minute, second);

    }

    public static int getTime(String dateOrTime) {
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        long totalDays = totalHours / 24;

        int currentDay = getDate("day", totalDays);
        int currentMonth = getDate("month", totalDays);
        int currentYear = getDate("year", totalDays);

        return switch (dateOrTime) {
            case "day" -> currentDay;
            case "month" -> currentMonth;
            case "year" -> currentYear;
            case "hour" -> (int) currentHours;
            case "minute" -> (int) currentMinutes;
            case "second" -> (int) currentSeconds;
            default -> 0;
        };
    }

    public static int getDate(String date, long totalDays) {
        //total days is the days between today and 1970 January 1 (Epoch Time)

        int currentYear = 1970;
        int currentMonth = 1;
        int currentDay = 1;

        while (totalDays > (isLeapYear(currentYear) ? 366 : 365)) {
            totalDays -= (isLeapYear(currentYear) ? 366 : 365);
            currentYear++;
        }
        while (totalDays > 31) {
            if ((currentMonth == 1)
                    || (currentMonth == 3)
                    || (currentMonth == 5)
                    || (currentMonth == 7)
                    || (currentMonth == 8)
                    || (currentMonth == 10)
                    || (currentMonth == 12)) {
                totalDays -= 31;
            } else if (currentMonth == 4
                    || currentMonth == 6
                    || currentMonth == 9
                    || currentMonth == 11) {
                totalDays -= 30;
            } else {
                if (isLeapYear(currentYear)) {
                    totalDays -= 29;
                } else {
                    totalDays -= 28;
                }
            }
            currentMonth++;
        }
        currentDay += (int) totalDays;
        return switch (date) {
            case "day" -> currentDay;
            case "month" -> currentMonth;
            case "year" -> currentYear;
            default -> 0;
        };
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Wrong";
        };
    }

}