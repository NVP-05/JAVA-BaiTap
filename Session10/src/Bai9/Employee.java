package Bai9;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        if (name == null || name.isEmpty() || id < 0 || salary < 0) {
            throw new IllegalArgumentException("Dữ liệu không hợp lệ!");
        }
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        }
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", ID: " + id + ", Lương: " + salary;
    }
}
