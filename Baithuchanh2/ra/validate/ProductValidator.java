package validate;

import entity.ResponeMessage;
import entity.StringLength;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductValidator{
    private static final Set<String> existingProductIDs = new HashSet<>();
    private static final Set<String> existingProductNames = new HashSet<>();

    public static String validateProductID(Scanner input, String message){
        while(true){
            System.out.print(message);
            String productID = input.nextLine();
            if (!productID.matches("[a-zA-Z0-9]{4}")) {
                System.err.println("Product ID must be 4 digits");
                continue;
            }
            if (existingProductIDs.contains(productID)) {
                System.err.println("Product ID already exists. Please enter a unique ID.");
                continue;
            }
            existingProductIDs.add(productID);
            return productID;
        }
    }

    public static String validateProductName(Scanner input, String message, StringLength stringLength){
        while(true){
            System.out.println(message);
            String productName = input.nextLine();
            if(productName.length() < stringLength.getMinLength() || productName.length() > stringLength.getMaxLength()){
                System.out.println("Product name must be between " + stringLength.getMinLength() + " and " + stringLength.getMaxLength() + " characters.");
                continue;
            }
            if(existingProductNames.contains(productName)){
                System.err.println("Product name already exists. Please enter a unique ID.");
                continue;
            }
            existingProductNames.add(productName);
            return productName;
        }
    }
}
