package cleaned;
import java.util.Scanner;

public class Product implements IShop {
    private String productId;
    private String productName;
    private String title;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private int categoryId;
    private int status; // 0: Còn hàng, 1: Hết hàng

    public Product() {
    }

    public Product(String productId, String productName, String title, float importPrice,
                   float exportPrice, int quantity, int categoryId, int status) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.categoryId = categoryId;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm: ");
        this.productId = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        this.productName = scanner.nextLine();
        System.out.print("Nhập tiêu đề: ");
        this.title = scanner.nextLine();
        System.out.print("Nhập giá nhập: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập giá xuất: ");
        this.exportPrice = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập số lượng: ");
        this.quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mã danh mục: ");
        this.categoryId = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập trạng thái (0: Còn hàng, 1: Hết hàng): ");
        this.status = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.printf("Mã sản phẩm: %s - Tên: %s - Tiêu đề: %s - Giá nhập: %.2f - Giá xuất: %.2f - Số lượng: %d - Danh mục: %d - Trạng thái: %s\n",
                this.productId, this.productName, this.title, this.importPrice, this.exportPrice,
                this.quantity, this.categoryId, this.status == 0 ? "Còn hàng" : "Hết hàng");
    }
}

