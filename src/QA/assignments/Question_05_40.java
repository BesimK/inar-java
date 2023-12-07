package QA.assignments;

public class Question_05_40 {
    public static void main(String[] args) {
        int heads=0;
        int tails=0;
        int toss;
        System.out.println("Flipping coins one million times...");
        for (int i = 1; i <=1000000 ; i++) {
            toss = (int)(Math.random()*2);
            if(toss == 0){
                heads++;
            }
            else {
                tails++;
            }
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
