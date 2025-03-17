package Bai8;

public class Main{
    public static void main(String[] args) {
        Product electronics = new Electronics("\n" + "Fridge", 600);
        Product clothing = new Clothing("Dress", 50);
        Product food = new Food("Durian", 10);
        System.out.println("Giá cuối cùng của đồ điện tử: $" + electronics.getFinalPrice());
        System.out.println("Giá cuối cùng của đồ điện tử (200 sản phẩm): $" + electronics.getFinalPrice(200));
        System.out.println("Giá cuối cùng của quần áo: $" + clothing.getFinalPrice());
        System.out.println("Giá cuối cùng của quần áo (50 sản phẩm): $" + clothing.getFinalPrice(50));
        System.out.println("Giá cuối cùng của thực phẩm: $" + food.getFinalPrice());
        System.out.println("Giá cuối cùng của thực phẩm (150 sản phẩm): $" + food.getFinalPrice(150));

    }
}
