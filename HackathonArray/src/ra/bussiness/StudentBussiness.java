package ra.bussiness;

import ra.entity.Student;

import java.util.Scanner;

public class StudentBussiness{

    public static boolean isEmpty(int currentIndex){
        return currentIndex == 0;
    }

    public static void displayStudents(Student[] students, int currentIndex){
        if(currentIndex == 0){
            System.err.println("Mảng rỗng");
            return;
        }
        for(int i = 0; i < currentIndex; i++){
            students[i].displayData();
        }
    }

   public static void addStudent(Scanner input, Student[] students, int currentIndex){
       System.out.print("Nhập số lượng sinh viên: ");
       int amounts = Integer.parseInt(input.nextLine());
       if(currentIndex + amounts >= students.length){
           System.out.println("Vượt quá giới hạn danh sách sinh viên.");
           return;
       }
       for(int i = currentIndex; i < amounts; i++){
           students[i].inputData(input);
       }
   }

   public static void updateStudent(Scanner input, Student[] students, int currentIndex){
        if(isEmpty(currentIndex)){
            System.err.println("Mảng rỗng");
            return;
        }
       System.out.print("Nhập mã sinh viên: ");
       String studentName = input.nextLine();
       int found = -1;
       for(int i = 0; i < currentIndex; i++){
            if(students[i].getStudentName().equals(studentName)){
                found = i;
            }
       }
       if(found == -1){
           System.err.println("Không tìm thấy sinh viên");
           return;
       }
       students[found].updateData(input);
       System.out.println("Sửa sinh viên thành công");
   }

   public static void removeStudent(Scanner input, Student[] students, int currentIndex){
        if(isEmpty(currentIndex)){
            System.err.println("Mảng rỗng");
            return;
        }
        for(int i = 0; i < currentIndex; i++){
            System.out.println("Mã sinh viên: " + students[i].getStudentID() + " | Tên: " + students[i].getStudentName());
        }
        System.out.print("Mời nhập tên sinh viên");
        String studentName = input.nextLine();
        int found = -1;
        for(int i = 0; i < currentIndex; i++){
            if(students[i].getStudentName().equals(students[found].getStudentName())){
                found = i;
            }
        }
        if(found == -1){
            System.err.println("Không tìm thấy sinh viên");
            return;
        }
        for(int i = found; i < currentIndex; i++){
            students[i] = students[i + 1];
        }
        currentIndex--;
        System.out.println("Xoá thành công sinh viên: " + students[found].getStudentName());
   }

    public static void searchStudent(Scanner input, Student[] students, int currentIndex) {
        if (isEmpty(currentIndex)) {
            System.err.println("Mảng rỗng");
            return;
        }

        System.out.println("Chọn tiêu chí tìm kiếm:");
        System.out.println("1. Tìm kiếm theo tên sinh viên");
        System.out.println("2. Tìm kiếm theo lớp học");
        System.out.println("3. Tìm kiếm theo khoảng điểm tích lũy");
        System.out.print("Nhập lựa chọn: ");
        int choice = input.nextInt();
        input.nextLine(); // Clear buffer

        Student[] foundStudents = new Student[currentIndex];
        int foundCount = 0;

        switch (choice) {
            case 1:
                System.out.print("Nhập tên sinh viên: ");
                String studentName = input.nextLine();
                for (int i = 0; i < currentIndex; i++) {
                    if (students[i] != null && students[i].getStudentName().equalsIgnoreCase(studentName)) {
                        foundStudents[foundCount++] = students[i];
                    }
                }
                break;

            case 2:
                System.out.print("Nhập lớp học: ");
                String className = input.nextLine();
                for (int i = 0; i < currentIndex; i++) {
                    if (students[i] != null && students[i].getClassName().equalsIgnoreCase(className)) {
                        foundStudents[foundCount++] = students[i];
                    }
                }
                break;

            case 3:
                System.out.print("Nhập khoảng điểm tích lũy (từ): ");
                float minGpa = input.nextFloat();
                System.out.print("Nhập khoảng điểm tích lũy (đến): ");
                float maxGpa = input.nextFloat();
                for (int i = 0; i < currentIndex; i++) {
                    if (students[i] != null && students[i].getGpa() >= minGpa && students[i].getGpa() <= maxGpa) {
                        foundStudents[foundCount++] = students[i];
                    }
                }
                break;

            default:
                System.err.println("Lựa chọn không hợp lệ!");
                return;
        }

        if (foundCount == 0) {
            System.err.println("Không tìm thấy kết quả phù hợp.");
        } else {
            System.out.println("Danh sách sinh viên tìm thấy:");
            for (int i = 0; i < foundCount; i++) {
                foundStudents[i].displayData();
                System.out.println("-----------------------------------");
            }
        }
    }

}
