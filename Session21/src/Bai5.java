import java.util.Scanner;
import java.util.InputMismatchException;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập vào một số nguyên: ");
            int number = scanner.nextInt();
            if (number <= 0) {
                throw new Exception("Số nhập không phải số nguyên tố.");
            }
            if (isPrime(number)) {
                System.out.println("Số " + number + " là số nguyên tố.");
            } else {
                System.out.println("Số " + number + " không là số nguyên tố.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Bạn phải nhập số nguyên.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Kết thúc chương trình.");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
