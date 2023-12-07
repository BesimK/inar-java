package QA.week_14.Question_14_22;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_14_22 {
    public static void main(String[] args) {
        //Happy numbers huh?
        Scanner input = new Scanner(System.in);
        System.out.print("Enter: ");
        String number =input.next();
        ArrayList<String> numberController = new ArrayList<>();
        numberController.add(number);
        int counter = 0;
        while (!numberController.isEmpty()){
            String s = numberController.remove(0);
            int sum = 0;
            for (char c : s.toCharArray()){
                sum += (int) Math.pow((c-'0'),2);
            }
            if(sum==1){
                System.out.println(number + " is a happy number! ");
                return;
            }
            if(counter==100) {
                System.out.println("There lies no happiness bruh!");
                break;
            }
            ++counter;
            numberController.add(String.valueOf(sum));
        }
    }
}
