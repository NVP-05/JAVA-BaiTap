import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Tử số phân số 1: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.printf("Mẫu số phân số 1: ");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println();

        Fraction f1 = new Fraction(n, m);

        System.out.printf("Tử số phân số 2: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.printf("Mẫu số phân số 2: ");
        m = Integer.parseInt(sc.nextLine());
        System.out.println();

        Fraction f2 = new Fraction(n, m);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println();

        System.out.println("Tổng 2 phân số: " + f1.add(f2).toString());
        System.out.println("Hiệu 2 phân số: " + f1.sub(f2).toString());
        System.out.println("Tích 2 phân số: " + f1.mul(f2).toString());
        System.out.println("Hiệu 2 phân số: " + f1.div(f2).toString());
    }
}