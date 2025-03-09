import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập email: ");
        String email = sc.nextLine().trim();

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (email.matches(emailRegex)) {
            String[] parts = email.split("@");
            System.out.println("Tên người dùng: " + parts[0]);
            System.out.println("Tên miền: " + parts[1]);
        } else {
            System.out.println("Email không hợp lệ.");
        }
    }
}