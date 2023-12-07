package QA.assignments;

public class Question_05_27 {
    public static void main(String[] args) {
        final int YEARS_PER_LINE = 10;
        int counter = 0;
        for (int i = 101; i < 2100; i++) {
    /*        if (i % 400 == 0) {
                continue;
            }
*/
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                counter++;
                if (counter % YEARS_PER_LINE == 0) {
                    System.out.println(i);
                } else {
                    System.out.printf("%-5d"  , i);
                }
            }

        }
    }
}
