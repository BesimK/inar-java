package QA.week_09.assignments;
import QA.week_09.additionalClasses.Fan;
public class Question_09_08 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setColor("yellow");
        fan1.setSpeed("MAXIMUM");
        fan1.setRadius(10);
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setColor("blue");
        fan2.setSpeed("MEDIUM");
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan1.toString());
        System.out.println("----------------------------");
        System.out.println(fan2.toString());
    }


}
