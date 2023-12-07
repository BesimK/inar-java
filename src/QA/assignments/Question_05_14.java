package QA.assignments;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max,min,gcd;
        System.out.println("Enter first integer: ");
        int a = input.nextInt();
        System.out.println("Enter second integer: ");
        int b = input.nextInt();
        max = Math.max(a,b);
        min = Math.min(a,b);
        gcd=1;
        for(int i =2;i<=min;i++){
            if (max%i==0&&min%i==0){
                gcd=i;
            }
        }
        System.out.printf("The greatest common divisor for %d and %d is %d",max,min,gcd);
    }
}
