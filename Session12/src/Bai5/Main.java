package Bai5;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Square(3.0);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("S = " + shapes[i].area());
        }
    }
}
