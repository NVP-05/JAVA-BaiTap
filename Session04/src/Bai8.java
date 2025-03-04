import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();
        scanner.close();
        System.out.println("Các số Armstrong từ 1 đến " + N + ":");
        for (int i = 1; i <= N; i++) {
            int num = i, sum = 0, temp = i, digits = 0;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}