package Bai3;

public class Bike extends Vehicle {
    public Bike(String name, int speed) {
        super(name, speed);
    }
    @Override
    public void displayInfo() {
        System.out.println("Tên xe máy: " + name + ", Tốc độ: " + speed + " km/h");
    }
}

