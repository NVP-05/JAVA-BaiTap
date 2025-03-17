package Bai2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum2 = calculator.add(10, 20);
        System.out.println("10 + 20 = " + sum2);
        int sum3 = calculator.add(10, 20, 30);
        System.out.println("10 + 20 + 30 = " + sum3);
    }
}
