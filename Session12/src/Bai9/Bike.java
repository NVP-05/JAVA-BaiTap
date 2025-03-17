package Bai9;

public class Bike extends Vehicle{
    @Override
    public void move() {
        System.out.println("Bike is pedaling along the path");
    }
    @Override
    public void sound() {
        System.out.println("Chuông xe đạp: Ring Ring!");
    }

}
