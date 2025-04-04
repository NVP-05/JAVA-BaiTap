package ss25.B2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cho hoac meo");
        Animal animal = AnimalFactory.getAnimal(sc.nextLine());
        animal.speak();

    }
}
