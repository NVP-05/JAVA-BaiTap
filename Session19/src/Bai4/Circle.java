package Bai4;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        System.out.println("S = : " + radius * radius * Math.PI);
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.area();
        Shape.description();
    }
}