package validate;

import bussiness.ProductManagement;
import entity.ResponeMessage;
import entity.SellQuantity;

import java.util.Scanner;

public class ProductManagementValidator{
    public static int validateAmountsProduct(Scanner input){
        while(true){
            System.out.print("Enter amounts product: ");
            String inputAmounts = input.nextLine();
            if (inputAmounts.isEmpty() || !inputAmounts.matches("-?(\\d+)")) {
                System.err.println("Invalid Number. Please enter a valid integer.");
                System.out.println();
                continue;
            }
            int amounts = Integer.parseInt(inputAmounts);
            if(ProductManagement.currentIndex + amounts >= ProductManagement.products.length){
                System.err.println("Product list is full");
                System.out.println();
                continue;
            }
            return amounts;
        }
    }

    public static float validateInputPrice(Scanner input, ResponeMessage message, float minPrice){
        while(true){
            System.out.print(message.getMessage());
            String inputFrom = input.nextLine();
            if (inputFrom.isEmpty() || !inputFrom.matches("-?(\\d+|\\d+\\.\\d+)")) {
                System.err.println("Invalid float number. Please enter a valid float number.");
                System.out.println();
                continue;
            }
            float inputFromFloat = Float.parseFloat(inputFrom);
            if(inputFromFloat <= minPrice){
                System.err.println(message.getError());
                System.out.println();
                continue;
            }
            return inputFromFloat;
        }
    }

    public static int validateQuantity(Scanner input, String message, SellQuantity sellQuantity){
        while(true){
            System.out.println(message);
            String quantityString = input.nextLine();
            if (quantityString.isEmpty() || !quantityString.matches("-?(\\d+)")) {
                System.err.println("Invalid Number. Please enter a valid integer.");
                continue;
            }
            int quantity = Integer.parseInt(quantityString);
            if(quantity < sellQuantity.getMinQuantity()){
                System.err.println("Must be greater than " + sellQuantity.getMinQuantity());
            }
            if(quantity > sellQuantity.getMaxQuantity()){
                System.err.println("Must be less than " + sellQuantity.getMaxQuantity());
            }
            return quantity;
        }
    }
}
