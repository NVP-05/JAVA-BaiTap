import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập đoạn văn bản: ");
        String input = sc.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Không có văn bản để xử lý.");
        } else {
            String cleanedText = input.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
            cleanedText = cleanedText.trim().replaceAll("\\s+", " ");

            String numbers = "";
            for (String word : cleanedText.split(" ")) {
                if (word.matches("\\d+")) {
                    numbers += word + " ";
                }
            }

            System.out.println("Văn bản đã chuẩn hóa: " + cleanedText);
            System.out.println("Các số trích xuất: " + (numbers.isEmpty() ? "Không có số nào" : numbers.trim()));
        }
    }
}