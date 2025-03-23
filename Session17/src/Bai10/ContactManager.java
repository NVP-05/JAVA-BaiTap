package Bai10;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContactManager {
    private Set<Contact> contacts = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();

        Contact newContact = new Contact(name, phoneNumber);
        if (contacts.contains(newContact)) {
            System.out.println("Lỗi: Số điện thoại đã tồn tại!");
        } else {
            contacts.add(newContact);
            System.out.println("Thêm liên hệ thành công!");
        }
    }

    public void removeContact() {
        System.out.print("Nhập số điện thoại cần xóa: ");
        String phoneNumber = scanner.nextLine();
        Contact contactToRemove = null;
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                contactToRemove = c;
                break;
            }
        }
        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Xóa liên hệ thành công!");
        } else {
            System.out.println("Không tìm thấy liên hệ!");
        }
    }

    public void searchContact() {
        System.out.print("Nhập số điện thoại cần tìm: ");
        String phoneNumber = scanner.nextLine();

        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Đã tìm thấy liên hệ: " + c);
                return;
            }
        }
        System.out.println("Không tìm thấy liên hệ!");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Danh bạ trống.");
        } else {
            System.out.println("Danh sách liên hệ:");
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\n1. Thêm liên hệ");
            System.out.println("2. Xóa liên hệ");
            System.out.println("3. Tìm kiếm liên hệ");
            System.out.println("4. Hiển thị danh sách liên hệ");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: addContact(); break;
                case 2: removeContact(); break;
                case 3: searchContact(); break;
                case 4: displayContacts(); break;
                case 5: System.out.println("Đang thoát..."); System.exit(0);
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        manager.menu();
    }
}
