package QA.assignments;

public class Question_06_09 {
    public static void main(String[] args) {
        System.out.println("Feet\t\tMeters\t\t|\t\tMeters\t\tFeet");
        System.out.println("---------------------------------------------------");
        double feet = 1;
        double meters = 20;
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%5.1f\t\t\t%5.3f\t\t\t|\t\t\t%5.1f\t\t\t%5.3f%n",
                    feet, feetToMeters(feet), meters, metersToFeet(meters));
            feet += 1;
            meters += 5;
        }
    }
    public static double feetToMeters(double feet){
        return 0.305*feet;
    }
    public static double metersToFeet(double meters){return 3.279*meters;}
}
