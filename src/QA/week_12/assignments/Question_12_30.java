package QA.week_12.assignments;

import java.net.URL;
import java.util.*;
import java.io.*;

public class Question_12_30 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = input.nextInt();
        System.out.println("Enter the gender : ");
        String gender = input.next();
        System.out.println("Enter the name : ");
        String name = input.next();

        URL url = new URL("https://liveexample.pearsoncmg.com/data/babynameranking" + year + ".txt");
        input = new Scanner(url.openStream());
        boolean isFound = true;
        while (input.hasNext()) {
            String str = input.nextLine();
            String[] strArray = str.split("\\s+");
            if (gender.equalsIgnoreCase("M")) {
                if (strArray[1].equals(name)) {
                    System.out.println(name + " is ranked #" + strArray[0] + " in year " + year);
                    isFound = false;
                    break;
                }
            } else if (gender.equalsIgnoreCase("F")) {
                if (strArray[3].equals(name)) {
                    System.out.println(name + " is ranked #" + strArray[0] + " in year " + year);
                    isFound = false;
                    break;
                }
            }
        }
        if (isFound) {
            System.out.println("The name " + name + " is not ranked in year " + year);
        }

    }
}
