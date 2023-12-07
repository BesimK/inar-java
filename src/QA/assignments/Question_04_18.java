package QA.assignments;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String entry = input.nextLine();
        switch (entry){
            case "M1":
                System.out.println("Mathematics Freshman");
                break;
            case "M2":
                System.out.println("Mathematics Sophomore");
                break;
            case "M3":
                System.out.println("Mathematics Junior");
                break;
            case "M4":
                System.out.println("Mathematics Senior");
                break;
            case "C1":
                System.out.println("Computer Sciences Freshman");
                break;
            case "C2":
                System.out.println("Computer Sciences Sophomore");
                break;
            case "C3":
                System.out.println("Computer Sciences Junior");
                break;
            case "C4":
                System.out.println("Computer Sciences Senior");
                break;
            case "I1":
                System.out.println("Information Technology Freshman");
                break;
            case "I2":
                System.out.println("Information Technology Sophomore");
                break;
            case "I3":
                System.out.println("Information Technology Junior");
                break;
            case "I4":
                System.out.println("Information Technology Senior");
                break;
            default:
                System.out.println(entry + " is invalid input");
        }
    }
}
