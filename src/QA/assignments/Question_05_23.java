package QA.assignments;

public class Question_05_23 {
    public static void main(String[] args) {
        double sumLToR=0;
        double sumRToL=0;
        for (int i = 1; i <=50000 ; i++) {
            sumLToR += 1.0/i;
        }
        for (int i = 50000; i >=1 ; i--) {
            sumRToL += 1.0/i;
        }
        System.out.println("Summation of series left to right: " + sumLToR);
        System.out.println("Summation of series right to left: " + sumRToL);
        System.out.println("Summation of series right to left - Summation of series left to \n" +
                "right: " +(sumRToL-sumLToR));
    }
}
