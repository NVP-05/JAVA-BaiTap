import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Chủ nhật");
            case 2 -> System.out.println("Thứ 2");
            case 3 -> System.out.println("Thứ 3");
            case 4 -> System.out.println("Thứ 4");
            case 5 -> System.out.println("Thứ 5");
            case 6 -> System.out.println("Thứ 6");
            case 7 -> System.out.println("Thứ 7");
            default -> System.out.println("Vui lòng chọn số từ 1-7");
        }
    }
}