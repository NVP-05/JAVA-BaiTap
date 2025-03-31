package Bai9;

import java.util.Scanner;

public class BookManager {
    public static void addBook(Scanner sc) {
        System.out.println("Nhập vào số sách cần thêm: ");
        int numBooks = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Nhập thông tin sách thứ: " + (i + 1));
            Book book = new Book();
            book.inputData(sc);
            Main.books.add(book);
            System.out.println("Thêm thành công");
        }
    }

    public static void updateBook(Scanner sc) {
        System.out.println("Nhập vào 1 id cần cập nhật:");
        int id = Integer.parseInt(sc.nextLine());

        int indexUpdate = findBookById(id);

        if (indexUpdate == -1) {
            System.err.println("Không tìm thấy sách!");
            return;
        }

        do {
            System.out.println("-----------------CẬP NHẬT SẢN PHẨM-----------------");
            System.out.println("1. Cập nhật tên sách");
            System.out.println("2. Cập nhật tên tác giả");
            System.out.println("3. Cập nhật nhà xuất bản");
            System.out.println("4. Cập nhật giá");
            System.out.println("5. Trở về menu chính");
            System.out.printf("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên sách mới: ");
                    Main.books.get(indexUpdate).setName(sc.nextLine());
                    System.out.println("Cập nhât tên sách thành công!");
                    break;
                case 2:
                    System.out.println("Nhập tên tác giả mới:");
                    Main.books.get(indexUpdate).setAuthor(sc.nextLine());
                    System.out.println("Cập nhât tên tác giả thành công!");
                    break;
                case 3:
                    System.out.println("Nhập nhà xuất bản mới:");
                    Main.books.get(indexUpdate).setPublisher(sc.nextLine());
                    System.out.println("Cập nhât nhà xuất ban thành công!");
                    break;
                case 4:
                    System.out.println("Nhập giá mới:");
                    Main.books.get(indexUpdate).setPrice(Double.parseDouble(sc.nextLine()));
                    System.out.println("Cập nhât giá sách thành công!");
                    break;
                case 5:
                    return;
                default:
                    System.err.println("Vui lòng chọn lại từ 1 - 5");
            }
        } while (true);
    }

    public static void deleteBook(Scanner sc) {
        System.out.println("Nhập vào 1 id sách cần xóa");
        int id = Integer.parseInt(sc.nextLine());

        int indexDelete = findBookById(id);
        if (indexDelete == -1) {
            System.err.println("Không tìm thấy sách");
            return;
        }

        Main.books.remove(indexDelete);

        System.out.println("Xóa sách thành công");
    }

    public static void displayBooks() {
        if (Main.books.isEmpty()) {
            System.err.println("Danh sách trống!");
            return;
        }

        Main.books.forEach(Book::displayData);
    }

    public static int findBookById(int id) {
        for (int i = 0; i < Main.books.size(); i++) {
            if (Main.books.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}