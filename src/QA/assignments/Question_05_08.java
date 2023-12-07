package QA.assignments;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int totalStudents = input.nextInt();
        String  [][] id = new String[totalStudents][3];
        String a;
        int index,max;

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
        index = 0;
        max = Integer.parseInt(id[0][2]);
        for(int i = 0;i<totalStudents;i++){
            if(Integer.parseInt(id[i][2])>max){
                max = Integer.parseInt(id[i][2]);
                index = i;
            }
        }
        System.out.println("Student with the highest score: " + id[index][1]);
    }
}
