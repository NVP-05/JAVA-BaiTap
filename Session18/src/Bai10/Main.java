package Bai10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<Integer, Employee> emp = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("=============MENU============");
            System.out.println("1. Thêm nhân viên.");
            System.out.println("2. Hiển thị nhân viên.");
            System.out.println("3. Tính tổng lương của tất cả nhân viên.");
            System.out.println("4. Tính lương trung bình.");
            System.out.println("5. Tìm nhân viên có lương cao nhất.");
            System.out.println("6. Tìm nhân viên có lương thấp nhất.");
            System.out.println("7. Thoát");
            System.out.println("Lựa chọn của bạn là: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    totalSalary();
                    break;
                case 4:
                    sumAvg();
                    break;
                case 5:
                    highestSalary();
                    break;
                case 6:
                    lowestSalary();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1-7");
            }
        } while (true);
    }

    public static void addEmployee() {
        System.out.println("ID :");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tên : ");
        String name = scanner.nextLine();
        System.out.println("Lương : ");
        float salary = scanner.nextFloat();
        scanner.nextLine();
        emp.put(id, new Employee(id, name, salary));
    }

    public static void displayEmployees() {
        for (Employee e : emp.values()) {
            System.out.println("ID : " + e.getId() + ", Tên : " + e.getName() + ", Lương : " + e.getSalary());
        }
    }


    public static void totalSalary() {
        float totalSalary = 0;
        for (Employee e : emp.values()) {
            totalSalary += e.getSalary();
        }
        System.out.println("Tổng lương : " + totalSalary);
    }

    public static void sumAvg() {
        float sumSalary = 0;
        int count = 0;
        for (Employee e : emp.values()) {
            sumSalary += e.getSalary();
            count++;
        }
        if (count == 0) {
            System.out.println("Không có nhân vin nào trong danh sách.");
            return;
        }
        ;
        float avgSalary = sumSalary / count;
        System.out.println("Lương trung bình : " + avgSalary);
    }

    public static void highestSalary() {
        Employee highest = emp.values().iterator().next();
        for (Employee e : emp.values()) {
            if (e.getSalary() > highest.getSalary()) {
                highest = e;
            }
        }
        System.out.println("Nhân viên có lương cao nhất: " + highest.getId() + ", Tên : " + highest.getName() + ", Lương : " + highest.getSalary());
    }

    public static void lowestSalary() {
        Employee lowest = emp.values().iterator().next();
        for (Employee e : emp.values()) {
            if (e.getSalary() < lowest.getSalary()) {
                lowest = e;
            }
        }
        System.out.println("Nhân viên có lương thấp nhất: " + lowest.getId() + ", Tên : " + lowest.getName() + ", Lương : " + lowest.getSalary());
    }


}