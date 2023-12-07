package QA.week_13.Question_13_18;

public class Question_13_18 {
    public static void main(String[] args) {
        Rational sum = new Rational(1, 2);
        for (long i = 2L; i < 100L; i++) {
            sum = sum.add(new Rational(i, i + 1));
        }
        System.out.println(sum);
    }
}