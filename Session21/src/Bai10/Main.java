package Bai10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("P001", "Áo thun", 150000));
        productList.add(new Product("P002", "Quần jean", 350000));
        productList.add(new Product("P003", "Giày thể thao", 750000));

        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("******Hệ thống Giỏ hàng Mua sắm*******");
            System.out.println("1. Xem danh sách sản phẩm có sẵn");
            System.out.println("2. Thêm sản phẩm vào giỏ hàng");
            System.out.println("3. Xóa sản phẩm khỏi giỏ hàng");
            System.out.println("4. Xem giỏ hàng");
            System.out.println("5. Thanh toán");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Danh sách sản phẩm có sẵn:");
                    for (Product p : productList) {
                        System.out.println("Mã: " + p.getId() + ", Tên: " + p.getName() + ", Giá: " + p.getPrice());
                    }
                    break;
                case "2":
                    System.out.print("Nhập mã sản phẩm cần thêm: ");
                    String productId = scanner.nextLine();
                    Product selectedProduct = null;
                    for (Product p : productList) {
                        if (p.getId().equals(productId)) {
                            selectedProduct = p;
                            break;
                        }
                    }
                    if (selectedProduct == null) {
                        System.out.println("Không tìm thấy sản phẩm!");
                        break;
                    }
                    System.out.print("Nhập số lượng: ");
                    try {
                        int quantity = Integer.parseInt(scanner.nextLine());
                        cart.addToCart(selectedProduct, quantity);
                        System.out.println("Thêm sản phẩm thành công!");
                    } catch (NumberFormatException e) {
                        System.out.println("Lỗi: Số lượng không hợp lệ!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    System.out.print("Nhập mã sản phẩm cần xóa: ");
                    String removeId = scanner.nextLine();
                    try {
                        cart.removeFromCart(removeId);
                        System.out.println("Xóa sản phẩm thành công!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "4":
                    cart.displayCart();
                    break;
                case "5":
                    double total = cart.checkout();
                    System.out.println("Tổng tiền cần thanh toán: " + total);
                    break;
                case "6":
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
                    break;
            }
        }
    }
}
