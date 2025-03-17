package Bai9;

public class Main{
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus(40);
        Airplane airplane = new Airplane(30000);
        car.move();
        car.sound();
        car.move(2, 60);
        bike.move();
        bike.sound();
        bike.move(1, 20);
        bus.move();
        bus.sound();
        bus.move(3, 50);
        System.out.println("Xe buýt có " + ((Bus) bus).getSeats() + " chỗ ngồi.");
        airplane.move();
        airplane.sound();
        airplane.move(5, 800);
        System.out.println("Máy bay đang bay ở độ cao: " + ((Airplane) airplane).getAltitude() + " feet.");
    }

}
