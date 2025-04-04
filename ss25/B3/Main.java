package ss25.B3;

public class Main {
    public static void main(String[] args) {
		//tach biet qua trinh xay dung doi tuong phuc tap
        Car car1 = new Car.CarBuilder().setEngine("dien").setSeats(4).setColor("xanh").build();
		Car car2 = new Car.CarBuilder().setEngine("v8").setSeats(4).setColor("do").build();
        car1.displayInfo();
        car2.displayInfo();
    }
}