package Bai3;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 180);
        Vehicle bike = new Bike("Yamaha", 120);
        car.start();
        car.displayInfo();
        bike.start();
        bike.displayInfo();
    }
}

