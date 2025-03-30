import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tuổi: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Kết thúc chương trình.");
        }

    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Bạn chưa đủ 18 tuổi!");
        } else {
            System.out.println("Chào mừng bạn!");
        }
    }
}

