package ra.bussiness;
import ra.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerBusiness {
    private static List<Customer> customerList = new ArrayList<>();
    public static void addCustomer(Scanner sc) {
        System.out.println("Nhập số lượng khách hàng cần thêm:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin khách hàng " + (i + 1));
            Customer customer = new Customer();
            customer.inputData(sc);
            customerList.add(customer);
            System.out.println("Thêm khách hàng thành công!");
        }
    }
    public static void displayAllCustomers() {
        if (customerList.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            for (Customer customer : customerList) {
                customer.displayData();
            }
        }
    }
}