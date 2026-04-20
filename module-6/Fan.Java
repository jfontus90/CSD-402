/**
 * Name: Jasmine Fontus
 * Course: CSD-402
 * Module: 6
 * Assignment: Fan Class Program
 * Description: This program creates a Fan class with properties such as speed,
 * on/off state, radius, and color. It demonstrates constructors, getters,
 * setters, and the toString() method.
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

    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
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

    @Override
    public String toString() {
        if (on) {
            return "Fan is ON - Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is OFF - Color: " + color + ", Radius: " + radius;
        }
    }

    public static void main(String[] args) {

        Fan fan1 = new Fan();

        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("red");

        System.out.println("Fan 1:");
        System.out.println(fan1);

        System.out.println("\nFan 2:");
        System.out.println(fan2);
    }
}