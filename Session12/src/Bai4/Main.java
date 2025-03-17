package Bai4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Overriding - S tròn = " + circle.area());
        System.out.println("Overriding - S chữ nhật = " + rectangle.area());
        Shape shape = new Shape();
        System.out.println("Overloading - S tròn = " + shape.area(5.0));
        System.out.println("Overloading - S chữ nhật = " + shape.area(4.0, 6.0));
    }
}
