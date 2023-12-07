package QA.week_10.assignments;

import QA.week_10.additionalClasses.MyInteger;

public class Question_10_03 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(41614161);
        System.out.println(
                "getValue(): " + myInteger.getValue() +
                        "\nisEven(): " + myInteger.isEven() +
                        "\nisOdd(): " + myInteger.isOdd() +
                        "\nisPrime(): " + myInteger.isPrime() +
                        "\nequals(10): " + myInteger.equals(10) +
                        "\nequals(MyInteger(41614161)): " + myInteger.equals(new MyInteger(41614161)) +
                        "\nisEven(41614161): " + MyInteger.isEven(41614161) +
                        "\nisOdd(41614161) static: " + MyInteger.isOdd(41614161) +
                        "\nisPrime(41614161) static: " + MyInteger.isPrime(41614161) +
                        "\nparseInt(char[]{1,2,3}): " + MyInteger.parseInt(new char[]{'1','2','3'}) +
                        "\nparseInt(String 123): " + MyInteger.parseInt("123"));
    }
}
