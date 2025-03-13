package Bai10;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Hình tròn.", 12),
                new Rectangle("Hình chữ nhật.", 6, 9),
                new Triangle("Hình tam giác", 7, 8, 9)
        };
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
