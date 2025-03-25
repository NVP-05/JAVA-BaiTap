import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Map<Integer, String> num = new HashMap<>();
        num.put(1,"I");
        num.put(2,"II");
        num.put(3,"III");
        num.put(4,"IV");
        num.put(5,"V");
        num.put(6,"VI");
        num.put(7,"VII");
        num.put(8,"VIII");
        num.put(9,"IX");
        num.put(10,"X");
        System.out.println("Nhập số nguyên dương: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 1 && n <= 10) {
            System.out.println(num.get(n));
        }else {
            System.out.println("Vui lòng nhập từ 1-10.");
        }
    }
}