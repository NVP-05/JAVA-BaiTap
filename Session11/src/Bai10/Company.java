package Bai10;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;
    private final int MAX_EMPLOYEES = 50;
    public Company() {
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        if(employees.size() < MAX_EMPLOYEES) {
            employees.add(employee);
            System.out.println("Đã thêm nhân viên: " + employee.name);
        } else {
            System.out.println("Đã đạt giới hạn nhân viên.");
        }
    }
    public void organizeMeeting() {
        System.out.println("\nTổ chức cuộc họp:");
        for(Employee employee : employees) {
            if(employee instanceof AttendMeeting) {
                ((AttendMeeting) employee).attendMeeting();
            }
        }
    }
}

