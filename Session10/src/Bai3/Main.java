package Bai3;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.displayCarInfo();
        myCar.setYear(2023);
        System.out.println("Năm sản xuất sau khi cập nhật: " + myCar.getYear());
        myCar.setYear(1111);
    }
}

