package QA.week_14.Question_14_03;

import java.util.*;

public class Question_14_03 {
    public static void main(String[] args) {
        ArrayList<Point> points1 = new ArrayList<>();
        CompareY[] points2 = new CompareY[100];
        for (int i = 0; i < 100; i++) {
            CompareY compareY = new CompareY(Math.random()*100,Math.random()*100);
            points2[i]=compareY;
            Point point = new Point(Math.random()*100,Math.random()*100);
            points1.add(point);
        }
        Collections.sort(points1);
        System.out.println(points1);
        System.out.println("------------------------------------------");
        sortThatArray(points2);
        System.out.println(Arrays.toString(points2));
    }

    private static void sortThatArray(CompareY[] points2) {
        for (int i = 0; i < points2.length; i++) {
            for (int j = 0; j < points2.length-i-1; j++) {
                CompareY temp;
                if(points2[j].getY()>points2[j+1].getY() || (points2[j].getY()==points2[j+1].getY() && points2[j].getX()>points2[j+1].getX())){
                    temp=points2[j+1];
                    points2[j+1]=points2[j];
                    points2[j]=temp;
                }
            }
        }
    }
}
