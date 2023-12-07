package QA.assignments;

public class Question_06_28 {
    public static void main(String[] args) {
        mersennePrime(31);
    }
    public static void mersennePrime(int limit){
        System.out.println("p\t\t\t\t\t\t\t" +"2^p-1" );
        System.out.println("--------------------------------------------");
        boolean isPrime;

        int p =2;
        while(p<=31) {
            isPrime=true;
            if (p == 2) {
                System.out.println(p+"\t\t\t\t\t\t\t\t\t\t\t"+(int)(Math.pow(2,p)-1));
                p++;
            } else {
                for (int i = 2; i < p; i++) {
                    if (p % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.println(p+"\t\t\t\t\t\t\t\t\t\t\t"+(int)(Math.pow(2,p)-1));
                }
                p++;
            }
        }

    }
}
