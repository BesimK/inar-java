package QA.assignments;

import java.util.Scanner;

public class Question_06_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Display an integer reversed:");
        System.out.println("Enter an integer:");
        int number =input.nextInt();
        reverse(number);
    }
    public static void reverse(int a){
        String reversedNumber="";
        while(a!=0){
            reversedNumber+=a%10;
            a/=10;
        }
        System.out.println(reversedNumber);
    }

}
