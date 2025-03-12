import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chiều dài: ");
        double w = Double.parseDouble(sc.nextLine());
        System.out.print("Chiều rộng: ");
        double h = Double.parseDouble(sc.nextLine());

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(w, h);

        System.out.print("Hình chữ nhật 1: ");
        rectangle1.display();
        System.out.print("Hình chữ nhật 2: ");
        rectangle2.display();
    }
}