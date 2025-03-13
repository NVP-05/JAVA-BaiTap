package Bai2;

/*
* 1. Kế thừa là gì? Nó giúp ích gì trong lập trình hướng đối tượng?
- Kế thừa (Inheritance) là một trong bốn nguyên tắc cơ bản của lập trình hướng đối tượng (OOP).
  Kế thừa cho phép một lớp (lớp con) thừa hưởng các thuộc tính và phương thức từ một lớp khác (lớp cha).
  Điều này giúp tái sử dụng mã nguồn, mở rộng chức năng của lớp cha mà không cần phải viết lại mã.

* Lợi ích của kế thừa trong lập trình hướng đối tượng:
- Tái sử dụng mã nguồn: Lớp con có thể sử dụng lại các thuộc tính và phương thức của lớp cha, giúp giảm thiểu việc lặp lại mã.
- Mở rộng chức năng: Lớp con có thể mở rộng hoặc thay đổi chức năng của lớp cha mà không làm ảnh hưởng đến lớp cha.
- Cải thiện khả năng bảo trì: Khi cần thay đổi một chức năng, bạn chỉ cần thay đổi ở lớp cha và lớp con sẽ tự động cập nhật.
- Tạo ra cấu trúc phân lớp hợp lý: Kế thừa giúp tổ chức các lớp thành một cây phân cấp, giúp dễ dàng hiểu và quản lý các lớp.
2. Sự khác biệt giữa kế thừa và bao đóng (encapsulation) trong Java là gì?
* Kế thừa: Liên quan đến việc tạo các lớp con từ lớp cha, nơi lớp con kế thừa các thuộc tính và phương thức của lớp cha và có thể mở rộng hoặc thay đổi chúng.
* Bao đóng (Encapsulation): Liên quan đến việc ẩn thông tin (dữ liệu) và chỉ cho phép truy cập dữ liệu thông qua các phương thức getter và setter.
  Nó giúp bảo vệ dữ liệu khỏi bị thay đổi trực tiếp và chỉ cho phép thay đổi khi có sự kiểm soát.
* Sự khác biệt:
- Kế thừa là về việc tạo ra mối quan hệ giữa các lớp và tái sử dụng mã.
- Bao đóng là về bảo vệ dữ liệu của lớp, ẩn các chi tiết triển khai và chỉ cung cấp giao diện để truy cập và thay đổi dữ liệu.
* */

class Animal {
    String name;
    public void makeSound() {
        System.out.println("Tiếng kêu của động vật.");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Game! Game!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.bark();
        dog.name = "Mingbogba";
        System.out.println("Tên của chú chó: " + dog.name);
    }
}

