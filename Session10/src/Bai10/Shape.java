package Bai10;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Hình: " + name + ", S = " + calculateArea() + ", P = " + calculatePerimeter();
    }
}

