package Bai4;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("Lập trình Java", "Nguyễn Văn A", 150000);
        myBook.displayBookInfo();
        myBook.setPrice(200000);
        System.out.println("Giá sách sau khi cập nhật: " + myBook.getPrice() + " VNĐ");
        myBook.setPrice(-50000);
    }
}
