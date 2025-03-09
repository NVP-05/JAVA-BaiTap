import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();
        if (password.length() < 8) {
            System.out.println("Mật khẩu phải có ít nhất 8 ký tự.");
            return;
        }
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Mật khẩu phải chứa ít nhất một chữ cái viết hoa.");
            return;
        }
        if (!password.matches(".*[a-z].*")) {
            System.out.println("Mật khẩu phải chứa ít nhất một chữ cái viết thường.");
            return;
        }
        if (!password.matches(".*\\d.*")) {
            System.out.println("Mật khẩu phải chứa ít nhất một chữ số.");
            return;
        }
        if (!password.matches(".*[@#$!%].*")) {
            System.out.println("Mật khẩu phải chứa ít nhất một ký tự đặc biệt (@, #, $, !, %).");
            return;
        }
        System.out.println("Mật khẩu hợp lệ.");
    }
}