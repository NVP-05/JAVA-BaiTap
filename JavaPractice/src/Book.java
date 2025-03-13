import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String title;
    private String author;
    private float interest;
    private int year;

    public Book(String author, String bookId, String bookName, float importPrice, float exportPrice, String title, float interest, int year) {
        this.author = author;
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.title = title;
        this.interest = interest;
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Book() {
    }

    public String getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getInterest() {
        return interest;
    }

    public int getYear() {
        return year;
    }

    public void inputData(Scanner scanner) {
        scanner.nextLine();

        System.out.println("Nhập Id sách: ");
        bookId = scanner.nextLine();
        String bookRegex = "(B)\\d{4}";
        while (!bookId.matches(bookRegex)) {
            System.out.println("ID sách phải bắt đầu là 'B' và có tổng 5 ký tự");
            System.out.println("Nhập Id sách:");
            bookId = scanner.nextLine();
        }

        System.out.println("Nhập tên sách");
        bookName = scanner.nextLine();

        System.out.println("Nhập giá nhập khẩu: ");
        importPrice = scanner.nextFloat();
        while (importPrice <= 0) {
            System.out.println("Giá nhập khẩu phải > 0");
            System.out.println("Nhập lại giá nhập khẩu:");
            importPrice = scanner.nextFloat();
        }

        System.out.println("Nhập giá xuất khẩu: ");
        exportPrice = scanner.nextFloat();
        while (exportPrice <= importPrice * 1.1) {
            System.out.println("Giá xuất khẩu phải > giá nhập khẩu 10%");
            System.out.println("Nhập lại giá xuất khẩu: ");
            exportPrice = scanner.nextFloat();
        }

        scanner.nextLine();

        System.out.println("Nhập tiêu đề sách: ");
        title = scanner.nextLine();
        while (title.isEmpty()) {
            System.out.println("Tiêu đề không được để trống");
            System.out.println("Nhập tiêu đề sách: ");
            title = scanner.nextLine();
        }

        System.out.println("Nhập tên tác giả: ");
        author = scanner.nextLine();
        while (author.isEmpty()) {
            System.out.println("Tên tác giả không được để trống");
            System.out.println("Nhập tên tác giả: ");
            author = scanner.nextLine();
        }

        System.out.println("Nhập năm xuất bản: ");
        year = scanner.nextInt();
        while (year <= 1970) {
            System.out.println("Năm phải > 1970");
            System.out.println("Nhập năm xuất bản: ");
            year = scanner.nextInt();
        }

    }

    public void displayData() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Giá nhập: " + importPrice);
        System.out.println("Giá bán: " + exportPrice);
        System.out.println("Tiêu đề: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Lợi nhuận: " + interest);
        System.out.println("Năm xuất bản: " + year);
    }

    public void calInterest() {
        this.interest = this.exportPrice - this.importPrice;
    }

}