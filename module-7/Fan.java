/**
 * Name: Jasmine Fontus
 * Course: CSD-402
 * Module: 6/7
 * Fan Class
 */
public class Fan {

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Default constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Parameter constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters (using this)
    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    // Setters (using this)
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString (NOT used in UseFans, but OK to keep)
    @Override
    public String toString() {
        if (this.on) {
            return "Fan is ON - Speed: " + this.speed +
                   ", Color: " + this.color +
                   ", Radius: " + this.radius;
        } else {
            return "Fan is OFF - Color: " + this.color +
                   ", Radius: " + this.radius;
        }
    }
}