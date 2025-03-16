package Bai5;

public class Square implements Colorable {
    private double side;
    private String color;
    public Square(double side) {
        this.side = side;
        this.color = "undefined";
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    public double getSide() {
        return side;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Square side = " + side + ", color = " + color;
    }
}

