package Bai8;

class Dog extends Animals {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        if (breed == null || breed.isEmpty()) {
            throw new IllegalArgumentException("Dữ liệu không hợp lệ!");
        }
        this.breed = breed;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Giống, loài: " + breed;
    }

    @Override
    public String makeSound() {
        return "Game Game :))";
    }
}

