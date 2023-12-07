package QA.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        reviseSelectionSort();
    }

    public static void reviseSelectionSort() {
        double[] numbers = getNumbers();
        reviseSelectionSort(numbers);
        printRevisedSort(numbers);
        bubbleSortTrial(numbers);
    }

    public static double[] getNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        return numbers;
    }

    public static void reviseSelectionSort(double[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            double currentMax = numbers[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < numbers[j]) {
                    currentMax = numbers[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                numbers[currentMaxIndex] = numbers[i];
                numbers[i] = currentMax;
            }
        }

    }

    public static void printRevisedSort(double[] numbers) {
        for (double number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void bubbleSortTrial(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}