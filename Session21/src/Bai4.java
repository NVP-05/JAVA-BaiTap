import java.util.Scanner;
import java.util.InputMismatchException;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập vào một số nguyên: ");
            int number = scanner.nextInt();
            System.out.println("Bạn đã nhập: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Số vừa nhập không phải số nguyên.");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
        }
    }
}
