package QA.assignments;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F:");
        int temperature = input.nextInt();
        System.out.println("Enter wind speed (>=2) in miles per hour :");
        int wind = input.nextInt();
        if (temperature >= -58 && temperature <= 41) {
            if (wind >= 2) {
                double windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(wind, 0.16))
                        + (0.4275 * temperature * Math.pow(wind, 0.16));
                System.out.println("The wind chill index is " + windChill);

            }else {
                System.out.println("The wind is invalid");
            }
        } else {
            System.out.println("The temperature is invalid");

        }
    }
}
