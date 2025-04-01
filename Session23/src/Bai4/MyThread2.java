package Bai4;

public class MyThread2 extends Thread {
    private Thread thread1;

    public MyThread2(Thread thread1) {
        this.thread1 = thread1;
    }

    @Override
    public void run() {
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 2 bắt đầu...");
    }
}