package Bai7;

public class PartTimeEmployee extends Employee {
    private int workingHours;
    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    public int getWorkingHours() {
        return workingHours;
    }
    @Override
    public int calculateSalary() {
        return workingHours * paymentPerHour;
    }
}

