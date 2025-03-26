package Bai9;

import java.util.ArrayList;
import java.util.List;

public interface ProductProcessor {
    int calculateTotalValue(List<Product> products);

    static void printProductList(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    default List<Product> hasExpensiveProduct(List<Product> products) {
        List<Product> newList = new ArrayList<Product>();
        for (Product product : products) {
            if (product.getPrice() > 100) {
                newList.add(product);
            }
        }
        return newList;
    }
}
