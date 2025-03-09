import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\s+");

        int count = 0;
        System.out.println("Các từ chứa ký tự đặc biệt:");

        for (String word : words) {
            if (word.matches(".*[^a-zA-Z0-9].*")) {
                System.out.println(word + " ");
                count++;
            }
        }

        System.out.println("Số lượng từ chứa ký tự đặc biệt: " + count);
    }
}