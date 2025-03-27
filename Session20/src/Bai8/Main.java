package Bai8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Phúc", "IT", 8.5),
                new Student("Lương", "Business", 7.2),
                new Student("Minh", "IT", 9.0),
                new Student("Quân", "Design", 6.8),
                new Student("Nhất", "IT", 7.9),
                new Student("Nam", "Business", 8.1),
                new Student("Việt", "IT", 8.0),
                new Student("Tú", "Design", 7.5),
                new Student("Khoa", "Business", 6.9),
                new Student("An", "AI", 9.5)
        );
        Map<String, Long> listMajor = students.stream().collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()));
        listMajor.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}
