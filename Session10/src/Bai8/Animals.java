package Bai8;

class Animals {
    private String name;
    private int age;

    public Animals() {
    }

    public Animals(String name, int age) {
        if (name == null || name.isEmpty() || age < 0) {
            throw new IllegalArgumentException("Dữ liệu không hợp lệ!");
        }
        this.name = name;
        this.age = age;
    }

    public String displayInfo() {
        return "Tên: " + name + ", Tuổi: " + age;
    }

    public String makeSound() {
        return "Tiếng kêu";
    }
}

