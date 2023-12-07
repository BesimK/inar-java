package QA.week_12.assignments;

import java.io.File;
import java.util.Scanner;

public class Question_12_24 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\BESIM\\workspace\\inar-java\\src\\QA.week_12\\assignments\\Salary.txt");
        if (!file.exists()) {
            System.out.println("Exists not!");
            return;
        }
        double totalSalary = 0;
        int totalCounter = 0;
        double totalAssistant = 0;
        int assistantCounter = 0;
        double totalAssociate = 0;
        int associateCounter = 0;
        double totalProf = 0;
        int professorCounter = 0;
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            String str = input.nextLine();
            String[] array = str.split("\\s+");
            totalSalary += Double.parseDouble(array[3].replace(',','.'));
            ++totalCounter;
            switch (array[2]) {
                case "assistant" -> {
                    totalAssistant += Double.parseDouble(array[3].replace(',','.'));
                    ++assistantCounter;
                }
                case "associate" -> {
                    totalAssociate += Double.parseDouble(array[3].replace(',','.'));
                    ++associateCounter;
                }
                case "full" -> {
                    totalProf += Double.parseDouble(array[3].replace(',','.'));
                    ++professorCounter;
                }
            }
        }
        System.out.printf("Total salary for assistant professor: %.2f\n", totalAssistant);
        System.out.printf("Total salary for associate professor: %.2f\n", totalAssociate);
        System.out.printf("Total salary for full professor: %.2f\n", totalProf);
        System.out.printf("Total salary for all faculty: %.2f\n", totalSalary);
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("Average salary for assistant professor: %.2f\n", totalAssistant/assistantCounter);
        System.out.printf("Average salary for associate professor: %.2f\n", totalAssociate/associateCounter);
        System.out.printf("Average salary for full professor: %.2f\n", totalProf/professorCounter);
        System.out.printf("Average salary for all faculty: %.2f\n", totalSalary/totalCounter);
    }
}

