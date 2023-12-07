package QA.week_12.assignments;

import QA.week_12.additionalClasses.BinaryFormatException;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Question_12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String binary = input.next();
        try {
            bin2Dec(binary);
        } catch (BinaryFormatException ex) {
            System.out.println("It is not a binary string!");
        } catch (InputMismatchException ex) {
            System.out.println("It is not even a number!");
        }
    }

    private static void bin2Dec(String binary) throws BinaryFormatException {
        isValidBinary(binary);
        int decimalNumber = 0;
        int power = 0;

        // Iterate through each digit of the binary number (from right to left)
        for (int i = binary.length() - 1; i >= 0; i--) {
            char digit = binary.charAt(i);
            int digitValue = Character.getNumericValue(digit);

            // Calculate decimal value and add to the result
            decimalNumber += (int) (digitValue * Math.pow(2, power));
            power++;
        }
        System.out.println("Decimal value for number " + binary + " is " + decimalNumber);
    }

    protected static void isValidBinary(String binary) throws BinaryFormatException {
        try {
            Integer.parseInt(binary);
        } catch (NumberFormatException ex) {
            throw new InputMismatchException();
        }
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1' || binary.charAt(i) == '0') {
                continue;
            } else {
                throw new BinaryFormatException(binary);
            }
        }
    }
}

