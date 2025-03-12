import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    public int getId(){
        return this.id;
    }

    public enum Gender {
        MALE, FEMALE, OTHER;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public Student(){

    }
    public Student(int id, String name, int age, Gender gender, String address, String phoneNumber){
        setId(id);
        setName(name);
        setAge(age);
        setGender(gender);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    public void inputData(Scanner sc){
        System.out.printf("Id của sinh viên: ");
        setId(Integer.parseInt(sc.nextLine()));
        System.out.printf("Tên sinh viên");
        setName(sc.nextLine());
        System.out.printf("Tuổi: ");
        setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Giới tính (MALE, FEMALE, OTHER): ");
        setGender(Gender.valueOf(sc.nextLine()));
        System.out.printf("Địa chỉ");
        setAddress(sc.nextLine());
        System.out.printf("Số điện thoại");
        setPhoneNumber(sc.nextLine());
    }

    public void displayData(){
        System.out.println("Id: " + this.id);
        System.out.println("Tên: " + this.name);
        System.out.println("Tuô: " + this.age);
        System.out.println("Giới tính: " + this.gender);
        System.out.println("Địa chỉ: " + this.address);
        System.out.println("Số điện thoại: " + this.phoneNumber);
    }
}
