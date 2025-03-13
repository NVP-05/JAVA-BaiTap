package Bai10;

class Triangle extends Shape {
    private double a, b, c;
    public Triangle(String name, double a, double b, double c) {
        super(name);
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalArgumentException("Đây không phải hình tam giác.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cạnh: " + a + ", " + b + ", " + c;
    }
}
