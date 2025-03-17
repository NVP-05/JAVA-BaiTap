package Bai9;

public class Bus extends Vehicle {
    private int seats;
    public Bus(int seats) {
        this.seats = seats;
    }
    @Override
    public void move() {
        System.out.println("Bus is moving on the road.");
    }
    @Override
    public void sound() {
        System.out.println("Còi xe bus Honk");
    }
    public int getSeats() {
        return seats;
    }
}
