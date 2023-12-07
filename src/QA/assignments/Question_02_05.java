package QA.assignments;

import java.util.Scanner;

public class Question_02_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the subtotal and gratuity rate: ");
        double subtotal = scan.nextDouble();
        double gratuityRate = scan.nextDouble();
        double gratuity = subtotal* gratuityRate / 100.0 ;

        System.out.println("The gratuity is $" + gratuity + " and total is: $" + (subtotal+gratuity));
    }
}

