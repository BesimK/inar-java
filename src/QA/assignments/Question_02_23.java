package QA.assignments;

import java.util.Scanner;

public class Question_02_23 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the driving distance in miles: ");
        double distance = scanner.nextDouble();
        System.out.println("Enter miles per gallon : ");
        double gallon =scanner.nextDouble();
        System.out.println( "Enter price per gallon : ");
        double price = scanner.nextDouble();
        double cost = distance/gallon*price;
        System.out.println("The cost of driving is : $" + cost);
    }
}
