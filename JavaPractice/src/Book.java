import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private double importPrice;
    private double exportPrice;
    private String title;
    private String author;
    private double interest;
    private int year;

    public Book() {};

    public Book(String bookName, String bookId, double importPrice, double exportPrice, String title, double interest, String author, int year) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.title = title;
        this.interest = interest;
        this.author = author;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
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

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void inputData(Scanner scanner) {
        System.out.printf("Nhập id sách: ");
        String bookIdRegex = "(B)\\w{4}";
        do{
            this.bookId = scanner.nextLine();
            if(this.bookId.matches(bookIdRegex)){
                break;
            }else{
                System.out.printf("Vui lòng nhập lại id sách: ");
            }
        }while(true);

        System.out.printf("Nhập tên sách: ");
        do{
            this.bookName = scanner.nextLine();
        }while(this.bookName.length() < 6 || this.bookName.length() > 1000);


        System.out.printf("Nhập giá sách nhập vào: ");
        do{
            this.importPrice = Double.parseDouble(scanner.nextLine());
        }while(this.importPrice <= 0);


        System.out.printf("Nhập giá bán sách: ");
        do{
            this.exportPrice = Double.parseDouble(scanner.nextLine());
        }while(this.exportPrice < this.importPrice * 1.1);

        System.out.printf("Nhập vào tiêu đề: ");
        do{
            this.title = scanner.nextLine();
        }while(this.title == null || this.title.isEmpty());

        System.out.printf("Nhập vào tên tác giả: ");
        do{
            this.author = scanner.nextLine();
        }while(this.author == null || this.author.isEmpty());

        System.out.printf("Nhập năm xuất bản của sách: ");
        do{
            this.year = Integer.parseInt(scanner.nextLine());
        }while(this.year <= 1970);
    }
    public void displayData(){
        System.out.println("ID sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Giá sách: " + importPrice);
        System.out.println("Giá bán: " + exportPrice);
        System.out.println("Tiêu đề: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Năm xuất bản: " + year);
        System.out.println("Lợi nhuận: " + interest);
        System.out.println("-----------------------------------------\n");
    }

    public double callInterest(){
        return this.exportPrice - this.importPrice;
    }
}