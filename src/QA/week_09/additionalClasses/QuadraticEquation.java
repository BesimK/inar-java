package QA.week_09.additionalClasses;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation() {

    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminants(){
        return Math.pow(b,2)-(4*a*c);
    }
    public double getRoot1(){
        return (getDiscriminants()>0)?(-b+Math.sqrt(getDiscriminants()))/(2*a):0;
    }
    public double getRoot2(){
        return (getDiscriminants()>0)?(-b-Math.sqrt(getDiscriminants()))/(2*a):0;
    }

}
