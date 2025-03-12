import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bán kính: ");
        double radius = Double.parseDouble(sc.nextLine());

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(radius);

        System.out.print("Hình tròn 1: ");
        circle1.display();
        System.out.print("Hình tròn 2: ");
        circle2.display();
    }
}