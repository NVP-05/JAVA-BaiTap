import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giờ ban đầu");
        int startHour = sc.nextInt();
        System.out.println("Nhập phút ban đầu");
        int startMinute = sc.nextInt();
        System.out.println("Nhập giây ban đầu:");
        int startSecond = sc.nextInt();

        System.out.println("Nhập số giờ cần cộng:");
        int addHour = sc.nextInt();
        System.out.println("Nhập số phút cần cộng:");
        int addMinute = sc.nextInt();
        System.out.println("Nhập số giây cần cộng:");
        int addSecond = sc.nextInt();

        int startTotalSeconds = startHour * 3600 + startMinute * 60 + startSecond;
        int addTotalSeconds = addHour * 3600 + addMinute * 60 + addSecond;
        int totalSeconds = startTotalSeconds + addTotalSeconds;

        int finalHour = totalSeconds / 3600;
        int finalMinute = (totalSeconds % 3600) / 60;
        int finalSecond = totalSeconds % 60;

        System.out.println("Thời gian sau khi cộng:");
        System.out.printf("%02d:%02d:%02d\n", finalHour, finalMinute, finalSecond);

    }
}
