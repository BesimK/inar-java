package QA.interview;

import java.util.Arrays;

public class RemoveElementFromArray {


    public static void main (String[] args){
        //Take an array we are going to check
        int[] originalArray = {1 ,2 ,3 ,4 ,5 ,6};

        //Define an integer to delete from array
        int delete = 5;

        //Call "remove" method to assign new data to "newArray"
        int[] newArray = remove(originalArray , delete);
        System.out.println(Arrays.toString(newArray));



    }
    public static int[] remove(int[] array , int delete) {
        //Take variables to compute

        //Checking whether this "delete" variable exists in this specific array
        int length = array.length;
        int counter = 0;
        for (int j = 0; j < length; j++) {
            if (array[j] != delete ) {
                counter++;
                if (counter == array.length){
                    //If there is no match prints this info
                    System.out.println("There is no " + delete + " in this array. ");
                    return array;
                }
                }
            else {
                int[] newArray = new int[array.length - 1];
                int counter2 = 0;
                for (int i = 0; i < array.length; i++) {
                    //Compute new array
                    if (array[i] != delete) {
                        newArray[counter2] = array[i];
                        counter2++;

                    }

                }
                return newArray;
            }


        }

        return array;
    }

}




