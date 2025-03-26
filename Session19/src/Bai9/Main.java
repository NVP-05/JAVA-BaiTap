package Bai9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Điện thoại", 100));
        products.add(new Product("Máy tính", 500));
        products.add(new Product("Bàn gỗ", 300));
        products.add(new Product("Ghế nhựa", 50));
        products.add(new Product("Xe đạp", 250));

        ProductProcessor processor = new ProductProcessorImpl();

        System.out.println("Danh sách sản phẩm:");
        ProductProcessor.printProductList(products);

        int totalValue = processor.calculateTotalValue(products);
        System.out.println("Tổng giá trị sản phẩm: " + totalValue);

        List<Product> expensiveProducts = processor.hasExpensiveProduct(products);
        System.out.println("\nSản phẩm có giá trên 100:");
        ProductProcessor.printProductList(expensiveProducts);
    }
}
