package Bai1;
/*
* 1. Tính đóng gói là gì? Tại sao tính đóng gói lại quan trọng trong lập trình đối tượng?
-Tính đóng gói (Encapsulation) là một trong bốn nguyên tắc cơ bản của lập trình hướng đối tượng (OOP).
 Nó đề cập đến việc gói gọn dữ liệu (thuộc tính) và các phương thức xử lý dữ liệu trong một lớp,
 đồng thời hạn chế quyền truy cập trực tiếp từ bên ngoài bằng cách sử dụng các mức độ truy cập (private, protected, public).
* Tại sao tính đóng gói quan trọng?
- Bảo vệ dữ liệu: Tránh việc dữ liệu bị thay đổi ngoài ý muốn.
- Kiểm soát quyền truy cập: Chỉ cho phép những thành phần được phép truy cập và thay đổi dữ liệu.
- Dễ bảo trì và mở rộng: Có thể thay đổi cách xử lý dữ liệu mà không ảnh hưởng đến phần còn lại của chương trình.
- Ẩn thông tin: Giúp che giấu chi tiết triển khai bên trong của một lớp, chỉ cung cấp giao diện cần thiết cho bên ngoài.
2. Làm thế nào để áp dụng tính đóng gói trong Java?
* Trong Java, tính đóng gói được thực hiện bằng cách:
- Khai báo các thuộc tính của lớp ở mức private, nghĩa là chỉ có thể truy cập từ bên trong lớp đó.
- Cung cấp phương thức getter để lấy dữ liệu và setter để thay đổi dữ liệu, nếu cần thiết.
- Sử dụng mức độ truy cập thích hợp (public, private, protected) để giới hạn quyền truy cập.
* */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nguyễn Phúc", 20);
        System.out.println("Tên: " + person.getName());
        System.out.println("Tuổi: " + person.getAge());
        person.setName("Trâm Anh");
        person.setAge(21);
        System.out.println("Tên mới: " + person.getName());
        System.out.println("Tuổi mới: " + person.getAge());
        person.setAge(-10);
    }
}

