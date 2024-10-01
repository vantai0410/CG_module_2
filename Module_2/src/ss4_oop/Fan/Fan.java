package ss4_oop.fan;

public class Fan {
    public static int slow = 1;
    public static int medium = 2;
    public static int fast = 3;
    private int speed;
    private boolean on = false;
    private double radius;
    private String color;

    public static int getSlow() {
        return slow;
    }

    public static void setSlow(int slow) {
        Fan.slow = slow;
    }

    public static int getMedium() {
        return medium;
    }

    public static void setMedium(int medium) {
        Fan.medium = medium;
    }

    public static int getFast() {
        return fast;
    }

    public static void setFast(int fast) {
        Fan.fast = fast;
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

    public Fan() {
        this.speed = slow;
        this.on = false;
        this.radius = 5;
        this.color = "black";
    }

    @Override
    public String toString() {
        if(on){
            return "fan is on speed: " +speed + " radius " + radius + " color " + color;
        } else {
            return "fan is off speed: " +speed + " radius " + radius + " color " + color;
        }
    }
}
