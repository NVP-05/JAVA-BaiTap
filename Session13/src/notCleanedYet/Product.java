package notCleanedYet;
import java.util.Scanner;

public class Product implements IApp {
    private static String[] proId = new String[1000];
    private static String[] proNames = new String[1000];
    private static int idCount = 0;
    private static int nameCount = 0;

    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private String title;
    private String description;
    private int quantity;
    private int categoryId;
    private int status;

    public Product() {

    }

    public Product(String productId, String productName, float importPrice, float exportPrice, String title, String description, int quantity, int categoryId, int status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.categoryId = categoryId;
        this.status = status;
        proId[idCount++] = productId;
        proNames[nameCount++] = productName;
    }

    public static String[] getProId() {
        return proId;
    }

    public static void setProId(String[] proId) {
        Product.proId = proId;
    }

    public static String[] getProNames() {
        return proNames;
    }

    public static void setProNames(String[] proNames) {
        Product.proNames = proNames;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        Product.idCount = idCount;
    }

    public static int getNameCount() {
        return nameCount;
    }

    public static void setNameCount(int nameCount) {
        Product.nameCount = nameCount;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    private boolean validateId(String id) {
        if (id == null || id.length() != 5 || !id.matches("^[CET][a-zA-Z0-9]{4}$")) return false;
        for (int i = 0; i < idCount; i++) {
            if (proId[i] != null && proId[i].equals(id)) return false;
        }
        return true;
    }

    private boolean validateName(String name) {
        if (name == null || name.length() < 10 || name.length() > 100) return false;
        for (int i = 0; i < nameCount; i++) {
            if (proNames[i] != null && proNames[i].equals(name)) return false;
        }
        return true;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm (5 ký tự, bắt đầu bằng C, E hoặc T): ");
        String id = scanner.nextLine();
        while (!validateId(id)) {
            System.out.print("Mã không hợp lệ! Vui lòng nhập lại: ");
            id = scanner.nextLine();
        }
        this.productId = id;
        proId[idCount++] = id;

        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        while (!validateName(name)) {
            System.out.print("Tên không hợp lệ! Vui lòng nhập lại: ");
            name = scanner.nextLine();
        }
        this.productName = name;
        proNames[nameCount++] = name;

        System.out.print("Nhập giá nhập vào: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        while (this.importPrice <= 0) {
            System.out.print("Giá nhập phải lớn hơn 0! Vui lòng nhập lại: ");
            this.importPrice = Float.parseFloat(scanner.nextLine());
        }

        System.out.print("Nhập giá xuất (phải lớn hơn " + (importPrice * INTEREST) + "): ");
        this.exportPrice = Float.parseFloat(scanner.nextLine());
        while (this.exportPrice < importPrice * INTEREST) {
            System.out.print("Giá xuất phải lớn hơn " + (importPrice * INTEREST) + "! Nhập lại: ");
            this.exportPrice = Float.parseFloat(scanner.nextLine());
        }

        System.out.print("Nhập tiêu đề sản phẩm: ");
        this.title = scanner.nextLine();
        while (this.title.length() > 200) {
            System.out.print("Tiêu đề quá dài! Vui lòng nhập lại (dưới 200 ký tự): ");
            this.title = scanner.nextLine();
        }

        System.out.print("Nhập mô tả sản phẩm: ");
        this.description = scanner.nextLine();

        System.out.print("Nhập số lượng sản phẩm: ");
        this.quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập mã danh mục: ");
        this.categoryId = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập trạng thái sản phẩm (0: Hoạt động, 1: Hết hàng, 2: Không hoạt động): ");
        this.status = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.printf("Mã sản phẩm: %s | Tên sản phẩm: %s | Giá nhập: %.2f | Giá xuất: %.2f | Tiêu đề: %s | Số lượng: %d | Mã danh mục: %d | Trạng thái: %s%n",
                productId, productName, importPrice, exportPrice, title, quantity, categoryId,
                status == 0 ? "Hoạt động" : (status == 1 ? "Hết hàng" : "Không hoạt động"));
    }

}
