package Bai10;
import java.util.*;

public class StudentManagement{
    private static List<Student> students = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        inputStudents();
        displayStudents();
        searchStudentByName();
        classifyAndDisplayStudents();
    }

    public static void inputStudents() {
        System.out.println("Nhập danh sách sinh viên (ít nhất 5 sinh viên):");
        int n = Integer.parseInt(input.nextLine());
        while(n < 5){
            System.out.println("Không đủ sinh viên. Vui lòng nhập lại: ");
            n = Integer.parseInt(input.nextLine());
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập ID: ");
            String id = input.nextLine();
            System.out.print("Nhập Tên: ");
            String name = input.nextLine();
            System.out.print("Nhập GPA: ");
            double gpa = Double.parseDouble(input.nextLine());
            students.add(new Student(id, name, gpa));
        }
    }

    public static void displayStudents() {
        System.out.println("\nDanh sách sinh viên:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void searchStudentByName() {
        System.out.print("\nNhập tên sinh viên cần tìm: ");
        String searchName = input.nextLine().toLowerCase();
        boolean found = false;
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(searchName)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy sinh viên có tên: " + searchName);
    }

    public static void classifyAndDisplayStudents() {
        System.out.println("\nPhân loại sinh viên theo GPA:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
