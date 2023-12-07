package QA.assignments;
import java.util.Scanner;


public class Question_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        int divisor = 2;
        String result = "";
        String output = "";
        while (number!=1){
                if(number % divisor==0){
                    result= result + divisor + ", ";
                    number = number /divisor;
                }
                else{
                    divisor++;
                }
        }
        output=result.substring(0,result.length()-2);
        output = output+".";
        System.out.println(output);
    }
}
