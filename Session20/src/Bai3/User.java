package Bai3;

import java.util.Optional;

public class User {
    private String name;
    private Optional<String> phoneNumber;

    public User(String name, Optional<String> phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void printInfo() {
        System.out.println("Tên: " + name + ", SĐT: " + phoneNumber.orElse("Không có"));
    }
}
