package QA.assignments;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String ISBN = input.nextLine();
        if(ISBN.length()!=12){
            System.out.println("Invalid input");
            System.exit(1);
        }
        int checksum=0;
        for (int i = 1; i <=12 ; i++) {
                if(i%2!=0){
                    checksum+=Integer.parseInt(String.valueOf(ISBN.charAt(i-1)));
                }
                else{
                    checksum+=3*(Integer.parseInt(String.valueOf(ISBN.charAt(i-1))));
                }
        }
        checksum= 10-(checksum%10);
        if (checksum==10){
            System.out.println(ISBN + 0);
        }
        else if(checksum>=0&&checksum<=9) {

            System.out.println("ISBN is " + ISBN + checksum);
        }
        else System.out.println(ISBN + " is an invalid input");
    }
}
