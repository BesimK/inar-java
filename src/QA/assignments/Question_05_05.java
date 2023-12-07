package QA.assignments;

public class Question_05_05 {
    public static void main(String[] args) {
        System.out.println("Kilograms\t\tPounds\t\t|\t\t\tPounds\t\t\tKilograms");
        int pounds = 20;
        for(int i=1;i<200;i+=2){
            double kilogramPounds = i * 2.2;
            if(i==1||i==3) {
                System.out.printf("%d\t\t\t\t%3.1f", i, kilogramPounds);
                System.out.printf("\t\t\t|\t\t%d\t\t\t\t%3.2f%n", pounds, (pounds * 0.45454368932038834951456310679612));
                pounds += 5;
            }
            else {
                System.out.printf("%d\t\t\t\t%3.1f", i, kilogramPounds);
                System.out.printf("\t\t|\t\t%d\t\t\t\t%3.2f%n", pounds, (pounds * 0.45454368932038834951456310679612));
                pounds += 5;
            }
        }

    }
}
