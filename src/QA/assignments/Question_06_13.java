package QA.assignments;

public class Question_06_13 {
    public static void main(String[] args) {
        System.out.println("i\t\t\tm(i)");
        System.out.println("-------------------------------");
        for (int i = 1; i <=20 ; i++) {
            System.out.printf("%d\t\t\t%.4f%n",i,printSeries(i));
        }
    }
    public static double printSeries (int number){
        double sum=0;
        for (int i = 1; i <=number ; i++) {
            sum+=(double) i/((double) i+1);
        }
        return sum;
    }

}
