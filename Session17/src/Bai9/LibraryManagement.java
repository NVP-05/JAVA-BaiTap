package Bai9;
import java.util.List;

public class LibraryManagement{
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("B001", "Bánh cu đơ", "Quân", 1995));
        library.addBook(new Book("B002", "Nem chua 36", "Văn Phúc", 2008));
        library.addBook(new Book("B003", "29-30 là số 1", "Hiếu", 2008));
        library.addBook(new Book("B004", "Những viên bi ảo thuật", "Đức Lương", 1999));
        library.addBook(new Book("B005", "Những người khốn khổ", "Văn Minh", 1994));
        List<Book> filteredBooks = library.filterBooksAfterYear(1999);
        library.sortBooksByTitle(filteredBooks);
        System.out.println("Danh sách sách xuất bản sau năm 1999:");
        library.printBooks(filteredBooks);
    }
}
