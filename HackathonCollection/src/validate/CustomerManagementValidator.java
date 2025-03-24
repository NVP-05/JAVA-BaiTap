package validate;

import bussiness.CustomerManagement;
import entity.Customer;
import entity.ResponeMessage;

import java.util.List;
import java.util.Scanner;

public class CustomerManagementValidator{
    public static int validateAmountCustomers(Scanner sc, ResponeMessage message, List<Customer> customers) {
        while(true){
            System.out.print(message.getMessage());
            String inputAmount = sc.nextLine();
            if(inputAmount.isEmpty()){
                System.err.println("Please enter amounts customers");
                System.out.println();
                continue;
            }
            if(!inputAmount.matches("^[0-9]*$")){
                System.err.println(message.getError());
                System.out.println();
                continue;
            }
            int amounts = Integer.parseInt(inputAmount);
            if(amounts + customers.size() > CustomerManagement.MAX_SIZE){
                System.out.println("Customer list limit exceeded");
                System.out.println();
                continue;
            }
            return amounts;
        }
    }
}
