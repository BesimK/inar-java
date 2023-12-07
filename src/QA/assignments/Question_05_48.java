package QA.assignments;

import java.util.Scanner;

public class Question_05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String entry = input.nextLine();
        String odd = "";
        for (int i = 0; i < entry.length(); i++) {
            if (i%2==0){
                odd = odd.concat(String.valueOf(entry.charAt(i)));
            }
        }
        System.out.println(odd);
    }
}
