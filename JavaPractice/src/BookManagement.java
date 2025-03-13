import java.util.Scanner;

public class BookManagement {
    static Book[] books = new Book[100];
    static int index = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*****************MENU********************");
            System.out.println("1. Hiển thị danh sách sách");
            System.out.println("2. Thêm mới sách");
            System.out.println("3. Tính lợi nhuận của các sách");
            System.out.println("4. Cập nhật sách theo id");
            System.out.println("5. Xóa sách theo id");
            System.out.println("6. Sắp xếp sách theo lợi nhuận tăng dần");
            System.out.println("7. Tìm kiếm sách theo tác giả");
            System.out.println("8. Tìm kiếm sách theo khoảng giá");
            System.out.println("9. Thống kê sách theo mỗi tác giá");
            System.out.println("10. Thoát");

            System.out.println("Lựa chọn của bạn : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayBook();
                    break;
                case 2:
                    addBook(scanner);  // Remove index++ from here
                    break;
                case 3:
                    callInterest();
                    break;
                case 4:
                    updateBook(scanner);
                    break;
                case 5:
                    deleteBook(scanner);
                    break;
                case 6:
                    sortBooksByInterest();
                    break;
                case 7:
                    searchBookByAuthor(scanner);
                    break;
                case 8:
                    searchBookByPriceRange(scanner);
                    break;
                case 9:
                    statisticsByAuthor();
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println("Nhập lại lựa chọn");
            }
        } while (true);
    }

    public static void displayBook() {
        if (index == 0) {
            System.out.println("Danh sách sách trống");
        } else {
            System.out.println("-------------------");
            System.out.println("Danh sách: ");
            for (int i = 0; i < index; i++) {
                books[i].displayData();
                System.out.println("-------------------");
            }
        }
    }

    public static void addBook(Scanner scanner) {
        if (index < books.length) {
            books[index] = new Book();
            books[index].inputData(scanner);
            index++;
        } else {
            System.out.println("Danh sách sách đã đầy!");
        }
    }

    public static void callInterest() {
        for (int i = 0; i < index; i++) {
            books[i].calInterest();
        }
    }

    public static void updateBook(Scanner scanner) {
        if (index == 0) {
            System.out.println("Danh sách sách trống!");
            return;
        }

        scanner.nextLine();
        System.out.println("Nhập ID sách cần cập nhật: ");
        String updateId = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (books[i].getBookId().equals(updateId)) {
                found = true;
                do {
                    System.out.println("MENU CẬP NHẬT SÁCH");
                    System.out.println("1. Cập nhật tên sách");
                    System.out.println("2. Cập nhật giá nhập");
                    System.out.println("3. Cập nhật giá xuất");
                    System.out.println("4. Cập nhật tiêu đề");
                    System.out.println("5. Cập nhật tác giả");
                    System.out.println("6. Cập nhật năm xuất bản");
                    System.out.println("7. Quay lại menu chính");
                    System.out.println("Chọn thông tin cần cập nhật: ");

                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("Nhập tên sách mới: ");
                            String newName = scanner.nextLine();
                            books[i].setBookName(newName);
                            System.out.println("Cập nhật tên sách thành công!");
                            break;

                        case 2:
                            System.out.println("Nhập giá nhập mới: ");
                            float newImportPrice = scanner.nextFloat();
                            while (newImportPrice <= 0) {
                                System.out.println("Giá nhập phải > 0");
                                System.out.println("Nhập lại giá nhập: ");
                                newImportPrice = scanner.nextFloat();
                            }
                            books[i].setImportPrice(newImportPrice);
                            books[i].calInterest(); // Tính lại lợi nhuận
                            System.out.println("Cập nhật giá nhập thành công!");
                            break;

                        case 3:
                            System.out.println("Nhập giá xuất mới: ");
                            float newExportPrice = scanner.nextFloat();
                            while (newExportPrice <= books[i].getImportPrice() * 1.1) {
                                System.out.println("Giá xuất phải > giá nhập 10%");
                                System.out.println("Nhập lại giá xuất: ");
                                newExportPrice = scanner.nextFloat();
                            }
                            books[i].setExportPrice(newExportPrice);
                            books[i].calInterest(); // Tính lại lợi nhuận
                            System.out.println("Cập nhật giá xuất thành công!");
                            break;

                        case 4:
                            System.out.println("Nhập tiêu đề mới: ");
                            String newTitle = scanner.nextLine();
                            while (newTitle.isEmpty()) {
                                System.out.println("Tiêu đề không được để trống");
                                System.out.println("Nhập lại tiêu đề: ");
                                newTitle = scanner.nextLine();
                            }
                            books[i].setTitle(newTitle);
                            System.out.println("Cập nhật tiêu đề thành công!");
                            break;

                        case 5:
                            System.out.println("Nhập tên tác giả mới: ");
                            String newAuthor = scanner.nextLine();
                            while (newAuthor.isEmpty()) {
                                System.out.println("Tên tác giả không được để trống");
                                System.out.println("Nhập lại tên tác giả: ");
                                newAuthor = scanner.nextLine();
                            }
                            books[i].setAuthor(newAuthor);
                            System.out.println("Cập nhật tác giả thành công!");
                            break;

                        case 6:
                            System.out.println("Nhập năm xuất bản mới: ");
                            int newYear = scanner.nextInt();
                            while (newYear <= 1970) {
                                System.out.println("Năm phải > 1970");
                                System.out.println("Nhập lại năm xuất bản: ");
                                newYear = scanner.nextInt();
                            }
                            books[i].setYear(newYear);
                            System.out.println("Cập nhật năm xuất bản thành công!");
                            break;

                        case 7:
                            return;

                        default:
                            System.out.println("Lựa chọn không hợp lệ!");
                    }


                    System.out.println("\nThông tin sách sau khi cập nhật:");
                    books[i].displayData();

                } while (true);
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sách có ID: " + updateId);
        }
    }

    private static void deleteBook(Scanner scanner) {
        System.out.print("Nhập mã sách cần xóa: ");
        String bookId = scanner.nextLine();
        for (int i = 0; i < index; i++) {
            if (books[i].getBookId().equals(bookId)) {
                for (int j = i; j < index - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[index - 1] = null;
                index--;
                System.out.println("Đã xóa sách thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sách với mã " + bookId);
    }

    public static void sortBooksByInterest() {
        if (index == 0) {
            System.out.println("Danh sách sách trống!");
            return;
        }

        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - i - 1; j++) {
                if (books[j].getInterest() > books[j + 1].getInterest()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }

        System.out.println("Đã sắp xếp sách theo lợi nhuận tăng dần:");
        displayBook();
    }

    private static void searchBookByAuthor(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhập tên tác giả cần tìm: ");
        String author = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < index; i++) {
            if (books[i].getAuthor().toLowerCase().contains(author.toLowerCase())) {
                books[i].displayData();
                System.out.println("-------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sách của tác giả có tên chứa '" + author + "'");
        }
    }

    public static void searchBookByPriceRange(Scanner scanner) {
        System.out.println("Nhập khoảng giá thấp nhất: ");
        float minPrice = scanner.nextFloat();

        System.out.println("Nhập khoảng giá cao nhất: ");
        float maxPrice = scanner.nextFloat();

        if (minPrice > maxPrice) {
            System.out.println("Khoảng giá không hợp lệ!");
            return;
        }

        boolean found = false;
        System.out.println("Kết quả tìm kiếm: ");
        for (int i = 0; i < index; i++) {
            if (books[i].getExportPrice() >= minPrice && books[i].getExportPrice() <= maxPrice) {
                books[i].displayData();
                System.out.println("-------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sách trong khoảng giá từ " + minPrice + " đến " + maxPrice);
        }
    }

    public static void statisticsByAuthor() {
        System.out.println("Thống kê số lượng sách theo từng tác giả:");

        for (int i = 0; i < index; i++) {
            String author = books[i].getAuthor();

            // Chỉ in nếu đây là lần đầu tiên gặp tác giả
            boolean isFirstTime = true;
            for (int j = 0; j < i; j++) {
                if (books[j].getAuthor().equals(author)) {
                    isFirstTime = false;
                    break;
                }
            }

            // Nếu là lần đầu, đếm và in
            if (isFirstTime) {
                int count = 0;
                for (int k = 0; k < index; k++) {
                    if (books[k].getAuthor().equals(author)) {
                        count++;
                    }
                }
                System.out.println("Tác giả: " + author + " - Số lượng sách: " + count);
            }
        }
    }


}