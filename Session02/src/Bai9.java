import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ngày tháng năm ban đầu:");
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        LocalDate nextDay = date.plusDays(1);
        System.out.println("Ngày tiếp theo: " + nextDay);

        System.out.println("\nNhập ngày tháng năm thứ hai để tính số ngày giữa hai ngày:");
        System.out.print("Nhập năm: ");
        int year2 = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int month2 = scanner.nextInt();
        System.out.print("Nhập ngày: ");
        int day2 = scanner.nextInt();
        LocalDate date2 = LocalDate.of(year2, month2, day2);
        long daysBetween = ChronoUnit.DAYS.between(date, date2);
        System.out.println("Số ngày giữa hai ngày: " + Math.abs(daysBetween));
    }
}
