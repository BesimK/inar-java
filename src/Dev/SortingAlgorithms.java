package Dev;

import java.util.Arrays;

public class SortingAlgorithms {
    static {
        System.out.println("Welcome to sorting algorithms!!!");
    }
    public static void main(String[] args) {
        int[] array = new int[100];
        fillArray(array);
        shuffle(array);
        bubbleSort(array);
        shuffle(array);
        selectionSort(array);
    }
    private static void bubbleSort(int[] array) {
        long start = System.nanoTime();
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length-i-1; ++j) {
                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Duration for BubbleSort "+(System.nanoTime()-start)/1000 + " ms");
    }
    private static void selectionSort(int[] array) {
        long start = System.nanoTime();
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("Duration for BubbleSort "+(System.nanoTime()-start)/1000 + " ms");
    }
    private static void shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = (int) (Math.random() * array.length);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}
