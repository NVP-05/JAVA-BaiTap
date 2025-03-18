package cleaned;
import java.util.Scanner;

public class Categories implements IShop {
    private int categoryId;
    private String categoryName;
    private String descriptions;
    private boolean categoryStatus;

    public Categories() {
    }

    public Categories(int categoryId, String categoryName, String descriptions, boolean categoryStatus) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.descriptions = descriptions;
        this.categoryStatus = categoryStatus;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã danh mục: ");
        this.categoryId = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên danh mục: ");
        this.categoryName = scanner.nextLine();
        System.out.print("Nhập mô tả danh mục: ");
        this.descriptions = scanner.nextLine();
        System.out.print("Nhập trạng thái (true/false): ");
        this.categoryStatus = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.printf("Mã danh mục: %d - Tên: %s - Mô tả: %s - Trạng thái: %s\n",
                this.categoryId, this.categoryName, this.descriptions, this.categoryStatus ? "Hoạt động" : "Không hoạt động");
    }
}

