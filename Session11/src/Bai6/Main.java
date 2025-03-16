package Bai6;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal lion = new Lion("Leo", 3);
        Animal elephant = new Elephant("Dumbo", 7);
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.showAnimals();
    }
}

