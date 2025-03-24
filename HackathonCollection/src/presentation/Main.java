package presentation;

import bussiness.CustomerManagement;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1 -> CustomerManagement.dislayCustomer();
                case 2 -> CustomerManagement.addCustomer(sc);
                case 3 -> CustomerManagement.updateCustomer(sc);
                case 4 -> CustomerManagement.deleteCustomer(sc);
                case 5 -> CustomerManagement.searchCustomer(sc);
                case 6 -> CustomerManagement.sortCustomer(sc);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    public static void displayMenu(){
        System.out.println("----------------------------Customer Menu----------------------------");
        System.out.println("1. Hiển thị danh sách các khách hàng");
        System.out.println("2. Thêm mới khách hàng");
        System.out.println("3. Chỉnh sửa thông tin khách hàng");
        System.out.println("4. Xóa khách hàng");
        System.out.println("5. Tìm kiếm khách hàng");
        System.out.println("6. Sắp xếp");
        System.out.println("0. Thoát chương trình");
        System.out.println("------------------------------------------------------------------------");
    }
}
