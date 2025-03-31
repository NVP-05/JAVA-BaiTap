package Bai8;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Id: " + id + " | Tên: " + name + " | Giá: " + price;
    }
}