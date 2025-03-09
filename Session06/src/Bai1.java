import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập chuỗi: ");
        String s = sc.nextLine();
        System.out.println(s.split("\\s").length);
    }
}