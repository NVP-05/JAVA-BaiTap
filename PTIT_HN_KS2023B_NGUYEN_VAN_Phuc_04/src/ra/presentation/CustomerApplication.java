package ra.presentation;
import ra.bussiness.CustomerBusiness;

import java.util.Scanner;

public class CustomerApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println(" -------------Customer Menu-------------");
            System.out.println("1. Hiển thị danh sách các khách hàng.");
            System.out.println("2. Thêm mới khách hàng.");
            System.out.println("3. Chỉnh sửa thông tin khách hàng.");
            System.out.println("4. Xóa khách hàng.");
            System.out.println("5. Tìm kiếm khách hàng.");
            System.out.println("6. Sắp xếp.");
            System.out.println("0. Thoát chương trình.");
            System.out.println("Lựa chọn của bạn là: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    CustomerBusiness.displayAllCustomers();
                    break;
                case 2:
                    CustomerBusiness.addCustomer(scanner);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    do {
                        System.out.println("1. Tìm kiếm theo tên khách hàng.");
                        System.out.println("2. Tìm kiếm theo loại khách hàng.");
                        System.out.println("3. Tìm kiếm theo số điện thoại.");
                        int choice5 = Integer.parseInt(scanner.nextLine());
                        switch (choice5) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    }while (false);
                case 6:
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 0-6.");            }
        }while(true);

    }
}
