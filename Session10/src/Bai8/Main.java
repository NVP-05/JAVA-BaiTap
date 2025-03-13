package Bai8;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = new Animals[]{
                new Dog("Văn minh :))", 5, "Labrador"),
                new Cat("Mèo cam", 3, "Cam"),
                new Dog("Sói ngáo", 2, "Husky"),
                new Cat("Mèo mướp", 4, "Đen")
        };

        for (Animals animal : animals) {
            System.out.println(animal.displayInfo() + ", Tiếng kêu: " + animal.makeSound());
        }
    }
}

