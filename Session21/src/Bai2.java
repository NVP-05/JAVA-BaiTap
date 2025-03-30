import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] numbers = {1, 3, 5, 7, 9};
            System.out.println("Nhập vào chỉ số phần tử cần lấy giá trị:");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Giá trị phần tử là: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Kết thúc quá trình xử lý với mảng");
        }
    }
}
