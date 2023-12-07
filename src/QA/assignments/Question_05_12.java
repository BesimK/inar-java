package QA.assignments;

public class Question_05_12 {
    public static void main(String[] args) {
        int n = -1;
        while(Math.pow(n,2)<=12000){
            n-=1;
        }
        System.out.println("Smallest n is " + n);
    }
}
