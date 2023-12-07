package QA.week_13.Question_13_17;

public class Complex extends Number implements Comparable<Complex>{
    public double real;
    public double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getRealPart() {
        return real;
    }
    public double getImaginaryPart() {
        return imaginary;
    }

    @Override
    public int compareTo(Complex o) {
        return 0;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
    public Complex add(Complex c){
        double[] result = new double[2];
        result[0]=this.real+c.real;
        result[1]=this.imaginary+c.imaginary;
        return new Complex(result[0],result[1]);
    }
    public Complex subtract(Complex c){
        double[] result = new double[2];
        result[0]=this.real-c.real;
        result[1]=this.imaginary-c.imaginary;
        return new Complex(result[0],result[1]);
    }
    public Complex multiply(Complex c){
        double[] result = new double[2];
        result[0]=this.real*c.real-this.imaginary*c.imaginary;
        result[1]=this.imaginary*c.real+this.real*c.imaginary;
        return new Complex(result[0],result[1]);
    }
    public Complex divide(Complex c){
        double[] result = new double[2];
        // Calculate the denominator for division
        double denominator = c.real * c.real + c.imaginary * c.imaginary;

        // Calculate the real and imaginary parts for the result
        double realPart = (this.real * c.real + this.imaginary * c.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * c.real - this.real * c.imaginary) / denominator;

        result[0]=(this.real*c.real+this.imaginary+c.imaginary)/(Math.pow(c.real,2)*(Math.pow(c.imaginary,2)));
        result[1]=(this.imaginary*c.real-this.real*c.imaginary)/(Math.pow(c.real,2)*(Math.pow(c.imaginary,2)));
        return new Complex(realPart,imaginaryPart);
    }
        public double absoluteValue(){
        return Math.sqrt((Math.pow(real,2)+Math.pow(imaginary,2)));
        }
    @Override
    public String toString() {
        return real+" + "+imaginary+"i";
    }
}
