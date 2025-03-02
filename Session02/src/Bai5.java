import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float width = sc.nextFloat();
        float height = sc.nextFloat();
        float area = width * height;
        float circumference = 2 * (width + height);
        System.out.println("Diện tích: " + area);
        System.out.println("Chu vi: " + circumference);
    }
}
