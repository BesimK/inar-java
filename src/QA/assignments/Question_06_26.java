package QA.assignments;

public class Question_06_26 {
    public static void main(String[] args) {
        palindromicPrime(100);
    }

    public static void palindromicPrime(int limit) {
        boolean isPrime;
        boolean isPalindrome;
        int counter = 1;
        int number = 2;
        String entry = "";
        String palindrome = "";

        while (counter <= limit) {
            if (number == 2) {
                System.out.printf("%9d", number);
                number++;
                counter++;
            } else {
                palindrome = "";
                entry = String.valueOf(number);
                isPrime = true;
                isPalindrome = true;
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                for (int i = 1; i <= entry.length(); i++) {
                    palindrome += entry.charAt(entry.length() - i);
                }
                if (!palindrome.equals(entry)) {
                    isPalindrome = false;
                }
                if (isPrime) {
                    if (isPalindrome) {
                        if (counter % 10 == 0) {
                            System.out.printf("%9d%n", number);
                        } else System.out.printf("%9d", number);
                        counter++;
                    }
                }
                number++;
            }
        }
    }
}
