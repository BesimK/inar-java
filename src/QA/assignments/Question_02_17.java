package QA.assignments;

import java.util.Scanner;

public class Question_02_17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature between -58F and 41F : ");
        double temperature = scanner.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: " );
        double speed = scanner.nextDouble();
        double index = 35.74 + (0.6215*temperature) - (35.75*(Math.pow(speed,0.16))) + ((0.4275*temperature)*(Math.pow(speed,0.16)));
        System.out.println(index);
    }
}
