package Bai10;

public abstract class Employee {
    protected String name;
    protected int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public abstract void work();
    public abstract void takeVacation();
}

