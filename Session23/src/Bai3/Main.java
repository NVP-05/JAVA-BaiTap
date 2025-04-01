package Bai3;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(new AlphabetPrinter(sharedResource), "Thread-1");
        Thread thread2 = new Thread(new AlphabetPrinter(sharedResource), "Thread-2");
        System.out.println("Luồng thứ 1: ");
        thread1.start();
        System.out.println("Luồng thứ 2: ");
        thread2.start();
    }
}