import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập chuỗi: ");
        String str = sc.nextLine();
        System.out.print("Mời nhập từ tìm kiếm: ");
        String word = sc.nextLine();
        int index = str.indexOf(word);
        if (index != -1) {
            System.out.println("Từ '" + word + "' xuất hiện tại vị trí: " + index);
        } else {
            System.out.println("Từ '" + word + "' không xuất hiện trong chuỗi.");
        }
    }
}