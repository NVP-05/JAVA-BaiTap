package Bai3;

public class SharedResource {
    public synchronized void printAlphabet() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}