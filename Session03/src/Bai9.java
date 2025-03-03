import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số hợp lệ (100-999): ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int units = number % 10;

            StringBuilder words = new StringBuilder();

            switch (hundreds) {
                case 1: words.append("một"); break;
                case 2: words.append("hai"); break;
                case 3: words.append("ba"); break;
                case 4: words.append("bốn"); break;
                case 5: words.append("năm"); break;
                case 6: words.append("sáu"); break;
                case 7: words.append("bảy"); break;
                case 8: words.append("tám"); break;
                case 9: words.append("chín"); break;
            }
            words.append(" trăm ");

            if (tens == 0 && units != 0) {
                words.append("lẻ ");
            } else if (tens == 1) {
                words.append("mười ");
            } else {
                switch (tens) {
                    case 2: words.append("hai mươi "); break;
                    case 3: words.append("ba mươi "); break;
                    case 4: words.append("bốn mươi "); break;
                    case 5: words.append("năm mươi "); break;
                    case 6: words.append("sáu mươi "); break;
                    case 7: words.append("bảy mươi "); break;
                    case 8: words.append("tám mươi "); break;
                    case 9: words.append("chín mươi "); break;
                }
            }
            if (units != 0) {
                if (units == 5 && tens > 0) {
                    words.append("lăm");
                } else {
                    switch (units) {
                        case 1: words.append("một"); break;
                        case 2: words.append("hai"); break;
                        case 3: words.append("ba"); break;
                        case 4: words.append("bốn"); break;
                        case 5: words.append("năm"); break;
                        case 6: words.append("sáu"); break;
                        case 7: words.append("bảy"); break;
                        case 8: words.append("tám"); break;
                        case 9: words.append("chín"); break;
                    }
                }
            }
            System.out.println(words.toString().trim());
        }
    }
}