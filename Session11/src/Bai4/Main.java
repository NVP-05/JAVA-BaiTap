package Bai4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Electronic> devices = new ArrayList<>();
        devices.add(new TV());
        devices.add(new Radio());
        for (Electronic device : devices) {
            device.turnOn();
            device.turnOff();
        }
    }
}

