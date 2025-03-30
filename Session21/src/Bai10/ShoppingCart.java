package Bai10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addToCart(Product product, int quantity) throws Exception {
        if (quantity <= 0) {
            throw new Exception("Lỗi: Số lượng không hợp lệ!");
        }
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(product.getId())) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void removeFromCart(String productId) throws Exception {
        boolean removed = false;
        Iterator<CartItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.getProduct().getId().equals(productId)) {
                iterator.remove();
                removed = true;
                break;
            }
        }
        if (!removed) {
            throw new Exception("Lỗi: Không tìm thấy sản phẩm trong giỏ hàng!");
        }
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Giỏ hàng trống!");
        } else {
            System.out.println("Nội dung giỏ hàng:");
            for (CartItem item : items) {
                System.out.println("Mã: " + item.getProduct().getId() +
                        ", Tên: " + item.getProduct().getName() +
                        ", Giá: " + item.getProduct().getPrice() +
                        ", Số lượng: " + item.getQuantity());
            }
        }
    }

    public double checkout() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }
}

