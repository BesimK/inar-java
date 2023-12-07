package QA.assignments;

import java.util.Scanner;

public class Question_06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
        String entry = input.nextLine();
        System.out.println("Enter a character that you want to count :");
        char character = input.next().charAt(0);
        System.out.println(count(entry,character));
    }
    public static int count(String entry,char character){
        int counter = 0;
        for (int i = 0; i < entry.length(); i++) {
            if(entry.charAt(i)==character){
                counter++;
            }
        }
        return counter;
    }
}
