package QA.assignments;

import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";
        System.out.println("Enter a string: ");
        String entry = input.nextLine();
        entry = entry.toUpperCase();
        for (int i = 0; i < entry.length(); i++) {
            result += String.valueOf(getNumber(entry.charAt(i)));
        }
        System.out.println(result);
    }

    public static int getNumber(char uppercaseLetter) {
        if (uppercaseLetter >= '0' && uppercaseLetter <= '9') {
            return Integer.parseInt(String.valueOf(uppercaseLetter));
        } else if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C') {
            return 2;
        } else if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F') {
            return 3;
        } else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' ||
                    uppercaseLetter == 'I'|| uppercaseLetter == 'İ') {
            return 4;
        } else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L') {
            return 5;
        } else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O') {
            return 6;
        } else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q' ||
                    uppercaseLetter == 'R' || uppercaseLetter == 'S') {
            return 7;
        } else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V') {
            return 8;
        } else if (uppercaseLetter == 'W' || uppercaseLetter == 'X'
                || uppercaseLetter == 'Y' || uppercaseLetter == 'Z') {
            return 9;
        }
        else return 0;
    }
}
