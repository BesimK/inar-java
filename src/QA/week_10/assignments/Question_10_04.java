package QA.week_10.assignments;

import QA.week_10.additionalClasses.MyPoint;

public class Question_10_04 {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(10,30.5);
        System.out.println("The distance between (" +
                myPoint1.getX() + "," + myPoint1.getY() + ") and (" +
                myPoint2.getX() + "," + myPoint2.getY() + ") is: " +
                myPoint1.distance(myPoint2));
    }
}
