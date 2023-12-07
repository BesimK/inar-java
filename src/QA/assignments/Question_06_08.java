package QA.assignments;

public class Question_06_08 {
    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit\t\t|\t\tFahrenheit\t\tCelsius");
        System.out.println("---------------------------------------------------");
        double celsius = 40;
        double fahrenheit = 120;
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%.1f\t\t%.1f\t\t\t|\t\t\t%.1f\t\t\t%.2f%n",
                    celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
            celsius -= 1;
            fahrenheit -= 10;
        }
    }
    public static double celsiusToFahrenheit(double celsius){
        return (9.0/5)*celsius+32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0/9)*(fahrenheit-32);
    }
}
