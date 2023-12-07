package QA.assignments;

public class Question_06_14 {
    public static void main(String[] args) {
        System.out.println("i\t\t\tm(i)");
        System.out.println("----------------------------");
        for (int i = 1; i <902 ; i+=100) {
            System.out.printf("%d\t\t\t%.4f%n",i,piComputer(i));

        }
    }
    public static double piComputer(int number){
        double sum =0;
        for (int i = 1; i <=number ; i++) {
            sum+=Math.pow(-1,i+1)/((2*i)-1);
            
        }
        return sum*4;
    }
}
