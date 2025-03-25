import java.util.HashMap;
import java.util.Map;

public class Bai2 {
    public static void main(String[] args) {
        Map<String, Integer> productPriceMap = new HashMap<>();
        productPriceMap.put("Smartphone", 800);
        productPriceMap.put("Laptop", 1500);
        productPriceMap.put("Tablet", 600);
        productPriceMap.put("Headphones", 200);
        productPriceMap.put("Monitor", 1000);
        if (productPriceMap.containsKey("Laptop")) {
            System.out.println("Sản phẩm 'Laptop' có trong Map.");
        } else {
            System.out.println("Sản phẩm 'Laptop' không có trong Map.");
        }
        boolean found = false;
        for (Map.Entry<String, Integer> entry : productPriceMap.entrySet()) {
            if (entry.getValue() == 1000) {
                System.out.println("Tồn tại sản phẩm '" + entry.getKey() + "' có giá bằng 1000.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không có sản phẩm nào có giá bằng 1000.");
        }
    }
}

