package bussiness;

import entity.Customer;
import entity.LimitSort;
import entity.ResponeMessage;
import validate.CustomerManagementValidator;
import validate.CustomerValidator;

import java.util.*;

public class CustomerManagement{
    public static List<Customer> customers = new ArrayList<Customer>();
    public final static int MAX_SIZE = 100;

    public static void addCustomer(Scanner sc){
        int amountCustomer = CustomerManagementValidator.validateAmountCustomers(sc, new ResponeMessage("Enter amount customers", "Please enter valid amount customers"), customers);
        for(int i = 0; i < amountCustomer; i++){
            Customer newCustomer = new Customer();
            newCustomer.inputData(sc);
            customers.add(newCustomer);
        }
        System.out.println("Add customer successfully");
    }

    public static void updateCustomer(Scanner sc){
        if(customers.isEmpty()){
            System.err.println("No customers found");
            System.out.println();
            return;
        }
        for(Customer customer : customers){
            System.out.println("Customer ID: " + customer.getCustomerID() + " | Name: " + customer.getFirstName() + " " + customer.getLastName());
        }
        System.out.print("Enter customer ID: ");
        String customerID = sc.nextLine();
        int found = -1;
        for(int i = 0; i < customers.size(); i++){
           if(customers.get(i).getCustomerID().equals(customerID)){
               found = i;
           }
        }
        if(found == -1){
            System.err.println("No customer found");
            return;
        }
        customers.get(found).updateData(sc);
        System.out.println("Customer successfully updated");
    }

    public static void deleteCustomer(Scanner sc){
        if(customers.isEmpty()){
            System.err.println("No customers found");
            System.out.println();
            return;
        }
        System.out.print("Enter customer ID: ");
        String customerID = sc.nextLine();
        int found = -1;
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getCustomerID().equals(customerID)){
                found = i;
            }
        }
        if(found == -1){
            System.err.println("No customer found");
            return;
        }
        customers.remove(found);
        CustomerValidator.existedCustomerID.remove(customerID);
        CustomerValidator.existedEmail.remove(customers.get(found).getEmail());
        CustomerValidator.existedPhoneNumber.remove(customers.get(found).getPhoneNumber());
        System.out.println("Customer successfully deleted");
    }

    public static void dislayCustomer(){
        if(customers.isEmpty()){
            System.err.println("No customers found");
            System.out.println();
            return;
        }
        for(Customer c : customers){
            c.displayData();
        }
    }

    public static void searchCustomer(Scanner sc){
        if(customers.isEmpty()){
            System.err.println("No customers found");
            System.out.println();
            return;
        }
        System.out.println("--------------------- Menu ----------------------");
        System.out.println("1. Search by name");
        System.out.println("2. Search by customer type");
        System.out.println("3. Search by phone number");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        while(true){
            switch(choice){
                case 0 -> System.exit(0);
                case 1 -> searchByName(sc);
                case 2 -> searchByType(sc);
                case 3 -> searchByPhoneNumber(sc);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    public static void searchByPhoneNumber(Scanner sc){
        for(Customer c : customers){
            System.out.println("Customer ID: " + c.getCustomerID() + " | Name: " + c.getFirstName() + " " + c.getLastName() + " | Phone Number: " + c.getPhoneNumber());
        }
        String searchPhoneNumber = sc.nextLine();
        int found = -1;
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getPhoneNumber().equals(searchPhoneNumber)){
                found = i;
            }
        }
        if(found == -1){
            System.err.println("No customer found");
            System.out.println();
            return;
        }
        System.out.println("Search customer successfully");
        customers.get(found).displayData();
    }

    public static void searchByName(Scanner sc){
        for(Customer c : customers){
            System.out.println("Customer ID: " + c.getCustomerID() + " | Name: " + c.getFirstName() + " " + c.getLastName());
        }
        String searchName = sc.nextLine();
        int found = -1;
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getCustomerID().equals(searchName)){
                found = i;
            }
        }
        if(found == -1){
            System.err.println("No customer found");
            return;
        }
        System.out.println("Customer successfully searched: ");
        customers.get(found).displayData();
    }

    public static void searchByType(Scanner sc){
        Set<String> customerTypes =  new HashSet<String>();
        for(Customer c : customers){
            customerTypes.add(c.getCustomerType());
        }
        for(String ct : customerTypes){
            System.out.println(ct);
        }
        String searchType = sc.nextLine();
        List<Customer> customerFound = new ArrayList<Customer>();
        for(Customer customer : customers){
            if(customer.getCustomerType().equals(searchType)){
                customerFound.add(customer);
            }
        }
        if(customerFound.isEmpty()){
            System.err.println("No customer found");
            return;
        }
        System.out.println("Customer successfully searched: ");
        for(Customer c : customerFound){
            c.displayData();
        }
    }

    public static void sortCustomer(Scanner sc){
        if(customers.isEmpty()){
            System.err.println("Customer list is empty");
            System.out.println();
            return;
        }
        while(true){
            System.out.println("-------------------- Sort Customer List ----------------------");
            System.out.println("1. Sort by Name");
            System.out.println("2. Sort by Year");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1 -> {
                    CustomerSorter.quickSort(customers, new LimitSort(0, customers.size() - 1), "name");
                    for(Customer c : customers){
                        c.displayData();
                    }
                }
                case 2 -> {
                    CustomerSorter.quickSort(customers, new LimitSort(0, customers.size() - 1), "year");
                    for(Customer c : customers){
                        c.displayData();
                    }
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
