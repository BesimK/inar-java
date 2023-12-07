package QA.assignments;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary=5000;
        double sales = 0;
        System.out.println("Enter the commission sought: ");
        double commission= input.nextDouble();
        for (int i = 0; i < commission; i++) {


            if(sales<=5000){
                sales+=0.01;
                salary = 5000 + (sales/100*8);
            }
            else if(sales<=10000){
                sales+=0.01;
                salary = 5000 + (5000.0/100*8) + ((sales-5000)/100*10);
            }
            else{
                sales+=0.01;
                salary = 5000 + (5000.0/100*8) + (5000.0/100*10) + ((sales-10000.0)/100*12);
            }
        }
        System.out.printf("Minimum sales to earn $30,000 is $%.2f",sales);
    }
}
