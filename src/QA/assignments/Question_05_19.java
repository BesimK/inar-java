package QA.assignments;

public class Question_05_19 {
    public static void main(String[] args) {
        int number = 7;

        for (int i = 0; i <= number; i++) {


            for (int j = number-i; j > 0; j--) {
                System.out.print("\t");

            }

            for (int k = 0; k <= i; k++) {
                System.out.print((int)Math.pow(2, k) + "\t");
            }

            for (int l = 1; l <= i; l++) {
                System.out.print((int)Math.pow(2, l-1) + "\t");
            }


            System.out.println();


        }
    }
}
