package Bai9;

class Manager extends Employee {
    private double bonus;

    public Manager() {
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        if (bonus < 0) {
            throw new IllegalArgumentException("Dữ liệu không hợp lệ!");
        }
        this.bonus = bonus;
    }
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Thưởng: " + bonus;
    }
}

