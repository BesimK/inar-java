package QA.assignments;

public class Question_05_06 {
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers\t\t|\t\t\tKilometers\t\t\tMiles");
        int kilometers = 20;
        for(int i=1;i<11;i++){
            double milesToKilometers = i * 1.609;

                System.out.printf("%d\t\t\t\t%3.3f", i, milesToKilometers);
                System.out.printf("\t\t|\t\t%d\t\t\t\t%3.3f%n", kilometers, (kilometers * 0.62150769230769230769230769230769));
                kilometers += 5;

        }

    }
}
