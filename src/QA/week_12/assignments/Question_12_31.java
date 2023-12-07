package QA.week_12.assignments;

import java.net.URL;
import java.util.Scanner;

public class Question_12_31 {
    public static void main(String[] args) throws Exception {
        System.out.println("""
                ------------------------------------------------------------------------------------------------------
                Year\t\tRank 1\t\tRank 2\t\tRank 3\t\tRank 4\t\tRank 5\t\tRank 1\t\tRank 2\t\tRank 3\t\tRank 4\t\tRank 5
                ------------------------------------------------------------------------------------------------------
                """);
        for (int i = 2010; i >= 2001 ; --i) {
            URL url = new URL("https://liveexample.pearsoncmg.com/data/babynameranking" + i + ".txt");
            Scanner input = new Scanner(url.openStream());
            System.out.print(i+"\t\t");
            for (int j = 0; j < 5; j++) {
                String[] line = input.nextLine().split("\\s+");
                System.out.print(line[3]+"\t\t");
            }
            for (int j = 0; j < 5; j++) {
                String[] line = input.nextLine().split("\\s+");
                System.out.print(line[1]+"\t\t");
            }
            System.out.println();
        }
    }
}
