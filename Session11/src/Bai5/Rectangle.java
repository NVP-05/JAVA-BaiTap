package Bai5;

public class Rectangle implements Colorable {
    private double length;
    private double width;
    private String color;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.color = "undefined";
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Rectangle length = " + length + ", width = " + width + ", color = " + color;
    }
}

