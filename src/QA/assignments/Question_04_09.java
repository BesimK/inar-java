package QA.assignments;
import java.util.*;
public class Question_04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String myChar = input.next();

        System.out.println("The Unicode for the character " + myChar + " is " + (int)(myChar.charAt(0)));
    }
}
