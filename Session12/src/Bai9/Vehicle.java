package Bai9;

public abstract class Vehicle{
    public abstract void move();
    public abstract void sound();

    public void move(int time, int speed) {
        System.out.println("Xe đã đi " + (time * speed) + " km.");
    }
}
