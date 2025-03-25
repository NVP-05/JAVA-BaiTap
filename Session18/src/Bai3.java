import java.util.LinkedHashMap;
import java.util.Map;

public class Bai3 {
    public static void main(String[] args) {
        Map<String, Integer> productMap = new LinkedHashMap<>();
        productMap.put("Laptop", 1500);
        productMap.put("Smartphone", 800);
        productMap.put("Tablet", 600);
        productMap.put("Headphones", 200);
        productMap.put("Monitor", 1000);
        System.out.println("Danh sách sản phẩm ban đầu:");
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println("Sản phẩm: " + entry.getKey() + ", Giá: " + entry.getValue());
        }
        productMap.put("Laptop", 1400);
        System.out.println("\nDanh sách sau khi cập nhật giá Laptop:");
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println("Sản phẩm: " + entry.getKey() + ", Giá: " + entry.getValue());
        }
        productMap.remove("Tablet");
        System.out.println("\nDanh sách sau khi xóa Tablet:");
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println("Sản phẩm: " + entry.getKey() + ", Giá: " + entry.getValue());
        }
    }
}

