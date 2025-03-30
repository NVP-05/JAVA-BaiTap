import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào danh sách các chuỗi (các chuỗi cách nhau bởi dấu phẩy):");
        String input = scanner.nextLine();
        String[] arr = input.split(",");
        List<Integer> validNumbers = new ArrayList<>();
        int invalidCount = 0;
        for (String s : arr) {
            s = s.trim();
            try {
                int number = Integer.parseInt(s);
                validNumbers.add(number);
            } catch (NumberFormatException e) {
                invalidCount++;
            } finally {
                System.out.println("Kết thúc chương trình.");
            }
        }
        System.out.println("Số lượng chuỗi hợp lệ: " + validNumbers.size());
        System.out.println("Số lượng chuỗi không hợp lệ: " + invalidCount);
        System.out.println("Danh sách các số nguyên hợp lệ: " + validNumbers);
    }
}

