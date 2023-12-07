package QA.week_11.assignments;

import java.util.*;

public class Question_11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int a = input.nextInt();
        int[][] array = getArray(a);
        System.out.println("Random array is : ");
        displayArray(array);
        displayFrequency(array);
    }

    private static void displayFrequency(int[][] array) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(rowCounter(array));
        list.add(colCounter(array));
        System.out.println("The largest row index : " + list.get(0));
        System.out.println("The largest col index : " + list.get(1));
    }

    private static int rowCounter(int[][] array) {
        int rowMax=0;
        int tempMax=0;
        int temp;
        for (int row = 0; row < array.length; row++) {
            temp=0;
            for (int col = 0; col < array[row].length; col++) {
                if(array[row][col]==1){
                    temp++;
                }
            }
            if(temp>tempMax){
                tempMax=temp;
                rowMax=row;
            }
        }

        return rowMax;
    }
    private static int colCounter(int[][] array) {
        int colMax=0;
        int tempMax=0;
        int temp;
        for (int col = 0; col < array[0].length; col++) {
            temp=0;
            for (int row = 0; row < array.length; row++) {
                if(array[row][col]==1){
                    temp++;
                }
            }
            if(temp>tempMax){
                tempMax=temp;
                colMax=col;
            }
        }

        return colMax;
    }
    private static void displayArray(int[][] array) {
        for (int[] row : array) {
            for (int col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private static int[][] getArray(int a) {
        int [][] array = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                array[i][j]=(int)(Math.random()*2);
            }
        }
        return array;
    }
}
