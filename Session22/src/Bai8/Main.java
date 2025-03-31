package Bai8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Laptop Asus", 1500.99));
        productList.add(new Product(2, "Smartphone", 799.49));
        productList.add(new Product(3, "Chuột Logitech", 500000.00));
        productList.add(new Product(4, "Headphones", 199.99));
        productList.add(new Product(5, "Smartwatch", 299.99));
        String fileName = "products.dat";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(productList);
            System.out.println("Ghi danh sách sản phẩm vào file thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Product> loadedProducts = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            loadedProducts = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Danh sách sản phẩm từ file:");
        for (Product product : loadedProducts) {
            System.out.println(product);
        }
    }
}
