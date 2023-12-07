package QA.assignments;

public class Question_05_03 {
    public static void main(String[] args) {
        System.out.println("Kilograms\t\tPounds");
        for(int i=1;i<200;i+=2){
            double pounds = i * 2.2;
            System.out.printf("%d\t\t\t\t%3.1f%n",i,pounds);

        }

    }
}
