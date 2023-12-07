package QA.assignments;

import java.util.Scanner;

public class Question_04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hex = input.nextLine();
        char control = (char)(hex.charAt(0));
        if (hex.length()>1){
            System.out.println("Invalid multiple digit input");
            System.exit(1);
        }

        switch (control){
            case '0':
                System.out.println("The binary value is 0000");
                break;
            case '1':
                System.out.println("The binary value is 0001");
                break;
            case '2':
                System.out.println("The binary value is 0010");
                break;
            case '3':
                System.out.println("The binary value is 0011");
                break;
            case '4':
                System.out.println("The binary value is 0100");
                break;
            case '5':
                System.out.println("The binary value is 0101");
                break;
            case '6':
                System.out.println("The binary value is 0110");
                break;
            case '7':
                System.out.println("The binary value is 0111");
                break;
            case '8':
                System.out.println("The binary value is 1000");
                break;
            case '9':
                System.out.println("The binary value is 1001");
                break;
            case 'A','a':
                System.out.println("The binary value is 1010");
                break;
            case 'B','b':
                System.out.println("The binary value is 1011");
                break;
            case 'C','c':
                System.out.println("The binary value is 1100");
                break;
            case 'D','d':
                System.out.println("The binary value is 1101");
                break;
            case 'E','e':
                System.out.println("The binary value is 1110");
                break;
            case 'F','f':
                System.out.println("The binary value is 1111");
                break;

            default:
                System.out.println( hex + " is an invalid input");

        }
    }
}
