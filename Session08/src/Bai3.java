import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email, password;

        while (true) {
            System.out.print("Nhập email: ");
            email = scanner.nextLine();

            if (email.contains("@")) {
                int atIndex = email.indexOf("@");
                if (email.lastIndexOf("@") == atIndex) {
                    String localPart = email.substring(0, atIndex);
                    String domainPart = email.substring(atIndex + 1);

                    if (!localPart.isEmpty() && localPart.matches("[a-zA-Z0-9._-]+")) {
                        if (domainPart.contains(".")) {
                            String domainExtension = domainPart.substring(domainPart.lastIndexOf(".") + 1);
                            if (domainExtension.equals("com") || domainExtension.equals("vn") || domainExtension.equals("org")) {
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println("Email không hợp lệ, vui lòng nhập lại!");
        }

        while (true) {
            System.out.print("Nhập mật khẩu: ");
            password = scanner.nextLine();

            boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
            String specialChars = "@#$%!&*";

            if (password.length() >= 8) {
                for (char c : password.toCharArray()) {
                    if (Character.isUpperCase(c)) hasUpper = true;
                    else if (Character.isLowerCase(c)) hasLower = true;
                    else if (Character.isDigit(c)) hasDigit = true;
                    else if (specialChars.indexOf(c) != -1) hasSpecial = true;
                }

                if (hasUpper && hasLower && hasDigit && hasSpecial) {
                    break;
                }
            }
            System.out.println("Mật khẩu không hợp lệ, vui lòng nhập lại!");
        }

        System.out.println("Email và mật khẩu hợp lệ!");
        scanner.close();
    }
}