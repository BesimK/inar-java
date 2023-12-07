package QA.week_13.Question_13_14;


public class Rational extends Number implements Comparable<Rational> {
    private long r[] = new long[2];

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        r[1] = Math.abs(denominator) / gcd;
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
        return r[0];
    }

    public long getDenominator() {
        return r[1];
    }

    @Override
    public double doubleValue() {
        return r[0] * 1.0 / r[1];
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

    public Rational multiply(Rational secondRational) {
        long numerator = this.r[0] * secondRational.getNumerator();
        long denominator = this.r[1] * secondRational.getDenominator();
        return new Rational(numerator, denominator);
    }

    public Rational divide(Rational secondRational) {
        long numerator = this.r[0] * secondRational.getDenominator();
        long denominator = this.r[1] * secondRational.getNumerator();
        return new Rational(numerator, denominator);
    }

    public Rational subtract(Rational secondRational) {
        long numerator = this.r[0] * secondRational.getDenominator() - secondRational.getNumerator() * this.r[1];
        long denominator = this.r[1] * secondRational.getDenominator();
        return new Rational(numerator, denominator);
    }

    public Rational add(Rational secondRational) {
        long numerator = this.r[0] * secondRational.getDenominator() + secondRational.getNumerator() * this.r[1];
        long denominator = this.r[1] * secondRational.getDenominator();
        return new Rational(numerator, denominator);
    }

    @Override
    public String toString() {
        return (r[1] == 1) ? r[0] + "" : r[0] + "/" + r[1];
    }

    @Override
    public int compareTo(Rational o) {
        return (this.subtract(o).getNumerator() > 0) ? 1 :
               (this.subtract(o).getNumerator() == 0) ? 0 : -1;
    }
    public boolean equals(Rational o){
        return this.subtract(o).getNumerator() == 0;
    }
}
