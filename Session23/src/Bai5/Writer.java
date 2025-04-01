package Bai5;

public class Writer extends Thread {
    private SharedData sharedData;

    public Writer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        String[] messages = {
                "Chào peter",
                "Hun peter 1 cái",
                "Hoa hồng ảo thuật đó của ai?",
                "1 Virus = 3tr",
                "Cook đi cho khuất mắt."
        };

        for (String msg : messages) {
            sharedData.writeMessage(msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}