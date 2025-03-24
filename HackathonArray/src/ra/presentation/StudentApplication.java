package ra.presentation;

import ra.bussiness.StudentBussiness;
import ra.bussiness.StudentSorter;
import ra.entity.Student;

import java.util.Scanner;

public class StudentApplication{
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        final Student[] students = new Student[100];
        int currentIndex = 0;
        while(true){
            displayMenu();
            System.out.print("Mời bạn chọn: ");
            int choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1 -> StudentBussiness.displayStudents(students, currentIndex);
                case 2 -> StudentBussiness.addStudent(input, students, currentIndex);
                case 3 -> StudentBussiness.updateStudent(input, students, currentIndex);
                case 4 -> StudentBussiness.removeStudent(input, students, currentIndex);
                case 5 -> StudentBussiness.searchStudent(input, students, currentIndex);
                case 6 -> StudentSorter.sortStudents(input, students, currentIndex);
                case 0 -> System.exit(0);
                default -> System.err.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void displayMenu(){
        System.out.println("---------------------------Student Menu----------------------");
        System.out.println("1. Hiển thị danh sách sinh viên");
        System.out.println("2. Thêm mới sinh viên");
        System.out.println("3. Chỉnh sửa thông tin sinh viên");
        System.out.println("4. Xoá sinh viên");
        System.out.println("5. Tìm kiếm sinh viên");
        System.out.println("6. Sắp xếp");
        System.out.println("0. Thoát chương trình");
    }
}
