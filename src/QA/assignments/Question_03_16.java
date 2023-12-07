package QA.assignments;


public class Question_03_16 {
    public static void main(String[] args) {
       int x = (int)((Math.random()*200)-100);
       int y = (int)((Math.random()*400)-200);
       System.out.println("Random coordinate in rectangle centered at (0,0)" +
               " with width 100 and height 200: " +"(" + x + ", " + y + ")" );
    }
}
