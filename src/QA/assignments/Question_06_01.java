package QA.assignments;

public class Question_06_01 {

    public static void main(String[] args) {
        System.out.println("The first 100 pentagonal numbers, ten per line:");
        for (int i = 1; i <= 100 ; i++) {
            System.out.printf("%9d",getPentagonalNumber(i));
            if(i%10==0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n){
        return n*((3*n)-1)/2;
    }
}
