package validate;

import entity.ResponeMessage;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CustomerValidator{
    public final static Set<String> existedCustomerID = new HashSet<String>();
    public final static Set<String> existedPhoneNumber = new HashSet<String>();
    public final static Set<String> existedEmail = new HashSet<String>();

    public static String validateCustomerID(Scanner sc, ResponeMessage responeMessage, String regex){
        while(true){
            System.out.print(responeMessage.getMessage());
            String customerID = sc.nextLine();
            if(customerID.isEmpty()){
                System.err.println("Customer ID can't be empty");
                System.out.println();
                continue;
            }
            if(!existedCustomerID.contains(customerID)){
                System.err.println("Customer ID already exists");
                System.out.println();
                continue;
            }
            if(customerID.matches(regex)){
                existedCustomerID.add(customerID);
                return customerID;
            }
            System.err.println(responeMessage.getError());
            System.out.println();
        }
    }

    public static String validatePhoneNumber(Scanner sc, ResponeMessage responeMessage, String regex){
        while(true){
            System.out.print(responeMessage.getMessage());
            String phoneNumber = sc.nextLine();
            if(phoneNumber.isEmpty()){
                System.err.println("Email can't be empty");
                System.out.println();
                continue;
            }
            if(existedPhoneNumber.contains(phoneNumber)){
                System.err.println("Phone number already exists");
                System.out.println();
                continue;
            }
            if(phoneNumber.matches(regex)){
                existedPhoneNumber.add(phoneNumber);
                return phoneNumber;
            }
            System.err.println(responeMessage.getError());
            System.out.println();
        }
    }

    public static String validateEmail(Scanner sc, ResponeMessage responeMessage, String regex){
        while(true){
            System.out.print(responeMessage.getMessage());
            String email = sc.nextLine();
            if(email.isEmpty()){
                System.err.println("Email can't be empty");
                System.out.println();
                continue;
            }
            if(existedEmail.contains(email)){
                System.err.println("Email already exists");
                System.out.println();
                continue;
            }
            if(email.matches(regex)){
                existedEmail.add(email);
                return email;
            }
            System.err.println(responeMessage.getError());
            System.out.println();
        }
    }

    public static String validateDateOfBirth(Scanner sc, ResponeMessage responeMessage, String regex){
        while(true){
            System.out.print(responeMessage.getMessage());
            String dateOfBirth = sc.nextLine();
            if(dateOfBirth.isEmpty()){
                System.err.println("Date of birth can't be empty");
                System.out.println();
                continue;
            }
            if(dateOfBirth.matches(regex)){
                return dateOfBirth;
            }
            System.err.println(responeMessage.getError());
            System.out.println();
        }
    }
}
