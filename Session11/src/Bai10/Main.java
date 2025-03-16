package Bai10;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Manager manager = new Manager("Alice", 8000);
        Developer developer = new Developer("Bob", 5000);
        company.addEmployee(manager);
        company.addEmployee(developer);
        System.out.println();
        manager.work();
        manager.takeVacation();
        manager.attendMeeting();
        System.out.println();
        developer.work();
        developer.takeVacation();
        company.organizeMeeting();
    }
}

