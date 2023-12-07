package QA.week_12.assignments;

import java.util.*;

public class Question_12_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex value: ");
        String hex = input.next();
        try {
            isValidHex(hex);
        }catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
        hex2Dec(hex);
    }

    private static void hex2Dec (String hexNumber) {
        int decimalNumber = 0;
        int power = 0;

        // Iterate through each digit of the hexadecimal number (from right to left)
        for (int i = hexNumber.length() - 1; i >= 0; i--) {
            char digit = hexNumber.charAt(i);
            int digitValue = Character.isDigit(digit) ? digit - '0' : Character.toUpperCase(digit) - 'A' + 10;

            // Calculate decimal value and add to the result
            decimalNumber += (int) (digitValue * Math.pow(16, power));
            power++;
        }

        System.out.println("The decimal value for hex number " + hexNumber +" is " +    decimalNumber);
    }
    private static void isValidHex(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            if(hex.charAt(i)>='A'&&hex.charAt(i)<='F'||hex.charAt(i)>='0'&&hex.charAt(i)<='9'){
                continue;
            }
            else {
                throw new NumberFormatException("It is not a hex string!");
            }
        }
    }

}
