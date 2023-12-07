package QA.week_13.Question_13_12;

import QA.week_13.Question_13_05.Circle;
import QA.week_13.Question_13_05.GeometricObject;
import QA.week_13.Question_13_10.Rectangle;

public class Question_13_12 {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(0,0,15,"re",true);
        GeometricObject circle2 = new Circle(0,0,30,"re",true);
        GeometricObject rectangle1 = new Rectangle(10,5,"red",true);
        GeometricObject rectangle2 = new Rectangle(10,10,"red",true);
    //    ArrayList<GeometricObject> objects = new ArrayList<>();
    //   objects.add(circle1);
    //    objects.add(circle2);
    //    objects.add(rectangle1);
    //    objects.add(rectangle2);
        GeometricObject[] a = new GeometricObject[4];
        a[0]=circle1;
        a[1]=circle2;
        a[2]=rectangle1;
        a[3]=rectangle2;
        System.out.println("Total area of the objects is : " + circle1.sumArea(a));
    }
}
