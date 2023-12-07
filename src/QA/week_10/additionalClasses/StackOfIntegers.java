package QA.week_10.additionalClasses;

import java.util.Arrays;

public class StackOfIntegers {
    private int[] data;
    private int totalNumber;

    public StackOfIntegers() {
    }

    public StackOfIntegers(int number) {
        totalNumber = factorsCounter(number);
        fillArray(number);
    }

    public void primeCounter(int number) {
        int counter = 0;
        for (int i = number; i > 1; i--) {
            boolean isPrime = true;
            for (int j = i-1; j > 1; j--) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                counter++;
            }
        }
        totalNumber = counter;
        data = new int[totalNumber];
    }

    public void primeArrayFiller(int number) {
        int counter = 0;
        for (int i = number; i > 1; i--) {
            boolean isPrime = true;
            for (int j = i-1; j > 1; j--) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                data[counter]=i;
                counter++;
            }
        }
    }

    private void fillArray(int number) {
        data = new int[totalNumber];
        int indexCounter = 0;
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                data[indexCounter] = i;
                indexCounter++;
                number /= i;

            }
        }
    }

    private int factorsCounter(int number) {
        int counter = 0;
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                number /= i;
                counter++;
            }
        }
        return counter;
    }

    public String reverseDisplay() {
        int[] reversedData = new int[data.length];
        int j = 0;
        for (int i = data.length - 1; i > -1; i--) {
            reversedData[j] = data[i];
            j++;
        }
        return "We used pop() method: " + Arrays.toString(reversedData);
    }

    @Override
    public String toString() {
        return "Decreasing order: " + Arrays.toString(data);
    }

    public int[] getData() {
        return data;
    }
}
