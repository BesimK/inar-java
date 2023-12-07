package QA.assignments;

public class Question_05_25 {
    public static void main(String[] args) {
        double piFirst=0;
        double piSecond=0;
        double piThird=0;
        for (int i = 1; i <=10000 ; i++) {
            piFirst+=((Math.pow(-1,i+1))/((2*i)-1));
        }
        for (int i = 1; i <=20000 ; i++) {
            piSecond+=((Math.pow(-1,i+1))/((2*i)-1));
        }
        for (int i = 1; i <=100000 ; i++) {
            piThird+=((Math.pow(-1,i+1))/((2*i)-1));
        }
        piFirst*=4;
        piSecond*=4;
        piThird*=4;

        System.out.println("PI value for i = 10000: " + piFirst);
        System.out.println("PI value for i = 20000: " + piSecond);
        System.out.println("PI value for i = 100000: " + piThird);
    }
}
