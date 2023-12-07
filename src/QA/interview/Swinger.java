package QA.interview;

import java.util.Arrays;
import java.util.Scanner;

public class Swinger {
    public static void main(String[] args) {
        int [][] matrix = getMatrix();
        int [][] rotatedMatrix=rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(rotatedMatrix));
    }
    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int [][] matrix = new int[n][n];
        System.out.println("Enter matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=input.nextInt();
            }
        }
        return matrix;
    }
    public static int[][] rotateMatrix(int[][] matrix) {
        int [][] rotatedMatrix = new int[matrix.length][matrix.length];
        int controller;
        for (int i = 0; i < matrix.length; i++) {
            controller= matrix.length-1;
            for (int j = 0; j < matrix.length; j++) {
                rotatedMatrix[i][j]=matrix[i][controller];
                controller--;
            }
        }
        return rotatedMatrix;
    }
}