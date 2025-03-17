package Bai6;

public class Employee {
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Employee() {
        this("Unknown", 0, 0);
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public double calculateSalary() { return this.salary; }
    public void showInfo() {
        System.out.println("Tên: " + this.name);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Lương cơ bản: " + this.salary);
    }
}
