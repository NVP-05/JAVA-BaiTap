import java.util.Scanner;
import java.util.InputMismatchException;

public class Bai7 {
    public static void main(String[] args) {
        int balance = 1000000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Số dư hiện tại: " + balance + " đồng.");
        try {
            System.out.print("Nhập số tiền cần rút: ");
            int amount = scanner.nextInt();
            if (amount > balance) {
                throw new Exception("Lỗi: Số tiền rút vượt quá số dư!");
            }
            if (balance - amount < 50000) {
                throw new Exception("Lỗi: Tài khoản phải duy trì số dư tối thiểu 50.000 đồng!");
            }
            balance -= amount;
            System.out.println("Rút tiền thành công. Số dư còn lại: " + balance + " đồng.");

        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Vui lòng nhập một số hợp lệ!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Kết thúc chương trình.");
        }
    }
}

