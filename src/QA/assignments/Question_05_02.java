package QA.assignments;

import java.util.Scanner;

public class Question_05_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long time = System.currentTimeMillis();
        int correctCounter=0;
        String fullTest = "";
        for(int i = 0; i<10;i++){
            int a =(int) (1+Math.random()*15);
            int b =(int) (1+Math.random()*15);
            System.out.printf("What is %d + %d?%n",a,b);
            int answer = input.nextInt();

            if (a+b==answer){
                System.out.println("You are correct!");
                correctCounter++;
                fullTest = fullTest + a + " + " + b + " = " + answer +" correct\n";
            }
            else{
                System.out.println("Your answer is wrong.");
                System.out.printf("%d + %d should be %d%n",a,b,answer);
                fullTest = fullTest + a + " + " + b + " = " + answer +" wrong\n";
            }
        }
        long testTime = System.currentTimeMillis();
        System.out.println("Correct count is " + correctCounter);
        System.out.println("Test time is " + ((testTime-time)/1000));
        System.out.println(fullTest);

    }

}
