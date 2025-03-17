package Bai6;

public class Intern extends Employee {
    public Intern(String name, int age, double salary) {
        super(name, age, salary);
    }
    public Intern() {
        super();
    }
    @Override
    public double calculateSalary() {
        return this.getSalary();
    }
}
