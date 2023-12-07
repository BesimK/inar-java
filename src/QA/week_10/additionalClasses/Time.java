package QA.week_10.additionalClasses;

import java.util.Date;

public class Time {
    Date date = new Date();
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = date.getHours();
        minute = date.getMinutes();
        second = date.getSeconds();
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(long elapsedTime) {
        elapsedTime = elapsedTime / 1000;
        second = (int) (elapsedTime % 60);
        elapsedTime = elapsedTime / 60;
        minute = (int) (elapsedTime % 60);
        elapsedTime = elapsedTime / 60;
        hour = (int) (elapsedTime % 24);
    }

    public void setTime(long elapsedTime) {
        elapsedTime = elapsedTime / 1000;
        second = (int) (elapsedTime % 60);
        elapsedTime = elapsedTime / 60;
        minute = (int) (elapsedTime % 60);
        elapsedTime = elapsedTime / 60;
        hour = (int) (elapsedTime % 24);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
