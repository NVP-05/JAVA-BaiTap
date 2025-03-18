package cleaned;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    private List<Categories> categories;
    private List<Product> products;
    private Scanner scanner;

    public ShopManagement(Scanner scanner) {
        this.scanner = scanner;
        this.categories = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public void start() {
        while (true) {
            displayMainMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> manageCategories();
                case 2 -> manageProducts();
                case 3 -> {
                    System.out.println("Thoát chương trình. Cảm ơn bạn đã sử dụng!");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ, hãy nhập lại!");
            }
        }
    }

    private void displayMainMenu() {
        System.out.println("\n********** QUẢN LÝ CỬA HÀNG **********");
        System.out.println("1. Quản lý danh mục");
        System.out.println("2. Quản lý sản phẩm");
        System.out.println("3. Thoát");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    private void manageCategories() {
        while (true) {
            System.out.println("\n*** QUẢN LÝ DANH MỤC ***");
            System.out.println("1. Hiển thị danh mục");
            System.out.println("2. Thêm danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Tìm kiếm danh mục");
            System.out.println("6. Quay lại");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> listCategories();
                case 2 -> addCategory();
                case 3 -> updateCategory();
                case 4 -> deleteCategory();
                case 5 -> searchCategory();
                case 6 -> {
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private void manageProducts() {
        while (true) {
            System.out.println("\n*** QUẢN LÝ SẢN PHẨM ***");
            System.out.println("1. Hiển thị sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Quay lại");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> listProducts();
                case 2 -> addProduct();
                case 3 -> updateProduct();
                case 4 -> deleteProduct();
                case 5 -> searchProduct();
                case 6 -> {
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    // Quản lý danh mục
    private void listCategories() {
        if (categories.isEmpty()) {
            System.out.println("Chưa có danh mục nào.");
        } else {
            System.out.println("Danh sách danh mục:");
            categories.forEach(Categories::displayData);
        }
    }

    private void addCategory() {
        Categories category = new Categories();
        category.inputData(scanner);
        categories.add(category);
        System.out.println("Thêm danh mục thành công!");
    }

    private void updateCategory() {
        System.out.print("Nhập mã danh mục cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Categories category : categories) {
            if (category.getCategoryId() == id) {
                category.inputData(scanner);
                System.out.println("Cập nhật danh mục thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy danh mục cần cập nhật.");
    }

    private void deleteCategory() {
        System.out.print("Nhập mã danh mục cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        categories.removeIf(category -> category.getCategoryId() == id);
        System.out.println("Xóa danh mục thành công!");
    }

    private void searchCategory() {
        System.out.print("Nhập tên danh mục cần tìm: ");
        String name = scanner.nextLine();
        categories.stream()
                .filter(category -> category.getCategoryName().contains(name))
                .forEach(Categories::displayData);
    }

    // Quản lý sản phẩm
    private void listProducts() {
        if (products.isEmpty()) {
            System.out.println("Chưa có sản phẩm nào.");
        } else {
            System.out.println("Danh sách sản phẩm:");
            products.forEach(Product::displayData);
        }
    }

    private void addProduct() {
        Product product = new Product();
        product.inputData(scanner);
        products.add(product);
        System.out.println("Thêm sản phẩm thành công!");
    }

    private void updateProduct() {
        System.out.print("Nhập mã sản phẩm cần cập nhật: ");
        String id = scanner.nextLine();
        for (Product product : products) {
            if (product.getProductId().equals(id)) {
                product.inputData(scanner);
                System.out.println("Cập nhật sản phẩm thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm cần cập nhật.");
    }

    private void deleteProduct() {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        String id = scanner.nextLine();
        products.removeIf(product -> product.getProductId().equals(id));
        System.out.println("Xóa sản phẩm thành công!");
    }

    private void searchProduct() {
        System.out.print("Nhập tên hoặc tiêu đề sản phẩm cần tìm: ");
        String keyword = scanner.nextLine();
        products.stream()
                .filter(product -> product.getProductName().contains(keyword) || product.getTitle().contains(keyword))
                .forEach(Product::displayData);
    }
}
