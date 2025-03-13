package Bai9;

class Developer extends Employee {
    private String programmingLanguage;
    public Developer() {
        super();
        this.programmingLanguage = "Unknown";
    }
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        if (programmingLanguage == null || programmingLanguage.isEmpty()) {
            throw new IllegalArgumentException("Dữ liệu không hợp lệ!");
        }
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public String toString() {
        return super.toString() + ", Ngôn ngữ: " + programmingLanguage;
    }
}

