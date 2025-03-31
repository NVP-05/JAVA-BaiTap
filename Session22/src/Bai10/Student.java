package Bai10;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private String major;
    private double gpa;

    public Student(int id, String name, String major, double gpa) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public void displayData() {
        System.out.printf("Id: %d\n", id);
        System.out.printf("Name: %s\n", name);
        System.out.printf("Major: %s\n", major);
        System.out.printf("GPA: %.2f\n", gpa);
    }
}