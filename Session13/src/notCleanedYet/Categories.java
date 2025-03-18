package notCleanedYet;
import java.util.Scanner;

public class Categories implements IApp {
    private static int autoIncrementId = 1;
    private static String[] proNames = new String[1000];
    private static int nameCount = 0;

    private int categoryId;
    private String categoryName;
    private int priority;
    private String description;
    private boolean status;

    public Categories() {
        this.categoryId = autoIncrementId++;
    }

    public Categories(String categoryName, int priority, String description, boolean status) {
        this.categoryId = autoIncrementId++;
        this.categoryName = categoryName;
        this.priority = priority;
        this.description = description;
        this.status = status;
        proNames[nameCount++] = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        if (validateName(categoryName) && !isNameUsed(categoryName)) {
            for (int i = 0; i < nameCount; i++) {
                if (proNames[i].equals(this.categoryName)) {
                    proNames[i] = categoryName;
                    break;
                }
            }
            this.categoryName = categoryName;
        }
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    private boolean validateName(String name) {
        return name != null && name.length() >= 6 && name.length() <= 50;
    }

    private boolean isNameUsed(String name) {
        for (int i = 0; i < nameCount; i++) {
            if (proNames[i] != null && proNames[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhập tên danh mục: ");
        String name = scanner.nextLine();
        while (!validateName(name) || isNameUsed(name)) {
            System.out.print("Tên không hợp lệ hoặc đã tồn tại! Vui lòng nhập lại: ");
            name = scanner.nextLine();
        }
        this.categoryName = name;
        proNames[nameCount++] = name;

        System.out.print("Nhập độ ưu tiên: ");
        this.priority = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập mô tả (tối đa 255 ký tự): ");
        this.description = scanner.nextLine();
        if (description.length() > 255) {
            System.out.println("Mô tả quá dài! Hệ thống sẽ tự động cắt ngắn lại.");
            this.description = description.substring(0, 255);
        }

        System.out.print("Nhập trạng thái (true: Hoạt động, false: Không hoạt động): ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.printf("Mã danh mục: %d | Tên danh mục: %s | Độ ưu tiên: %d | Mô tả: %s | Trạng thái: %s%n",
                categoryId, categoryName, priority, description, status ? "Hoạt động" : "Không hoạt động");
    }

}
