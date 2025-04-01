package Bai3;

public class AlphabetPrinter implements Runnable {
    private SharedResource resource;

    public AlphabetPrinter(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.printAlphabet();
    }
}