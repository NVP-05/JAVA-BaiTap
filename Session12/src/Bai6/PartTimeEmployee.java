package Bai6;

public class PartTimeEmployee extends Employee {
    private int hour;
    public PartTimeEmployee(String name, int age, double salary, int hour) {
        super(name, age, salary);
        this.hour = hour;
    }
    public PartTimeEmployee(int hour) {
        super();
        this.hour = hour;
    }
    public PartTimeEmployee() {
        super();
        this.hour = 0;
    }
    public int getHour() { return hour; }
    public void setHour(int hour) { this.hour = hour; }
    @Override
    public double calculateSalary() {
        return super.getSalary() * this.hour;
    }
}
