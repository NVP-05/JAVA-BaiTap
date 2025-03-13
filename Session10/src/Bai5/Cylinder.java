package Bai5;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Chiều cao không hợp lệ! Phải lớn hơn 0.");
        }
    }
    public double getVolume() {
        return getArea() * height;
    }
    public void displayCylinderInfo() {
        System.out.println("Hình trụ - Bán kính: " + getRadius() + ", Chiều cao: " + height + ", Thể tích: " + getVolume());
    }
}

