package Bai4;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Phúc", LocalDate.of(2005, 1, 20)),
                new Person("Lương", LocalDate.of(2004, 5, 15)),
                new Person("Minh", LocalDate.of(2005, 12, 1)),
                new Person("Quân", LocalDate.of(2003, 12, 20))
        );
        for (Person person : people) {
            person.printInfo();
        }
    }
}
