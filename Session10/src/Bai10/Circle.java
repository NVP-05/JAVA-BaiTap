package Bai10;

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        if (radius <= 0) {
            throw new IllegalArgumentException("Bán kính không hợp lệ!");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bán kính: " + radius;
    }
}
