package QA.week_12.assignments;

import java.util.Scanner;

public class Question_12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[100];
        fillArray(array);
        System.out.println("Enter the index of the array: ");
        int a = input.nextInt();
        try{
            System.out.println("You chose: " + array[a]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Out of Bounds!!");
        }
    }
    private static void fillArray(int[] array){
        for (int i = 0 ; i < array.length;i++) {
            array[i]=(int)(Math.random()*100);
        }
    }
}
