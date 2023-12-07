package QA.week_12.assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question_12_14 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_12 sourceFile");
            return;
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("Existential Problem Again?");
            return;
        }
        int counter=0;
        double sum=0;
        Scanner input = new Scanner(file);
        while (input.hasNext()){
             sum +=Integer.parseInt(input.next());
             counter++;
        }
        System.out.println("Sum of numbers in the file is :" +(int)sum);
        System.out.println("Number of integers: " + counter);
        System.out.println("Average : " + sum/counter);
    }
}
