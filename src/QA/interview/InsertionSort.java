package QA.interview;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {-1,10,4,44,-2,123,25,14,25,156,11,14};
        evenLeft(array);
        System.out.println(Arrays.toString(array));
    }

    private static void evenLeft(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] % 2 == 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

