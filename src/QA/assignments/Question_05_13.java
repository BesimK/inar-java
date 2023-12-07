package QA.assignments;

public class Question_05_13 {
    public static void main(String[] args) {
        int n = 100;
        while(Math.pow(n,3)>=12000){
            n-=1;
        }
        System.out.println("Largest n is " + n);
    }
}
