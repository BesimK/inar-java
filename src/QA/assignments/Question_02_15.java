package QA.assignments;
import java.util.*;
public class Question_02_15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 and y1 : ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter x2 and y2 : ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("The distance between the two point is " + Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
    }
}
