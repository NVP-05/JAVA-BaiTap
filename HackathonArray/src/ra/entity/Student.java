package ra.entity;

import ra.validate.StringValidator;
import ra.validate.StudentValidator;

import java.util.Scanner;

public class Student implements IApp{
    private String studentID;
    private String studentName;
    private String birthday;
    private String phoneNumber;
    private boolean sex;
    private String email;
    private String major;
    private String className;
    private float gpa;
    private int status;

    public Student(String studentID, String studentName, String birthday, boolean sex, String email, String major, String className, float gpa, int status){
        this.studentID = studentID;
        this.studentName = studentName;
        this.birthday = birthday;
        this.sex = sex;
        this.email = email;
        this.major = major;
        this.className = className;
        this.gpa = gpa;
        this.status = status;
    }

    public Student(){
    }

    public String getStudentID(){
        return studentID;
    }

    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getBirthday(){
        return birthday;
    }

    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

    public boolean isSex(){
        return sex;
    }

    public void setSex(boolean sex){
        this.sex = sex;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getClassName(){
        return className;
    }

    public void setClassName(String className){
        this.className = className;
    }

    public float getGpa(){
        return gpa;
    }

    public void setGpa(float gpa){
        this.gpa = gpa;
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
    }


    @Override
    public void inputData(Scanner input){
        this.studentID = StudentValidator.studentIdValidate(input, "Mời nhập mã sinh viên: ", "(SV)\\w{5}$");
        this.studentName = StringValidator.stringValidator(input, "Mời nhập tên sinh viên: ");
        this.birthday = StudentValidator.studentBirtdayValidate(input, "Mời ngày sinh: ", "\\d{2}-\\d{2}-\\d{4}");
        this.phoneNumber = StudentValidator.studentPhoneNumberValidate(input, "Mời nhập số điện thoại: ", "(09)\\d{8}");
        this.sex = StudentValidator.studentSexValidate(input, "Mời nhập giới tính ('Nam' hoặc 'Nữ'): ");
        this.email = StudentValidator.studentEmailValidate(input, "Mời nhập email: ", "\\{8-15}[@]\\w{8}[.]\\{3}");
        this.status = StudentValidator.studentStatusValidate(input, "Mời nhập trạng thái: (1. đang học, 2. bảo lưu, 3. đã nghỉ học):");
    }

    public void updateData(Scanner input){
        this.studentName = StringValidator.stringValidator(input, "Mời nhập tên sinh viên: ");
        this.birthday = StudentValidator.studentBirtdayValidate(input, "Mời ngày sinh: ", "\\d{2}-\\d{2}-\\d{4}");
        this.phoneNumber = StudentValidator.studentPhoneNumberValidate(input, "Mời nhập số điện thoại: ", "(09)\\d{8}");
        this.sex = StudentValidator.studentSexValidate(input, "Mời nhập giới tính ('Nam' hoặc 'Nữ'): ");
        this.email = StudentValidator.studentEmailValidate(input, "Mời nhập email: ", "\\{8-15}[@]\\w{8}[.]\\{3}");
        this.status = StudentValidator.studentStatusValidate(input, "Mời nhập trạng thái: (1. đang học, 2. bảo lưu, 3. đã nghỉ học):");
    }

    @Override
    public void displayData(){
        System.out.println("Mã học sinh: " + this.studentID);
        System.out.println("Tên học sinh: " + this.studentName);
        System.out.println("Ngày sinh: " + this.birthday);
        System.out.println("Số điện thoại: " + this.phoneNumber);
        System.out.println("Giới tinh: " + this.gender());
        System.out.println("Email: " + this.email);
        System.out.println("Ngành học:  " + this.major);
        System.out.println("Lớp: " + this.className);
        System.out.println("Điểm tích luỹ trung bình: " + this.gpa);
        System.out.println("Trạng thái: " + this.studentStatus());
    }

    public String studentStatus(){
        return this.status == 2? "bảo lưu" : this.status == 3? "đã nghỉ học" : "đang theo học";
    }

    public String gender(){
        return this.sex? "nam" : "nữ";
    }
}
