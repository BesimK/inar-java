package QA.week_12.assignments;

import java.io.*;
import java.util.*;

public class Question_12_15 {
    public static void main(String[] args) throws Exception{
        String path ="C:\\Users\\BESIM\\workspace\\inar-java\\src\\QA.interview\\RandomNumbers.txt";
        File file = new File(path);
        if(file.exists()){
            System.out.println("This file already exists!!!");
            System.exit(4162);
        }
        printToFile(file);
        ArrayList<Integer> readNumbers = new ArrayList<>();
        magicTrick(readNumbers,file);


    }
    private static void magicTrick(ArrayList<Integer> readNumbers, File file) throws Exception{
        Scanner input = new Scanner(file);
        while (input.hasNext()){
            readNumbers.add(Integer.parseInt(input.next()));
        }
        Object[] array = readNumbers.toArray();
        Arrays.sort(array);
        for (int i = 1; i <= 100; i++) {
            if(i%10==0){
                System.out.println(array[i-1]);
            }
            else System.out.print(array[i-1] + " ");
        }
    }

    private static void printToFile (File file) throws Exception {
        PrintWriter writer = new PrintWriter(file);
        for (int i = 1; i <= 100; i++) {
            if(i%10==0){
                writer.printf("%3d\n",(int)(Math.random()*100));
            }else {
                writer.printf("%3d",(int)(Math.random()*100));
            }
        }
        writer.close();
    }
}
