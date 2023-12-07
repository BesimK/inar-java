package QA.week_13.Question_13_11;

public class Question_13_11 {
    public static void main(String[] args) {
        Octagon octagon1 = new Octagon(5,"Wo",true);
        System.out.println(octagon1.getArea());
        Octagon octagon2 = octagon1.clone();
        System.out.println(octagon1.compareTo(octagon2));
    }
}
