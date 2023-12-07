package QA.week_10.additionalClasses;

public class MyInteger {
    private int myInt;

    public MyInteger(int myInt) {
        this.myInt = myInt;
    }

    public int getValue() {
        return myInt;
    }

    public boolean isEven() {
        return myInt % 2 == 0;
    }

    public boolean isOdd() {
        return myInt % 2 != 0;
    }

    public boolean isPrime() {
        for (int i = 2; i < myInt; i++) {
            if (myInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger number) {
        return number.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger number) {
        return number.getValue() % 2 == 0;
    }

    public static boolean isPrime(MyInteger number) {
        for (int i = 2; i < number.getValue(); i++) {
            if (number.getValue() % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int number) {
        return myInt == number;
    }

    public boolean equals(MyInteger number) {
        return myInt == number.getValue();
    }
    public static int parseInt(char[] chars){
        return Integer.parseInt(String.copyValueOf(chars));
    }
    public static int parseInt(String s){
    return Integer.parseInt(s);
    }

}
