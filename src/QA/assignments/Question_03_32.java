package QA.assignments;

import java.util.Scanner;

public class Question_03_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double px0 = input.nextDouble();
        double py0 = input.nextDouble();
        double px1 = input.nextDouble();
        double py1 = input.nextDouble();
        double px2 = input.nextDouble();
        double py2 = input.nextDouble();

        double result = ((px1 - px0)*(py2 - py0)) - ((px2-px0)*(py1-py0));

        if(result>0){
            System.out.println("(" + px2 + ", " + py2 + ") is on the left side of the line from ("
            + px0 + ", " + py0 + ") to (" + px1 + ", " + py1 + ")");
        } else if (result == 0) {
            System.out.println("(" + px2 + ", " + py2 + ") is on the line from ("
                    + px0 + ", " + py0 + ") to (" + px1 + ", " + py1 + ")");
        }else {
            System.out.println("(" + px2 + ", " + py2 + ") is on the right side of the line from ("
                    + px0 + ", " + py0 + ") to (" + px1 + ", " + py1 + ")");
        }
    }
}
