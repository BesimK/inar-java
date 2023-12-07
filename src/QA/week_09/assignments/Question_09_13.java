package QA.week_09.assignments;

import QA.week_09.additionalClasses.Location;

import java.util.Scanner;

public class Question_09_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] array = new double[row][col];
        System.out.println("Enter the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j]=input.nextDouble();
            }
        }
        Location sampleObject = Location.locateLargest(array);
        System.out.printf("The location of the largest element(%.1f) is (%d,%d)",
                sampleObject.getMaxValue(),sampleObject.getRow(),sampleObject.getColumn());
    }
}
