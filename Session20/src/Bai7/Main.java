package Bai7;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Phúc", 26, "IT", 2500),
                new Employee("Lương", 24, "IT", 2100),
                new Employee("Minh", 30, "HR", 3000),
                new Employee("Nhất", 28, "IT", 2000),
                new Employee("Nam", 32, "IT", 3100),
                new Employee("Dương", 25, "Marketing", 2200),
                new Employee("Khoa", 27, "IT", 2500)
        );
        employees.stream().filter(salary -> salary.getSalary() > 2000)
                .filter(age -> age.getAge() > 25)
                .filter(department -> department.getDepartment().equals("IT"))
                .sorted(Comparator.comparing(Employee::getSalary)
                        .thenComparing(Employee::getName).reversed())
                .forEach(System.out::println);
        ;
    }
}