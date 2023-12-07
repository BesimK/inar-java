package QA.assignments;

public class Question_06_27 {
    public static void main(String[] args) {
        palindromicPrime(100);
    }

    public static void palindromicPrime(int limit) {
        boolean isPrime;
        boolean isPalindrome;
        boolean isReversalPrime;
        int counter = 1;
        int number = 13;
        int reversalNumber;
        String entry = "";
        String palindrome = "";

        while (counter <= limit) {
            palindrome = "";
            entry = String.valueOf(number);
            isPrime = true;
            isPalindrome = true;
            isReversalPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            for (int i = 1; i <= entry.length(); i++) {
                palindrome += entry.charAt(entry.length() - i);
            }
            reversalNumber = Integer.parseInt(palindrome);
            for (int i = 2; i < reversalNumber; i++) {
                if (reversalNumber % i == 0) {
                    isReversalPrime = false;
                    break;
                }
            }
            if (!palindrome.equals(entry)) {
                isPalindrome = false;
            }
            if (isPrime) {
                if (!isPalindrome) {
                    if (isReversalPrime) {
                        if (counter % 10 == 0) {
                            System.out.printf("%9d%n", number);
                        } else System.out.printf("%9d", number);
                        counter++;
                    }
                }
            }
            number++;
        }
    }
}

