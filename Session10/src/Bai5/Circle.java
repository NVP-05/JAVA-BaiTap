package Bai5;

public class Circle {
    private double radius;
    public Circle(double radius) {
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Bán kính không hợp lệ! Phải lớn hơn 0.");
        }
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public void displayCircleInfo() {
        System.out.println("Hình tròn - Bán kính: " + radius + ", Diện tích: " + getArea());
    }
}

