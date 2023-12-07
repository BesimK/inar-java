package QA.week_13.Question_13_15;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    public BigInteger numerator;
    public BigInteger denominator;


    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = BigInteger.valueOf(((denominator > 0) ? 1 : -1) * numerator / gcd);
        this.denominator = BigInteger.valueOf(Math.abs(denominator) / gcd);
    }

    private long gcd(long numerator, long denominator) {
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        int gcd = 1;
        long limit = Math.min(numerator, denominator);
        for (int i = 2; i <= limit; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public long getNumerator() {
        return this.numerator.longValue();
    }

    public long getDenominator() {
        return this.denominator.longValue();
    }

    @Override
    public double doubleValue() {
        return this.numerator.doubleValue() / this.denominator.doubleValue();
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    public QA.week_13.Question_13_18.Rational multiply(Rational secondRational) {
        long numerator = this.numerator.longValue() * secondRational.getNumerator();
        long denominator = this.denominator.longValue() * secondRational.getDenominator();
        return new QA.week_13.Question_13_18.Rational(numerator, denominator);
    }

    public QA.week_13.Question_13_18.Rational divide(Rational secondRational) {
        long numerator = this.numerator.longValue() * secondRational.getDenominator();
        long denominator = this.denominator.longValue() * secondRational.getNumerator();
        return new QA.week_13.Question_13_18.Rational(numerator, denominator);
    }

    public QA.week_13.Question_13_18.Rational subtract(Rational secondRational) {
        long numerator = this.numerator.longValue() * secondRational.getDenominator() - secondRational.getNumerator() * this.denominator.longValue();
        long denominator = this.denominator.longValue() * secondRational.getDenominator();
        return new QA.week_13.Question_13_18.Rational(numerator, denominator);
    }

    public QA.week_13.Question_13_18.Rational add(Rational secondRational) {
        long numerator = this.numerator.longValue() * secondRational.getDenominator() + secondRational.getNumerator() * this.denominator.longValue();
        long denominator = this.denominator.longValue() * secondRational.getDenominator();
        return new QA.week_13.Question_13_18.Rational(numerator, denominator);
    }

    @Override
    public String toString() {
        return (this.denominator.longValue() == 1) ? this.numerator + "" : this.numerator + "/" + this.denominator;
    }

    @Override
    public int compareTo(Rational o) {
        return (this.subtract(o).getNumerator() > 0) ? 1 :
                (this.subtract(o).getNumerator() == 0) ? 0 : -1;
    }

    public boolean equals(Rational o) {
        return this.subtract(o).getNumerator() == 0;
    }
}
