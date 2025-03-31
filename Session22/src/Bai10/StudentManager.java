package Bai10;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
    public static void addStudent(Student student) {
        Main.studentList.add(student);
    }

    public static void saveToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(Main.studentList);
            System.out.println("Ghi danh sách sinh viên vào file thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile(String fileName) {
        List<Student> loadedStudents = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            loadedStudents = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Danh sách sản phẩm từ file:");
        for (Student student : loadedStudents) {
            student.displayData();
            System.out.println("--------------------------");
        }
    }

    public static Student findTopStudent() {
        List<Student> filterTopStudents = Main.studentList.stream().sorted(Comparator.comparing(Student::getGpa).reversed()).toList();
        return filterTopStudents.get(0);
    }

    public static List<Student> searchByMajor(String major) {
        List<Student> filters = Main.studentList.stream().filter(student -> student.getMajor().equals(major)).toList();

        if (filters.isEmpty()) {
            System.err.println("Không tìm thấy sinh viên thuộc ngành " + major);
        }

        return filters;
    }

    public static double calculateAverageGpa() {
        double totalGpa = Main.studentList.stream().mapToDouble(Student::getGpa).sum();
        return totalGpa / Main.studentList.size();
    }
}