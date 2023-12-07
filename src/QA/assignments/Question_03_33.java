package QA.assignments;

import java.util.Scanner;

public class Question_03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for the package 1 :");
        double weightPackageOne = input.nextDouble();
        double pricePackageOne = input.nextDouble();
        double pricePerWeight1 = pricePackageOne / weightPackageOne;

        System.out.print("Enter weight and price for the package 2 :");
        double weightPackageTwo = input.nextDouble();
        double pricePackageTwo = input.nextDouble();
        double pricePerWeight2 = pricePackageTwo / weightPackageTwo;

        if(pricePerWeight1 < pricePerWeight2){
            System.out.println("Package 1 has a better price.");
        } else if (pricePerWeight1 > pricePerWeight2) {
            System.out.println("Package 2 has a better price.");
        }
        else{
            System.out.println("Two package have the same price.");
        }
    }
}
