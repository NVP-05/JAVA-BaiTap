import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập số nguyên thứ 1: ");
            int firstNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số nguyên thứ 2: ");
            int secondNumber = Integer.parseInt(scanner.nextLine());
            int divNumber = firstNumber / secondNumber;
            System.out.println("Kết quả: " + divNumber);
        } catch (ArithmeticException e1) {
            System.out.println("Không thể chia cho 0.");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Kết thúc chương trình.");
        }
    }
}
