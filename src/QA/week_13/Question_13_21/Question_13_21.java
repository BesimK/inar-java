package QA.week_13.Question_13_21;

import java.util.*;
import QA.week_13.Question_13_18.Rational;

public class Question_13_21 {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a, b, c (as integers): ");

            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            Rational aRational = new Rational(a);
            Rational bRational = new Rational(b);
            Rational cRational = new Rational(c);

            Rational h = new Rational(bRational.multiply(new Rational(-1)).longValue(),
                    aRational.multiply(new Rational(2)).longValue());

            Rational k = aRational.multiply(h.multiply(h)).add(bRational.multiply(h)).add(cRational);

            System.out.println("h is " + h + ", k is " + k);    
    }
}

