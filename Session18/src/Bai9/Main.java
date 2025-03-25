package Bai9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<Integer, Product> products = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("================MENU================");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Cập nhật số lượng sản phẩm.");
            System.out.println("3. Xóa sản phẩm.");
            System.out.println("4. Tính tổng giá sản phẩm.");
            System.out.println("5. Thoát.");
            System.out.println("Lựa chọn của bạn là: ");
            int choice;
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    totalPrice();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1-5.");
            }
        } while (true);
    }

    public static void addProduct() {
        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Giá sản phẩm: ");
        float price = scanner.nextFloat();
        System.out.println("Số lượng sản phẩm: ");
        int quantity = scanner.nextInt();
        Product product = new Product(id, name, price, quantity);
        products.put(id, product);
    }

    public static void updateQuantity() {
        System.out.println("Nhập ID: ");
        int id = scanner.nextInt();
        if (products.containsKey(id)) {
            System.out.println("Nhập số lượng mới: ");
            int newQuantity = scanner.nextInt();
            products.get(id).setQuantity(newQuantity);
        } else {
            System.out.println("Không có sản phẩm trong kho.");
        }
    }

    public static void deleteProduct() {
        System.out.println("Nhập ID sản phẩm cần xóa: ");
        int id = scanner.nextInt();
        if (products.containsKey(id)) {
            products.remove(id);
        } else {
            System.out.println("Sản phẩm không có trong kho.");
        }
    }

    public static void totalPrice() {
        float total = 0;
        for (Product product : products.values()) {
            total += product.getPrice() * product.getQuantity();
        }
        System.out.println("Tổng giá trị các sản phẩm là: " + total);
    }
}