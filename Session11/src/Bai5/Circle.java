package Bai5;

public class Circle implements Colorable {
    private double radius;
    private String color;
    public Circle(double radius) {
        this.radius = radius;
        this.color = "undefined";
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Circle radius = " + radius + ", color = " + color;
    }
}

