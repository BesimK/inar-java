package QA.week_11.additionalClasses;

import java.util.Date;

public class GeometricObject {
    String color = "white";
    boolean filled;
    Date dateCreated = new Date();

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "name='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
