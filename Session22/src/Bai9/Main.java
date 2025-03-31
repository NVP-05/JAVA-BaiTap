package Bai9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "books.dat";

        do {
            System.out.println("-------------------MENU------------------");
            System.out.println("1. Thêm sách");
            System.out.println("2. Cập nhật sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Hiển thị danh sách sách");
            System.out.println("5. Lưu danh sách vào file");
            System.out.println("6. Thoát");
            System.out.printf("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    BookManager.addBook(sc);
                    break;
                case 2:
                    BookManager.updateBook(sc);
                    break;
                case 3:
                    BookManager.deleteBook(sc);
                    break;
                case 4:
                    BookManager.displayBooks();
                    break;
                case 5:
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
                        oos.writeObject(books);
                        System.out.println("Ghi danh sách sách vào file thành công!");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn lại từ 1 - 6");
            }
        } while (true);
    }
}