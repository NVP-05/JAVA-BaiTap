package Bai7;

public class Main {
    public static void main(String[] args) {
        Employee partTime = new PartTimeEmployee("Nguyễn Phúc", 15, 6);
        Employee fullTime = new FullTimeEmployee("Văn Minh", 20);
        System.out.println(partTime.getName() + " salary: " + partTime.calculateSalary());
        System.out.println(fullTime.getName() + " salary: " + fullTime.calculateSalary());
    }
}

