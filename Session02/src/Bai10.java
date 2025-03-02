import java.math.BigInteger;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất:");
        BigInteger num1 = new BigInteger(scanner.nextLine());

        System.out.println("Nhập số thứ hai:");
        BigInteger num2 = new BigInteger(scanner.nextLine());

        System.out.println("\nKết quả :");
        System.out.println("Tổng: " + num1.add(num2));
        System.out.println("Hiệu: " + num1.subtract(num2));
        System.out.println("Tích: " + num1.multiply(num2));
        System.out.println("Thương: " + (num2.equals(BigInteger.ZERO) ? "Không thể chia cho 0" : num1.divide(num2)));
        System.out.println("Số dư: " + (num2.equals(BigInteger.ZERO) ? "Không thể chia cho 0" : num1.mod(num2)));

        System.out.println("\nNhập số mũ nguyên cho số thứ nhất:");
        int exponent = scanner.nextInt();
        System.out.println("Lũy thừa: " + num1.pow(exponent));
    }
}
