package Bai1;

public class Threads extends Thread {
    @Override
    public void run() {
        System.out.println("Thread đang chạy: " + Thread.currentThread().getName());
    }
}