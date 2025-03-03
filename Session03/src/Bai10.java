import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        System.out.print("Nhập hệ số d: ");
        double d = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println(d == 0 ? "Phương trình có vô số nghiệm" : "Phương trình vô nghiệm");
                } else {
                    System.out.println("Nghiệm của phương trình là: " + (-d / c));
                }
            } else {
                double delta = c * c - 4 * b * d;
                if (delta > 0) {
                    double x1 = (-c + Math.sqrt(delta)) / (2 * b);
                    double x2 = (-c - Math.sqrt(delta)) / (2 * b);
                    System.out.println("Nghiệm của phương trình: x1 = " + x1 + ", x2 = " + x2);
                } else if (delta == 0) {
                    System.out.println("Phương trình có nghiệm kép: x = " + (-c / (2 * b)));
                } else {
                    System.out.println("Phương trình vô nghiệm thực");
                }
            }
        } else {
            double delta0 = b * b - 3 * a * c;
            double delta1 = 2 * b * b * b - 9 * a * b * c + 27 * a * a * d;
            double discriminant = delta1 * delta1 - 4 * delta0 * delta0 * delta0;

            if (discriminant > 0) {
                System.out.println("Phương trình có một nghiệm thực và hai nghiệm phức.");
            } else if (discriminant == 0) {
                double root = -b / (3 * a);
                System.out.println("Phương trình có nghiệm bội: x = " + root);
            } else {
                System.out.println("Phương trình có ba nghiệm thực khác nhau.");
            }
        }
    }
}