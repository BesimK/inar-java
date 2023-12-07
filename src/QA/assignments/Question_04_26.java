package QA.assignments;
import java.util.*;

public class Question_04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in dollars and cents: ");
        String dollars = input.next();
        double monetary = Double.parseDouble(dollars);
        monetary = (monetary * 100);
        int newMonetary = (int)monetary;
        System.out.println("Equivalent in monetary units:");
        System.out.println("\tDollars: " + newMonetary/100 );
        newMonetary = newMonetary % 100;
        System.out.println("\tQuarters: " + (newMonetary/25) );
        newMonetary = newMonetary % 25;
        System.out.println("\tDimes: " + (newMonetary/10) );
        newMonetary = newMonetary % 10;
        System.out.println("\tNickels: " + (newMonetary/5) );
        newMonetary = newMonetary % 5;
        System.out.println("\tPennies: " + newMonetary );
    }
}