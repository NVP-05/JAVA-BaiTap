package Bai6;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        System.out.println("Điểm ban đầu: " + p1);
        MoveablePoint mp1 = new MoveablePoint(5, 5, 2, 3);
        System.out.println("Điểm di chuyển ban đầu: " + mp1);
        mp1.move();
        System.out.println("Sau khi di chuyển: " + mp1);
        mp1.setXSpeed(1);
        mp1.setYSpeed(-2);
        mp1.move();
        System.out.println("Sau khi thay đổi tốc độ và di chuyển: " + mp1);
    }
}

