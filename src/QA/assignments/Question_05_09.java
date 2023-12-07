package QA.assignments;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int totalStudents = input.nextInt();
        String  [][] id = new String[totalStudents][3];
        String a;
        int indexFirst,indexSecond,maxFirst,maxSecond;

        for(int i =0;i<totalStudents;i++){
            int j =0;
            id[i][j]= "" + (i + 1);
            System.out.println("Student: " + (i+1));
            System.out.println("Name: ");
            a = input.next();
            id[i][j+1]=a;

            System.out.println("Score: ");
            a = input.next();
            id[i][j+2]=a;
        }
        indexFirst = 0;
        indexSecond = 0;
        maxFirst = Integer.parseInt(id[0][2]);
        maxSecond=0;
        for(int i = 0;i<totalStudents;i++){
            if(Integer.parseInt(id[i][2])>maxFirst){
                maxFirst = Integer.parseInt(id[i][2]);
                indexFirst = i;

            }
        }
        for(int i = 0;i<totalStudents;i++){
            if(Integer.parseInt(id[i][2])==maxFirst){
                continue;
            }
            else{
                if(Integer.parseInt(id[i][2])>maxSecond){
                    maxSecond = Integer.parseInt(id[i][2]);
                    indexSecond = i;
                }

            }
        }
        System.out.println("Student with the highest score: " + id[indexFirst][1]);
        System.out.println("Student with the highest score: " + id[indexSecond][1]);
    }
}
