package QA.week_11.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1= (int)(Math.random()*10);
        int number2= (int)(Math.random()*10);
        ArrayList<Integer> answers = new ArrayList<>();

        System.out.printf("What is %d+%d ?\n",number1,number2);
        int answer = input.nextInt();
        while(answer!=number1+number2){
            if(!answers.contains(answer)){
                answers.add(answer);
                System.out.println("Wrong answer please try again");
            }
            else{
                System.out.println("You already entered " + answer);
            }
            System.out.printf("What is %d+%d ?\n",number1,number2);
            answer=input.nextInt();
        }
        System.out.println("You got it!");
    }
}
