package Bai7;

class Student {
    private String name;
    private String id;
    private double gpa;

    public Student() {
    }

    public Student(String name, String id, double gpa) {
        if (name == null || name.isEmpty() || id == null || id.isEmpty() || gpa < 0 || gpa > 4.0) {
            throw new IllegalArgumentException("Dữ liệu không hợp lệ!");
        }
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getDetails() {
        return "Tên sinh viên: " + name + ", ID: " + id + ", GPA: " + gpa;
    }
}

