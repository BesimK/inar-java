package QA.week_09.assignments;

import QA.week_09.additionalClasses.RegularPolygon;

public class Question_09_09 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("First RegularPolygon perimeter is : " + polygon1.getPerimeter() +
                " area is " + polygon1.getArea());
        System.out.println("Second RegularPolygon perimeter is : " + polygon2.getPerimeter() +
                " area is " + polygon2.getArea());
        System.out.println("Third RegularPolygon perimeter is : " + polygon3.getPerimeter() +
                " area is " + polygon3.getArea());
    }
}
