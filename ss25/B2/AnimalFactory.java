package ss25.B2;

public class AnimalFactory {
    public static Animal getAnimal(String animal) {
        if (animal.equals("cho")) {
            return new Dog();
        } else if (animal.equals("mmeo")) {
            return new Cat();
        } else return null;
    }
}
