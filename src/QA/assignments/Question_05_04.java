package QA.assignments;

public class Question_05_04 {
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        for(int i=1;i<11;i++){
            double kilometers = i * 1.609;
            System.out.printf("%d\t\t\t\t%3.3f%n",i,kilometers);

        }

    }
}
