package Bai7;

public class Main{
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bike(), new Bus()};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.sound();
            System.out.println();
        }
    }
}
