package QA.week_09.assignments;
import QA.week_09.additionalClasses.Stock;
public class Question_09_02 {
    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL","Oracle Corporation",34.5,34.35);
        System.out.printf("""
                Stock name\t\t\t:%s
                Stock symbol\t\t:%s
                Price-change percentage: %.2f
                """,oracle.name,oracle.symbol,oracle.getChangePercent());
    }
}