import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("x1 là: ");
        double x = Double.parseDouble(sc.nextLine());
        System.out.printf("y1 là: ");
        double y = Double.parseDouble(sc.nextLine());
        Point2D p1 = new Point2D(x, y);

        System.out.printf("x2 là: ");
        x = Double.parseDouble(sc.nextLine());
        System.out.printf("y2 là: ");
        y = Double.parseDouble(sc.nextLine());
        Point2D p2 = new Point2D(x, y);

        System.out.printf("Điểm 1: ");
        p1.displayPoint();
        System.out.printf("Điểm 2: ");
        p1.displayPoint();

        double distance = p1.distanceTo(p2);
        System.out.println("Điểm 1 cách điểm 2: " + distance);

        System.out.printf("Mời nhập lại x: ");
        x = Double.parseDouble(sc.nextLine());
        p2.setX(x);

        System.out.printf("Mời nhập lại y: ");
        y = Double.parseDouble(sc.nextLine());
        p2.setY(y);

        System.out.printf("Sau khi cập nhật điểm 2: ");
        p2.displayPoint();
    }
}