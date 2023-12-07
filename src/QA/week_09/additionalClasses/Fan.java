package QA.week_09.additionalClasses;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int MAXIMUM = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(String speed) {
        switch (speed) {
            case "SLOW" -> this.speed = SLOW;
            case "MEDIUM" -> this.speed = MEDIUM;
            case "MAXIMUM" -> this.speed = MAXIMUM;
        }
    }
    public boolean getOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return (on)?"Fan speed : " + speed + "," +
                " color: " + color + "," +
                " radius: " + radius:
                "Fan color: "+ color + "," +
                "radius: "+ radius + "\nFan is off";
    }
}
