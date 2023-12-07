package QA.week_12.assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question_12_29 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name:");
        String fileName = input.next();
        File file = new File("C:\\Users\\BESIM\\workspace\\inar-java\\src\\QA.week_12\\assignments\\"+fileName);
        if(!file.exists()){
            System.out.println("Existential problems!!");
            return;
        }
        input.close();
        Scanner scanner = new Scanner(file);
        int[] occurrences = new int[26];
        while (scanner.hasNext()){
                String str = scanner.next();
                for(char ch:str.toCharArray()){
                    occurrences[(Character.toUpperCase(ch)-65)]++;// occurrences[A-65]++=occurrences[0]++
                }
        }
        scanner.close();
        for (int i = 0; i < occurrences.length; i++) {
            if(occurrences[i]==0){
                continue;
            }
            char ch = (char)(i+65);
            System.out.println("Number of " + ch + "'s -> " + occurrences[i]);
        }
    }
}
