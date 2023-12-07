package QA.week_13.Question_13_18.Cello;

import java.math.BigInteger;

public class Trie {
    public static void main(String[] args) {
        FixedRational result = new FixedRational(new BigInteger("1"),new BigInteger("2"));
        for (int i = 2; i < 100; i++) {
            BigInteger numerator = new BigInteger(String.valueOf(i));
            BigInteger denominator = new BigInteger(String.valueOf(i+1));
            FixedRational currentRational = new FixedRational(numerator,denominator);
            result = result.add(currentRational);
        }
        System.out.println(result);
    }
}