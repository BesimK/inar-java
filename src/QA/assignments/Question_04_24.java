package QA.assignments;

import java.util.Scanner;

public class Question_04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first city: ");
        String firstCity = input.nextLine();
        System.out.println("Enter second city: ");
        String secondCity = input.nextLine();
        System.out.println("Enter third city: ");
        String thirdCity = input.nextLine();
        System.out.print("Three cities in alphabetical order are ");

       if ( firstCity.compareTo(secondCity)<=0){
           if ( firstCity.compareTo(thirdCity)<=0){
               System.out.print(firstCity);
               if ( secondCity.compareTo(thirdCity)<=0){
                   System.out.println(" " + secondCity + " " + thirdCity);
               }else{
                   System.out.println(" " + thirdCity + " " + secondCity);
               }
               System.exit(1);
           }
       }if ( secondCity.compareTo(firstCity)<=0){
            if ( secondCity.compareTo(thirdCity)<=0){
                System.out.print(secondCity);
                if ( firstCity.compareTo(thirdCity)<=0){
                    System.out.println(" " + firstCity + " " + thirdCity);
                }else{
                    System.out.println(" " + thirdCity + " " + firstCity);
                }
            }
            System.exit(1);
        }
        if ( thirdCity.compareTo(firstCity)<=0){
            if ( thirdCity.compareTo(secondCity)<=0){
                System.out.print(thirdCity);
                if ( firstCity.compareTo(secondCity)<=0){
                    System.out.println(" " + firstCity + " " + secondCity);
                }else{
                    System.out.println(" " + secondCity + " " + firstCity);
                }
            }
            System.exit(1);
        }


    }
}
