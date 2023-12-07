package QA.assignments;

public class Question_05_24 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 3; i <=99 ; i+=2) {
            sum += ((double)i-2)/((double)i);
        }
        System.out.println("Sum of series: " + sum);
    }
}
