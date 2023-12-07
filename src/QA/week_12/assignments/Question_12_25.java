package QA.week_12.assignments;

import java.io.File;
import java.util.Scanner;

public class Question_12_25 {
    public static void main(String[] args) {
        makeDirectory();
    }
    private static void makeDirectory() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a directory name:");
        String directoryName = input.next();
        String path = "C:\\Users\\BESIM\\workspace\\inar-java\\src\\QA.week_12\\assignments\\";
        File directory = new File(path+directoryName);
        if(directory.exists()){
            System.out.println("This file already exists, bruh!");
            System.exit(2);
        }
        if(directory.mkdir()){
            System.out.println("Directory successfully created!");
        }
        else {
            System.out.println("A problem occurred while creating!");
        }
    }
}