package Bai9;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Nguyễn Phúc", 001, 100000);
        Manager mgr = new Manager("An", 002, 200000, 20000);
        Developer dev = new Developer("Văn Minh", 003, 250000, "Java");
        System.out.println(emp);
        System.out.println(mgr);
        System.out.println(dev);
        emp.increaseSalary(10000);
        System.out.println("Lương sau khi tăng:");
        System.out.println(emp);
    }
}
