package Bai7;

public class Bus extends Vehicle {
    @Override
    public void move() {
        System.out.println("Xe buýt đang chạy dọc theo đường cao tốc");
    }
    @Override
    public void sound() {
        System.out.println("Còi xe buýt: Honk Honk!");
    }
}
