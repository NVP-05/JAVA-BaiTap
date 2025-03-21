package ra.entity;
import ra.validate.validateCustomer;
import java.util.Scanner;

public class Customer implements IApp {
    private String customerId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private boolean gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String customerType;

    public Customer() {
    }

    public Customer(String customerId, String firstName, String lastName, String dateOfBirth, boolean gender,
                    String address, String phoneNumber, String email, String customerType) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
    }
    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public boolean isGender() { return gender; }
    public void setGender(boolean gender) { this.gender = gender; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getCustomerType() { return customerType; }
    public void setCustomerType(String customerType) { this.customerType = customerType; }
    @Override
    public void inputData(Scanner sc) {
        System.out.println("Nhập ID khách hàng:");
        this.customerId = sc.nextLine();
        System.out.println("Nhập họ khách hàng:");
        this.lastName = validateCustomer.inputString(sc, 30);
        System.out.println("Nhập tên khách hàng:");
        this.firstName = validateCustomer.inputString(sc, 50);
        System.out.println("Nhập ngày sinh (dd/MM/yyyy):");
        this.dateOfBirth = validateCustomer.inputDate(sc);
        System.out.println("Nhập giới tính (true - Nam, false - Nữ):");
        this.gender = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Nhập địa chỉ:");
        this.address = validateCustomer.inputString(sc, 255);
        System.out.println("Nhập số điện thoại:");
        this.phoneNumber = validateCustomer.inputPhoneNumber(sc);
        System.out.println("Nhập email:");
        this.email = validateCustomer.inputEmail(sc);
        System.out.println("Nhập loại khách hàng (cá nhân/doanh nghiệp):");
        this.customerType = validateCustomer.inputString(sc, 50);
    }
    @Override
    public void displayData() {
        System.out.printf("Mã KH: %s | Họ tên: %s %s | Ngày sinh: %s | Giới tính: %s | Địa chỉ: %s | SĐT: %s | Email: %s | Loại KH: %s%n",
                customerId, lastName, firstName, dateOfBirth, gender ? "Nam" : "Nữ", address, phoneNumber, email, customerType);
    }
}