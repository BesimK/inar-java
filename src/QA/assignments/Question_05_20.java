package QA.assignments;

public class Question_05_20 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 2 and 1,000 inclusive are :");
        final int NUMBERS_PER_LINE = 8;
        int line = 0;
        int number = 2;

        boolean isPrime = true;

        while (number <= 1000) {
            isPrime = true;
            if (number == 2 || number == 3) {
                line++;
                System.out.print(number + "\t");

            }
            for (int i = 2; i <= number / 2; i++) {


                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                if (i == number / 2 && isPrime) {
                    line++;
                    if (line % NUMBERS_PER_LINE == 0) {
                        System.out.println(number);
                    } else {
                        System.out.print(number + "\t");
                    }
                }
            }
            number++;
        }

    }
}
