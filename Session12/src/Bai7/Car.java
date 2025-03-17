package Bai7;

public class Car extends Vehicle{
    public Car(){
    }
    @Override
    public void move() {
        System.out.println("Chiếc xe đang chạy trên đường.");
    }
    @Override
    public void sound(){
        System.out.println("Còi xe: Beep Beep!");
    }
}
