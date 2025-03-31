package Bai10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "students.dat";
        do {
            System.out.println("----------------MENU---------------");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Lưu danh sách vào file");
            System.out.println("3. Đọc danh sách từ file");
            System.out.println("4. Tìm sinh viên có GPA cao nhất");
            System.out.println("5. Tìm danh sách sinh viên theo chuyên ngành");
            System.out.println("6. Tính điểm trung bình GPA của toàn bộ danh sách");
            System.out.println("7. Thoát");
            System.out.printf("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    StudentManager.addStudent(new Student(1, "Văn Minh", "IT", 9.2));
                    StudentManager.addStudent(new Student(2, "Đức Lương", "Marketing", 7.2));
                    StudentManager.addStudent(new Student(3, "Quân", "QTKD", 7.5));
                    StudentManager.addStudent(new Student(4, "Văn Phúc", "IT", 8.2));
                    StudentManager.addStudent(new Student(5, "Hiệp", "Marketing", 9.3));
                    System.out.println("Thêm thành công!");
                    break;
                case 2:
                    StudentManager.saveToFile(fileName);
                    break;
                case 3:
                    StudentManager.readFromFile(fileName);
                    break;
                case 4:
                    Student student = StudentManager.findTopStudent();
                    student.displayData();
                    break;
                case 5:
                    List<Student> studentMajors = StudentManager.searchByMajor("Marketing");
                    studentMajors.forEach(student1 -> {
                        student1.displayData();
                        System.out.println("-----------------------");
                    });
                    break;
                case 6:
                    double avgGpa = StudentManager.calculateAverageGpa();
                    System.out.printf("Điểm trung của tất cả sinh viên là: %.2f\n", avgGpa);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn lại từ 1 - 7");
            }
        } while (true);
    }
}