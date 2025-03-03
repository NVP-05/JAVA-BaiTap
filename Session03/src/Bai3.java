import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float avgScore = Float.parseFloat(sc.nextLine());
        if(avgScore > 10 || avgScore < 0){
            System.out.println("Giá trị không hợp lệ");
        } else if (avgScore >= 8.5) {
            System.out.println("Giỏi");
        } else if (avgScore >= 6.5) {
            System.out.println("Khá");
        } else if (avgScore >= 5) {
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }
    }
}