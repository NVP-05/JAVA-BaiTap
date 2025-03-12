import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x cho vector1: ");
        double x = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập y cho vector1: ");

        double y = Double.parseDouble(sc.nextLine());
        Vector2D v1 = new Vector2D(x, y);

        System.out.print("Nhập x cho vector2: ");
        x = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập y cho vector2: ");
        y = Double.parseDouble(sc.nextLine());
        Vector2D v2 = new Vector2D(x, y);

        System.out.print("Vector 1: ");
        v1.displayVector();
        System.out.print("Vector 2: ");
        v2.displayVector();

        System.out.println("Kích cỡ v1: " + v1.caculateMagnitude());
        System.out.println("Kích cỡ v2: " + v2.caculateMagnitude());

        Vector2D sum = v1.add(v2);
        System.out.println("Sum (v1, v2): " + sum.caculateMagnitude());

        Vector2D diff = v1.sub(v2);
        System.out.println("Diff (v1, v2): " + diff.caculateMagnitude());

        Vector2D dot = v1.dotProduct(v2);
        System.out.println("Dot (v1, v2): " + dot.caculateMagnitude());
    }
}