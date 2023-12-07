package QA.week_12.assignments;

import java.io.PrintWriter;

public class Question_12_23 {
    public static void main(String[] args) throws Exception{
        PrintWriter writer = new PrintWriter("C:\\Users\\BESIM\\workspace\\inar-java\\src\\QA.week_12\\assignments\\Salary.txt");
        for (int i = 1; i <= 1000 ; i++) {
            writer.print("FirstName" + i + " LastName" + i);
            int rank = (int)(Math.random()*3);
            double salary;
            switch (rank) {
                case 0 -> {
                    salary = (Math.random() * 30000) + 50000;
                    writer.printf(" assistant %.2f\n",salary);
                }
                case 1 -> {
                    salary = (Math.random() * 50000) + 60000;
                    writer.printf(" associate %.2f\n",salary);
                }
                case 2 -> {
                    salary = (Math.random() * 55000) + 75000;
                    writer.printf(" full %.2f\n",salary);
                }
            }
        }
        writer.close();
    }
}
