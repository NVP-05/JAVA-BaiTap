package Bai2;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runables();
        Thread thread = new Thread(runnable);
        thread.run();
    }
}