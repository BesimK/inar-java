package QA.interview;

import java.util.Arrays;

public class MagicFunction {
    public static void main(String[] args) {
        int[] array1 = {0} ;
        System.out.println(Arrays.toString(zeroOddNumber(array1)));
        int[] array2 = {0,5,0,3} ;
        System.out.println(Arrays.toString(zeroOddNumber(array2)));
        int[] array3 = {0,5,1,0} ;
        System.out.println(Arrays.toString(zeroOddNumber(array3)));
        int[] array4 = {0,0,3,5} ;
        System.out.println(Arrays.toString(zeroOddNumber(array4)));
        int[] array5 = {0,2,4,6} ;
        System.out.println(Arrays.toString(zeroOddNumber(array5)));
        int[] array6 = {4,0,3,5} ;
        int[] arrayZero = {
                1, 1, 2, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 2, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1,
                1, 2, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 0, 1, 1, 1, 1,
                2, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 0, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 2};
        System.out.println(Arrays.toString(zeroOddNumber(array6)));
        System.out.println(Arrays.binarySearch(arrayZero,0 ));

    }
    public static int[] zeroOddNumber(int[] array){

        for (int i = 0; i < array.length; i++) {
            int greaterOdd=0;
            if(array[i]==0){
                for (int j = i+1; j < array.length ; j++) {
                    if(array[j]%2!=0 && array[j]>greaterOdd){
                        greaterOdd=array[j];
                    }
                }
                array[i]=greaterOdd;
            }
        }
        return array;
    }
}
