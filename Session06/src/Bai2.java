import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập chuỗi: ");
        String s = sc.nextLine();
        if(s.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\\\.[a-zA-Z]{2,6}$")){
            System.out.println("Email hợp lệ");
        }else {
            System.out.println("Email không hợp lệ");
        }
    }
}