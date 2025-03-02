import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên");
        String str = sc.nextLine();
        System.out.println("Nhập điểm môn học 1:");
        float sub1 = sc.nextFloat();
        System.out.println("Nhập điểm môn học 2:");
        float sub2 = sc.nextFloat();
        System.out.println("Nhập điểm môn học 3");
        float sub3 = sc.nextFloat();

        System.out.println("Tên sinh viên: " + str);
        System.out.println("Điểm môn 1: " + sub1 + " | Điểm môn 2: " + sub2 + " | Điểm môn 3: " + sub3);
        float avg = (sub1 + sub2 + sub3) / 3;
        System.out.println("Diểm trung bình: " + avg);
        System.out.println(avg < 5? "Học lại" : "Lên lớp");
    }
}
