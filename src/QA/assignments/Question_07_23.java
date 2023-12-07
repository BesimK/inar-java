package QA.assignments;
public class Question_07_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int i = 1; i < 101; i++) {
            for (int j = 1; j < lockers.length; j += i) {
                lockers[j-1]=!lockers[j-1];
            }
        }
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
    }
}