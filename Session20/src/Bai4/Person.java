package Bai4;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    void printInfo() {
        System.out.println("Tên: " + getName() + ", Ngày sinh: " + getBirthday() + ", Tuổi: " + getAge());
    }
}
