import java.util.Scanner;

public class BookManagement {
    static Book[] books = new Book[100];
    static int currentIndex = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("***********************MENU**************************");
            System.out.println("1. Hiển thị danh sách.");
            System.out.println("2. Thêm mới sách.");
            System.out.println("3. Tính lợi nhuận của sách.");
            System.out.println("4. Cập nhật sách.");
            System.out.println("5. Xóa sách.");
            System.out.println("6. Sắp xếp sách theo lợi nhuận tăng dần.");
            System.out.println("7. Tìm kiếm sách theo tác giả.");
            System.out.println("8. Tìm kiếm sách theo khoảng giá.");
            System.out.println("9. Thống kê sách theo mọi tác giả");
            System.out.println("10. Thoát");
            System.out.println("Lựa chọn của bạn là: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1:
                    displayBook();
                    break;
                case 2:
                    addBook(scanner);
                    break;
                case 3:
                    caculateInterest(scanner);
                    break;
                case 4:
                    updateBook(scanner);
                    break;
                case 5:
                    deleteBookById(scanner);
                    break;
                case 6:
                    sortBooksByInterest();
                    displayBook();
                    break;
                case 7:
                    searchBooksByAuthorName(scanner);
                    break;
                case 8:
                    searchBooksByExportRange(scanner);
                    break;
                case 9:
                    countBookByAuthor(scanner);
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1-10:");
            }
        }while(true);
    }

    public static void displayBook(){
        System.out.println("Danh sách:");
        for (int i = 0; i < currentIndex; i++ ){
            books[i].displayData();
        }
    }
    public static void addBook(Scanner scanner){
        System.out.println("Nhập số lượng sách cần thêm");
        int numberOfBooks = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++){
            books[currentIndex] = new Book();
            books[currentIndex].inputData(scanner);
            currentIndex++;
        }
    }

    public static void  caculateInterest(Scanner scanner){
        for (int i = 0; i < currentIndex; i++ ){
            books[i].setInterest(books[i].callInterest());
        }
    }

    public static int getBookById(String bookId){
        for (int i = 0; i < currentIndex; i++ ){
            if (books[i].getBookId().equals(bookId)){
                return i;
            }
        }
        return -1;
    }

    public static void updateBook(Scanner scanner){
        System.out.println("Nhập id sách cần cập nhật: ");
        String bookId= scanner.nextLine();
        int index = getBookById(bookId);

        if (index == -1){
            System.out.printf("Không tìm thấy sách có ID là: %s\n", bookId);
        }else{
            boolean isExit = true;
            do{
                System.out.println("****************CẬP NHẬT THÔNG TIN SÁCH**********");
                System.out.println("1. Cập nhật tên sách.");
                System.out.println("2. Cập nhật giá sách.");
                System.out.println("3. Cập nhật giá bán sách.");
                System.out.println("4. Cập nhật tiêu đề sách.");
                System.out.println("5. Cập nhật tác giả.");
                System.out.println("6. Cập nhật năm xuất bản.");
                System.out.println("7. Thoát");
                System.out.print("Chọn mục cần cập nhật: ");
                int choiceUpdate = Integer.parseInt(scanner.nextLine());
                switch(choiceUpdate){
                    case 1:
                        System.out.println("Nhập vào tên sách mới.");
                        books[index].setBookName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Nhập vào giá nhập sách mới.");
                        books[index].setImportPrice(Double.parseDouble(scanner.nextLine()));
                        break;
                    case 3:
                        System.out.println("Nhập vào giá bán sách mới.");
                        books[index].setExportPrice(Double.parseDouble(scanner.nextLine()));
                        break;
                    case 4:
                        System.out.println("Nhập vào tiêu đề sách mới.");
                        books[index].setTitle(scanner.nextLine());
                        break;
                    case 5:
                        System.out.println("Nhập vào tên tác giả mới.");
                        books[index].setAuthor(scanner.nextLine());
                        break;
                    case 6:
                        System.out.println("Nhập vào năm xuất bản mới.");
                        books[index].setYear(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 7:
                        isExit = false;
                        break;
                    default:
                        System.out.println("Vui lòng chọn từ 1-7:");
                }
            }while(isExit);
        }
    }
    // xoa sach theo id sach
    public static void deleteBookById(Scanner scanner){
        System.out.println("Nhập vào id sách muốn xóa:");
        String bookId = scanner.nextLine() ;
        int index = getBookById(bookId);
        if (index == -1){
            System.out.println("Không tìm thấy sách có id là: " + bookId);
        }else {
            for (int i = index; i < currentIndex - 1; i++ ){
                books[i] = books[i + 1];
            }
            currentIndex--;
        }
        System.out.println("Xóa thành công sách có id là: " + bookId);
    }

    public static void sortBooksByInterest() {
        for (int i = 0; i < currentIndex - 1; i++) {
            for (int j = 0; j < currentIndex - 1 - i; j++) {
                if (books[j].getInterest() > books[j + 1].getInterest()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public static void searchBooksByAuthorName(Scanner scanner){
        System.out.println("Nhập vào tên tác giả: ");
        String input = scanner.nextLine();
        System.out.println("Danh sách các sách theo tác giả: "+ input);
        for (int i = 0; i < currentIndex; i++) {
            if (books[i].getAuthor().equals(input)){
                books[i].displayData();
            }
        }
    }
    public static void searchBooksByExportRange(Scanner scanner){
        System.out.println("Nhập vào giá thấp nhất:");
        double start = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào giá cao nhất:");
        double end = Double.parseDouble(scanner.nextLine());

        System.out.printf("Danh sách các sách trong khoảng từ %f đến %f là \n", start, end);
        for(int i= 0; i < currentIndex; i++){
            if(books[i].getExportPrice() >= start && books[i].getExportPrice() <= end){
                books[i].displayData();
            }
        }
    }
    public static void countBookByAuthor(Scanner scanner){
        System.out.println("Nhập vào tên tác giả:");
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (books[i].getAuthor().equals(input)){
                count ++;
            }
        }
        System.out.printf("Tác giả %s có %d quyển sách", input, count);
    }
}