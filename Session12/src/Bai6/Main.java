package Bai6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tiền thưởng: ");
        double bonus = Double.parseDouble(input.nextLine());
        System.out.print("Số giờ: ");
        int hour = Integer.parseInt(input.nextLine());
        Employee[] employees = new Employee[]{
                new Employee("Nguyễn Phúc", 20, 10000),
                new PartTimeEmployee("Văn Minh", 22, 2000, hour),
                new FullTimeEmployee("Đức Lương", 19, 7000, bonus),
                new Intern("Trung Hiếu", 20, 15000)
        };
        for (Employee e : employees) {
            e.showInfo();
            System.out.println("Lương thực nhận: " + e.calculateSalary());
        }
        input.close();
    }
}
