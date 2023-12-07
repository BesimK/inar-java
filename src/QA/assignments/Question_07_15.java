package QA.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        numbers = eliminateDuplicates(numbers);
        printNumbers(numbers);
    }

    public static int[] getNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public static int[] eliminateDuplicates(int[] numbers) {
        int[] eliminatedList = new int[numbers.length];
        int zeroIndex = Arrays.binarySearch(numbers,0);
        int secondZeroIndex;
        if(zeroIndex>-1){
            secondZeroIndex = Arrays.binarySearch(numbers,zeroIndex,numbers.length,0);
        }

        boolean isDuplicate;
        int indexOfEliminatedList = 0;
        for (int i = 0; i < numbers.length; i++) {
            isDuplicate = true;
            for (int j = 0; j < indexOfEliminatedList; j++) {
                if (numbers[i] == eliminatedList[j]) {
                    isDuplicate = false;
                }
            }
            if (isDuplicate) {
                eliminatedList[indexOfEliminatedList] = numbers[i];
                indexOfEliminatedList++;
            }
        }
        return eliminatedList;
    }

    public static void printNumbers(int[] numbers) {
        System.out.print("The distinct numbers are : ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}