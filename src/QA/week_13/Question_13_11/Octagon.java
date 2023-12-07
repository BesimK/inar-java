package QA.week_13.Question_13_11;

import QA.week_13.Question_13_05.GeometricObject;

public class Octagon extends GeometricObject implements Comparable<GeometricObject>,Cloneable {
    private double side;
    public Octagon(double side,String color, boolean filled) {
        super(color, filled);
        this.side=side;
    }
    public double getArea(){
        double perimeter = 8 * this.side;
        double apothem = this.side / (2 * Math.tan(Math.PI / 8)); // Apothem formula for a regular octagon
        return 0.5 * perimeter * apothem;
    }

    @Override
    public boolean equals(GeometricObject o) {
        return false;
    }

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(getArea(), o.getArea());
    }

    @Override
    public Octagon clone() {
        try {
            return (Octagon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
