package ra.validate;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validateCustomer {
    public static String inputString(Scanner sc, int maxLength) {
        String input;
        do {
            input = sc.nextLine().trim();
            if (input.isEmpty() || input.length() > maxLength) {
                System.out.println("Dữ liệu không hợp lệ! Nhập lại:");
            }
        } while (input.isEmpty() || input.length() > maxLength);
        return input;
    }

    public static String inputDate(Scanner sc) {
        String datePattern = "^\\d{2}/\\d{2}/\\d{4}$";
        String input;
        do {
            input = sc.nextLine().trim();
            if (!Pattern.matches(datePattern, input)) {
                System.out.println("Ngày sinh không đúng định dạng.");
            }
        } while (!Pattern.matches(datePattern, input));
        return input;
    }

    public static String inputPhoneNumber(Scanner sc) {
        String phonePattern = "^(0[3|5|7|8|9])+([0-9]{8})$";
        String input;
        do {
            input = sc.nextLine().trim();
            if (!Pattern.matches(phonePattern, input)) {
                System.out.println("Số điện thoại không hợp lệ.");
            }
        } while (!Pattern.matches(phonePattern, input));
        return input;
    }

    public static String inputEmail(Scanner sc) {
        String emailPattern = "^[a-zA-Z0-9_.]+@gmail\\.com$";
        String input;
        do {
            input = sc.nextLine().trim();
            if (!Pattern.matches(emailPattern, input)) {
                System.out.println("Email không hợp lệ! Nhập lại:");
            }
        } while (!Pattern.matches(emailPattern, input));
        return input;
    }
}