package QA.assignments;

public class Question_05_26 {
    public static void main(String[] args) {
        double e1 =1;
        double temporary;
        double e2 =1;
        double e3 =1;


        for (int i = 1; i <= 10000 ; i++) {
            temporary=1;
            for (int j = i; j >=1 ; j--) {
                temporary*=1.0/j;
            }
            e1+=temporary;
        }
        for (int i = 1; i <= 20000 ; i++) {
            temporary=1;
            for (int j = i; j >=1 ; j--) {
                temporary*=1.0/j;
            }
            e2+=temporary;
        }
        for (int i = 1; i <= 100000 ; i++) {
            temporary=1;
            for (int j = i; j >=1 ; j--) {
                temporary*=1.0/j;
            }
            e3+=temporary;
        }
        System.out.println("e at i = 10000 is " + e1);
        System.out.println("e at i = 20000 is " + e2);
        System.out.println("e at i = 100000 is " + e3);
        System.out.println("Java's e is " + Math.E);

    }
}
