package Bai3;

public class Car extends Vehicle {
    public Car(String name, int speed) {
        super(name, speed);
    }
    @Override
    public void displayInfo() {
        System.out.println("Tên xe ô tô: " + name + ", Tốc độ: " + speed + " km/h");
    }
}

