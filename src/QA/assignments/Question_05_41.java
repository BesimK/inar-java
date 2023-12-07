package QA.assignments;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (it ends if input is 0)");
        String numberList = "";
        int number;
        int max=0;
        int maxCounter=1;
        while (true){
            number = input.nextInt();
            numberList = numberList + number + " ";
            if(max==number){
                maxCounter++;
            }
            if(max<number){
                max = number;
                maxCounter=1;
            }

            if (number == 0){
                break;
            }
        }
        System.out.println(max);
        System.out.println(maxCounter);


    }
}
