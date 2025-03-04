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

            readDigit(hundreds);
            System.out.print(" trăm ");

            if (tens == 0 && units != 0) {
                System.out.print("lẻ ");
                readDigit(units);
            } else if (tens == 1) {
                System.out.print("mười ");
                if (units != 0) {
                    readDigit(units);
                }
            } else {
                if (tens > 1) {
                    readDigit(tens);
                    System.out.print(" mươi ");
                }
                if (units != 0) {
                    if (units == 5 && tens > 0) {
                        System.out.print("lăm");
                    } else {
                        readDigit(units);
                    }
                }
            }
        }
    }

    static void readDigit(int digit) {
        switch (digit) {
            case 1: System.out.print("một"); break;
            case 2: System.out.print("hai"); break;
            case 3: System.out.print("ba"); break;
            case 4: System.out.print("bốn"); break;
            case 5: System.out.print("năm"); break;
            case 6: System.out.print("sáu"); break;
            case 7: System.out.print("bảy"); break;
            case 8: System.out.print("tám"); break;
            case 9: System.out.print("chín"); break;
        }
    }
}
