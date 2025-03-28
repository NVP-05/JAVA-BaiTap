package Bai6;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void showAnimals() {
        for (Animal animal : animals) {
            System.out.println("Animal: " + animal.name + ", Age: " + animal.age);
            animal.sound();
            animal.move();
            System.out.println();
        }
    }
}

