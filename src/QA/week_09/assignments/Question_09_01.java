package QA.week_09.assignments;

import QA.week_09.additionalClasses.Rectangle;

public class Question_09_01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("--Rectangle 1--");
        System.out.printf("""
                        Width\t :%2.1f
                        Height\t :%2.1f
                        Area\t :%2.1f
                        Perimeter:%2.1f
                        """,
                rectangle1.getWidth(),
                rectangle1.getHeight(),
                rectangle1.getArea(),
                rectangle1.getPerimeter());
        System.out.println();
        System.out.println("--Rectangle 2--");
        System.out.printf("""
                        Width\t :%2.1f
                        Height\t :%2.1f
                        Area\t :%2.3f
                        Perimeter:%2.1f
                        """,
                rectangle2.getWidth(),
                rectangle2.getHeight(),
                rectangle2.getArea(),
                rectangle2.getPerimeter());
    }
}
