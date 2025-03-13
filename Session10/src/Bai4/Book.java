package Bai4;

public class Book {
    private String title;
    private String author;
    private int price;
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        setPrice(price);
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Giá sách không hợp lệ! Giá phải lớn hơn hoặc bằng 0.");
        }
    }
    public void displayBookInfo() {
        System.out.println("Sách: " + title + " - Tác giả: " + author + " - Giá: " + price + " VNĐ");
    }
}

