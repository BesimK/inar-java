package QA.assignments;

public class Question_06_16 {
    public static void main(String[] args) {
        System.out.println("Year\t\t\tDays in year");
        for (int i = 2000; i <= 2020 ; i++) {
            System.out.print(i + "\t\t\t");
            System.out.println(numberOfDaysInAYear(i));
        }
    }
    public static int numberOfDaysInAYear(int year){
        if (year%4==0){
            return 366;
        }
        else return 365;
    }
}
