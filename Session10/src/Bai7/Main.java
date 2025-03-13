package Bai7;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Nguyễn Phúc", "SV001", 3.9),
                new GraduateStudent("Quang Linh", "SV002", 3.2, "Phát triển phần mềm dịch vụ", "TS. An"),
                new Student("Văn Minh", "SV003", 2.9),
                new GraduateStudent("Xuân Nhất", "SV004", 3.7, "Toán cao cấp", "PGS. Binh")
        };

        for (Student student : students) {
            System.out.println(student.getDetails());
        }
    }
}

