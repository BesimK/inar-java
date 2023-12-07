package QA.assignments;



public class Question_05_15 {
    public static void main(String[] args) {
        int index = 33;
        int counter = 0;
        while (index<=126){
            if(counter == 10){
                System.out.println();
                counter=0;
            }
            else{
                System.out.print((char)index + " ");
                counter++;
                index++;
            }
        }
    }
}
