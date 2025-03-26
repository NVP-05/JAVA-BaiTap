package Bai9;

import java.util.List;

public class ProductProcessorImpl implements ProductProcessor {

    @Override
    public int calculateTotalValue(List<Product> products) {
        int sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }
}
