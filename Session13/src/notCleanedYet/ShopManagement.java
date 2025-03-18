package notCleanedYet;
import java.util.Scanner;

public class ShopManagement {
    private static Categories[] categories = new Categories[1000];
    private static Product[] products = new Product[1000];
    private static int catCount = 0;
    private static int prodCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMainMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    manageCategories(scanner);
                    break;
                case 2:
                    manageProducts(scanner);
                    break;
                case 3:
                    System.out.println("Thoát chương trinnh.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, hãy nhập lại.");
            }
        }
    }

    public static void displayMainMenu() {
        System.out.println("*********************SHOP MENU*********************");
        System.out.println("1. Quản lí danh mục.");
        System.out.println("2. Quan lí sản phẩm.");
        System.out.println("3. Thoát.");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    public static void manageCategories(Scanner scanner) {
        while (true) {
            System.out.println("********************CATEGORIE MANAGEMENT*********************");
            System.out.println("1. Danh sách danh mục");
            System.out.println("2. Thêm mới danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Tìm kiếm danh mục theo tên");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    listCategories();
                    break;
                case 2:
                    addCategory(scanner);
                    break;
                case 3:
                    updateCategory(scanner);
                    break;
                case 4:
                    deleteCategory(scanner);
                    break;
                case 5:
                    searchCategoryByName(scanner);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    public static void manageProducts(Scanner scanner) {
        while (true) {
            System.out.println("************************PRODUCT MANAGEMENT*******************");
            System.out.println("1. Danh sách sản phẩm");
            System.out.println("2. Thêm mới sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên hoặc tiêu đề");
            System.out.println("6. Tìm kiếm sản phẩm theo khoảng giá bán");
            System.out.println("7. Sắp xếp sản phẩm theo giá bán tăng dần");
            System.out.println("8. Bán sản phẩm");
            System.out.println("9. Thống kê số lượng sản phẩm theo danh mục");
            System.out.println("10. Thoát");
            System.out.print("Nhập vào lựa chọn của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    listProducts();
                    break;
                case 2:
                    addProduct(scanner);
                    break;
                case 3:
                    updateProduct(scanner);
                    break;
                case 4:
                    deleteProduct(scanner);
                    break;
                case 5:
                    searchProductByNameOrTitle(scanner);
                    break;
                case 6:
                    searchProductByPriceRange(scanner);
                    break;
                case 7:
                    sortProductsByPrice();
                    break;
                case 8:
                    sellProduct(scanner);
                    break;
                case 9:
                    getProductByCategories();
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, hãy nhập lại.");
            }
        }
    }
    public static void listCategories() {
        for (int i = 0; i < catCount; i++) {
            categories[i].displayData();
        }
    }

    public static void addCategory(Scanner scanner) {
        Categories cat = new Categories();
        cat.inputData(scanner);
        categories[catCount++] = cat;
    }

    public static void updateCategory(Scanner scanner) {
        System.out.print("Nhập mã danh mục cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < catCount; i++) {
            if (categories[i].getCategoryId() == id) {
                categories[i].inputData(scanner);
                System.out.println("Cập nhật danh mục thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy danh mục cần cập nhật!");
    }

    public static void deleteCategory(Scanner scanner) {
        System.out.print("Nhập mã danh mục cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < prodCount; i++) {
            if (products[i].getCategoryId() == id) {
                System.out.println("Không thể xóa vì danh mục này đang có sản phẩm!");
                return;
            }
        }
        for (int i = 0; i < catCount; i++) {
            if (categories[i].getCategoryId() == id) {
                for (int j = i; j < catCount - 1; j++) {
                    categories[j] = categories[j + 1];
                }
                catCount--;
                System.out.println("Xóa danh mục thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy danh mục cần xóa!");
    }

    public static void searchCategoryByName(Scanner scanner) {
        System.out.print("Nhập tên danh mục cần tìm: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < catCount; i++) {
            if (categories[i].getCategoryName().contains(name)) {
                categories[i].displayData();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy danh mục nào khớp với từ khóa!");
        }
    }

    public static void listProducts() {
        System.out.println("Danh sách sản phẩm:");
        for (int i = 0; i < prodCount; i++) {
            products[i].displayData();
        }
    }

    public static void addProduct(Scanner scanner) {
        Product prod = new Product();
        prod.inputData(scanner);
        products[prodCount++] = prod;
        System.out.println("Thêm sản phẩm thành công!");
    }

    public static void updateProduct(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm cần cập nhật: ");
        String id = scanner.nextLine();
        for (int i = 0; i < prodCount; i++) {
            if (products[i].getProductId().equals(id)) {
                products[i].inputData(scanner);
                System.out.println("Cập nhật sản phẩm thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm cần cập nhật!");
    }

    public static void deleteProduct(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        String id = scanner.nextLine();
        for (int i = 0; i < prodCount; i++) {
            if (products[i].getProductId().equals(id)) {
                for (int j = i; j < prodCount - 1; j++) {
                    products[j] = products[j + 1];
                }
                prodCount--;
                System.out.println("Xóa sản phẩm thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm cần xóa!");
    }

    public static void searchProductByNameOrTitle(Scanner scanner) {
        System.out.print("Nhập tên hoặc tiêu đề sản phẩm cần tìm: ");
        String keyword = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < prodCount; i++) {
            if (products[i].getProductName().contains(keyword) || products[i].getTitle().contains(keyword)) {
                products[i].displayData();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm nào khớp với từ khóa!");
        }
    }

    public static void searchProductByPriceRange(Scanner scanner) {
        System.out.print("Nhập khoảng giá bắt đầu: ");
        float min = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập khoảng giá kết thúc: ");
        float max = Float.parseFloat(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < prodCount; i++) {
            if (products[i].getExportPrice() >= min && products[i].getExportPrice() <= max) {
                products[i].displayData();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm nào trong khoảng giá này!");
        }
    }

    public static void sortProductsByPrice() {
        for (int i = 0; i < prodCount - 1; i++) {
            for (int j = i + 1; j < prodCount; j++) {
                if (products[i].getExportPrice() > products[j].getExportPrice()) {
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
        System.out.println("Danh sách sản phẩm sau khi sắp xếp theo giá:");
        listProducts();
    }

    public static void sellProduct(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm cần bán: ");
        String id = scanner.nextLine();
        for (int i = 0; i < prodCount; i++) {
            if (products[i].getProductId().equals(id)) {
                if (products[i].getQuantity() > 0) {
                    products[i].setQuantity(products[i].getQuantity() - 1);
                    if (products[i].getQuantity() == 0) products[i].setStatus(1);
                    System.out.println("Bán sản phẩm thành công!");
                } else {
                    System.out.println("Sản phẩm đã hết hàng!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm cần bán!");
    }

    public static void getProductByCategories() {
        for (int i = 0; i < catCount; i++) {
            int count = 0;
            for (int j = 0; j < prodCount; j++) {
                if (products[j].getCategoryId() == categories[i].getCategoryId()) {
                    count++;
                }
            }
            System.out.printf("Danh mục %s (Mã: %d) có %d sản phẩm%n",
                    categories[i].getCategoryName(), categories[i].getCategoryId(), count);
        }
    }
}
