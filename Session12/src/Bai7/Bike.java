package Bai7;

public class Bike extends Vehicle{
    @Override
    public void move() {
        System.out.println("Xe đạp đang đạp trên đường");
    }
    @Override
    public void sound() {
        System.out.println("Chuông xe đạp rung: Ring Ring!");
    }
}
