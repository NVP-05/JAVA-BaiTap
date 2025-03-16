package Bai5;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Square square = new Square(3.0);
        circle.setColor("Red");
        rectangle.setColor("Blue");
        square.setColor("Green");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}

