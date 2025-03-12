import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số lượng sinh viên: ");
        Student[] students = new Student[100];
        int choice;
        int currentIndex = 0;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả danh sách sinh viên.");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên.");
            System.out.println("4. Xóa sinh viên.");
            System.out.println("5. Thoát");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for(int i = 0; i < currentIndex; i++){
                        System.out.printf("Sinh viên thứ %d\n");
                        students[i].displayData();
                    }
                    break;
                case 2:
                    Student student = new Student();
                    student.inputData(sc);
                    students[currentIndex] = student;
                    break;
                case 3:
                    int id = Integer.parseInt(sc.nextLine());
                    for(int i = 0; i < currentIndex; i++){
                        if(students[i].getId() == id){
                            students[i].inputData(sc);
                        }
                    }
                    break;
                case 4:
                    int index = Integer.parseInt(sc.nextLine());
                    if(index < 0 || index >= currentIndex){
                        System.out.println("Giá trị không hợp lệ");
                        break;
                    }
                    for(int i = 0; i < currentIndex; i++){
                        if(i == index){
                            students[i] = students[i + 1];
                        }
                    }
                    break;
                default:
                    System.out.println("Vui lòng nhập từ 1 đến 5");
            }
        }while(choice != 5);
    }
}