import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng điện thoại: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] phone = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Số điện thoại thứ " + (i + 1) + ": ");
            phone[i] = sc.nextLine();
        }

        System.out.println("\nKết quả sau khi chuẩn hóa:");
        for (String p : phone) {
            String cleanedNumber = p.replaceAll("[\\s.-]", "");

            if (cleanedNumber.matches("^0\\d{9}$")) {
                cleanedNumber = "+84" + cleanedNumber.substring(1);
            }

            if (cleanedNumber.matches("^\\+84\\d{9}$")) {
                cleanedNumber = cleanedNumber.substring(0, 3) + " " +
                        cleanedNumber.substring(3, 6) + " " +
                        cleanedNumber.substring(6, 9) + " " +
                        cleanedNumber.substring(9);
                System.out.println(cleanedNumber);
            } else {
                System.out.println("Số điện thoại không hợp lệ");
            }
        }
    }
}