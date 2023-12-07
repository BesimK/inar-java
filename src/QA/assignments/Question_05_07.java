package QA.assignments;


public class Question_05_07 {
    public static void main(String[] args) {
        int tuition = 10000;
        int totalTuition=0;
        for(int i = 0;i<10;i++){
            tuition =(int) (tuition + (tuition * 0.05));
        }

        System.out.println("Tuition in ten years: $"+tuition);

        for(int i = 0;i<4;i++){
            tuition =(int) (tuition + (tuition * 0.05));
            totalTuition = totalTuition+tuition;

        }
        System.out.print("Result $"+totalTuition);
    }
}
