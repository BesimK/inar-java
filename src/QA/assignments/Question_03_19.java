package QA.assignments;

import java.util.Scanner;

public class Question_03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three edges of the triangle: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a+b>c && b+c>a && a+c>b){
            System.out.println("Perimeter is " + (a+b+c));
        }
        else{
            System.out.println("Input is invalid");
        }
    }
}
