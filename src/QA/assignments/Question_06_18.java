package QA.assignments;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = input.nextLine();
        checkPassword(password);
    }
    public static void checkPassword(String psw){
        int digitCounter=0;
        boolean isEnough=true;
        int passwordLength=psw.length();
        if(psw.length()<8){
            isEnough=false;
        }
        for (int i = 0; i < passwordLength; i++) {
            if (psw.charAt(i)>='0' && psw.charAt(i)<='9'){
                digitCounter++;
            }
            if ((psw.charAt(i)<'0' || psw.charAt(i)>'9')) {
                if ((psw.charAt(i) < 'A' || psw.charAt(i) > 'z')) {
                    isEnough = false;
                }
            }
        }
        if(digitCounter<2){
            isEnough=false;
        }
        if(isEnough){
            System.out.println("Valid Password");
        }
        else System.out.println("Invalid Password");
    }
}
