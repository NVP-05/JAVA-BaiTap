import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Các số Happy từ 1 đến " + n + ":");
        for (int i = 1; i <= n; i++) {
            int num = i;
            int slow = num, fast = num;
            do {
                int sumSlow = 0, sumFast = 0, tempFast = fast;
                while (slow > 0) {
                    sumSlow += (slow % 10) * (slow % 10);
                    slow /= 10;
                }
                slow = sumSlow;
                for (int j = 0; j < 2; j++) {
                    sumFast = 0;
                    while (tempFast > 0) {
                        sumFast += (tempFast % 10) * (tempFast % 10);
                        tempFast /= 10;
                    }
                    tempFast = sumFast;
                }
                fast = sumFast;
            } while (slow != fast && fast != 1);
            if (fast == 1) {
                System.out.print(i + " ");
            }
        }
    }
}