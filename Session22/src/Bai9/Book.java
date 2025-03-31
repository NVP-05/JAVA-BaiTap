package Bai9;

import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private double price;

    public Book() {
    }

    public Book(int id, String name, String author, String publisher, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void inputData(Scanner sc){
        System.out.println("Nhập id: ");
        this.id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên sách:");
        this.name = sc.nextLine();

        System.out.println("Nhập tác giả:");
        this.author = sc.nextLine();

        System.out.println("Nhập nhà xuất bản: ");
        this.publisher = sc.nextLine();

        System.out.println("Nhập giá:");
        this.price = Double.parseDouble(sc.nextLine());
    }

    public void displayData(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
    }
}