package entity;

import validate.BooleanValidator;
import validate.CustomerValidator;
import validate.StringValidator;

import java.util.Scanner;

public class Customer implements IApp{
    private String customerID;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private boolean gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String customerType;

    public Customer(){
    }

    public Customer(String customerID, String firstName, String lastName, String dateOfBirth, boolean gender, String address, String phoneNumber, String email, String customerType){
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
    }

    public String getCustomerID(){
        return customerID;
    }

    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender(){
        return gender;
    }

    public void setGender(boolean gender){
        this.gender = gender;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getCustomerType(){
        return customerType;
    }

    public void setCustomerType(String customerType){
        this.customerType = customerType;
    }

    @Override
    public void inputData(Scanner sc){
        this.customerID = inputCustomerID(sc);
        this.firstName = inputFirstName(sc);
        this.lastName = inputLastName(sc);
        this.dateOfBirth = inputDateOfBirth(sc);
        this.gender = inputGender(sc);
        this.address = inputAddress(sc);
        this.phoneNumber = inputPhoneNumber(sc);
        this.email = inputEmail(sc);
        this.customerType = inputCustomerType(sc);
    }

    public void updateData(Scanner sc){
        this.firstName = inputFirstName(sc);
        this.lastName = inputLastName(sc);
        this.dateOfBirth = inputDateOfBirth(sc);
        this.gender = inputGender(sc);
        this.address = inputAddress(sc);
        this.phoneNumber = inputPhoneNumber(sc);
        this.email = inputEmail(sc);
        this.customerType = inputCustomerType(sc);
    }

    public String inputCustomerType(Scanner sc){
        return StringValidator.validateString(sc, "Enter type of customer: ", new StringLength(0, 255));
    }

    public String inputEmail(Scanner sc){
        return CustomerValidator.validateEmail(sc, new ResponeMessage("Enter email: ","Email must be in a valid format (e.g., example@domain.com)"), "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\n");
    }

    public String inputPhoneNumber(Scanner sc){
        return CustomerValidator.validatePhoneNumber(sc, new ResponeMessage("Enter phone number", "Phone number must start with +84 or 0"), "^(0|\\+84)(3[2-9]|5[2689]|7[06-9]|8[1-9]|9[0-9])\\d{7}$\n");
    }

    public String inputAddress(Scanner sc){
        return StringValidator.validateString(sc, "Enter customer address", new StringLength(0, 255));
    }

    public String inputCustomerID(Scanner sc){
        return CustomerValidator.validateCustomerID(sc, new ResponeMessage("Enter customer ID: ", "Must start with C and 4 numbers"), "^C\\d{4}$");
    }

    public String inputFirstName(Scanner sc){
        return StringValidator.validateString(sc, "Enter customer first name: ", new StringLength(0,50));
    }

    public String inputLastName(Scanner sc){
        return StringValidator.validateString(sc, "Enter customer last name: ", new StringLength(0,30));
    }

    public String inputDateOfBirth(Scanner sc){
        return CustomerValidator.validateDateOfBirth(sc, new ResponeMessage("Enter the date of birth: ", "Must be date - month - year"), "^(0[1-9]|[12][0-9]|3[01])/(0[13578]|1[02])/(19|20)\\d{2}$|^(0[1-9]|[12][0-9]|30)/(0[469]|11)/(19|20)\\d{2}$|^(0[1-9]|1[0-9]|2[0-8])/02/(19|20)\\d{2}$|^29/02/((19|20)(04|08|[2468][048]|[13579][26]))$\n");
    }

    public boolean inputGender(Scanner sc){
        return BooleanValidator.validateBoolean(sc, new ResponeMessage("Enter gender: ", "Must be true or false"));
    }

    @Override
    public void displayData(){
        System.out.println("CustomerID: " + customerID);
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);
        System.out.println("DateOfBirth: " + dateOfBirth);
        System.out.println("Gender: " + (this.gender? "male" : "female"));
        System.out.println("Address: " + address);
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("CustomerType: " + customerType);
        System.out.println();
    }
}
