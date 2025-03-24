package ra.bussiness;

import ra.entity.Student;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentSorter {
    public static void sortStudents(Scanner input, Student[] students, int currentIndex) {
        if (currentIndex == 0) {
            System.err.println("Danh sách sinh viên trống!");
            return;
        }

        while (true) {
            System.out.println("Chọn tiêu chí sắp xếp:");
            System.out.println("1. Sắp xếp theo tên tăng dần");
            System.out.println("2. Sắp xếp theo tên giảm dần");
            System.out.println("3. Sắp xếp theo GPA tăng dần");
            System.out.println("4. Sắp xếp theo GPA giảm dần");
            System.out.println("0. Quay lại menu chính");
            System.out.print("Nhập lựa chọn: ");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 0) {
                return;
            }

            Comparator<Student> comparator;

            switch (choice) {
                case 1:
                    comparator = Comparator.comparing(Student::getStudentName);
                    break;
                case 2:
                    comparator = Comparator.comparing(Student::getStudentName).reversed();
                    break;
                case 3:
                    comparator = Comparator.comparingDouble(Student::getGpa);
                    break;
                case 4:
                    comparator = Comparator.comparingDouble(Student::getGpa).reversed();
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ!");
                    continue;
            }

            Arrays.sort(students, 0, currentIndex, comparator);

            System.out.println("Danh sách sinh viên sau khi sắp xếp:");
            for (int i = 0; i < currentIndex; i++) {
                students[i].displayData();
                System.out.println("-----------------------------------");
            }
        }
    }
}
