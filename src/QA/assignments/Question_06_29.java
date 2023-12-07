package QA.assignments;

public class Question_06_29 {
    public static void main(String[] args) {
        twinPrime(1000);
    }

    public static void twinPrime(int limit) {
        int primeNumber=2;
        while (primeNumber+2<1000){
            if(isPrime(primeNumber)&&isPrime(primeNumber+2)){
                System.out.println("(" + primeNumber + ",  " + (primeNumber+2) + ")");
            }
            primeNumber++;
        }
    }

    public static boolean isPrime(int primeNumber) {
        if(primeNumber==2){return true;}
        for (int i = 2; i < primeNumber; i++) {
            if(primeNumber%i==0){
                return false;
            }
        }
        return true;
    }


}
