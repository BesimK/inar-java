package QA.assignments;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = input.nextInt();
        System.out.printf("The sum of the digits in %d is %d",number,sumDigits(number));
    }
    public static int sumDigits(int number){
        int sum = 0;
        while (number!=0){
            sum+= number%10;
            number = number/10;
        }
        return sum;
    }
}
