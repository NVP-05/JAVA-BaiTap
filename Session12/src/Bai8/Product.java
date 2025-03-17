package Bai8;

public abstract class Product{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getDiscount() {
        return 0.0;
    }

    public double getDiscount(int quantity) {
        return (quantity > 100) ? 5.0 : getDiscount();
    }

    public double getFinalPrice() {
        return price - (price * getDiscount() / 100);
    }

    public double getFinalPrice(int quantity) {
        return price - (price * getDiscount(quantity) / 100);
    }
}
