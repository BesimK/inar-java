package QA.assignments;

public class Question_05_10 {
    public static void main(String[] args) {
        int number = 100;
        int counter = 0;
        while (number <=1000){
            if (counter==10){
                System.out.println();
                counter=0;
            }
            if(number%5==0 && number%6==0){
                System.out.print(number + " ");
                number++;
                counter++;
            }
            else{
                number++;
            }
        }
    }
}
