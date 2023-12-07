package QA.week_12.assignments;

import java.net.URL;
import java.util.Scanner;

public class Question_12_19 {
    public static void main(String[] args) throws Exception {
        String path = "https://en.wikipedia.org/wiki/The_Cranberries";
        URL url = new URL(path);
        Scanner input = new Scanner(url.openStream());
        int counter = 0;
        while (input.hasNext()){
            counter++;
            input.next();
        }
        input.close();
        System.out.println("Total words number is " + counter);
        System.out.println(path);
    }
}