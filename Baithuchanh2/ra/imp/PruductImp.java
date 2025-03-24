package imp;

import bussiness.ProductManagement;

import java.util.Scanner;

public class PruductImp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            displayMenu();
            int choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1 -> ProductManagement.addProducts(input);
                case 2 -> ProductManagement.displayProducts();
                case 3 -> ProductManagement.callAllProductProfit();
                case 4 -> ProductManagement.sortByProfit();
                case 5 -> ProductManagement.statisticProductsByPrice(input);
                case 6 -> ProductManagement.searchProductByProductName(input);
                case 7 -> ProductManagement.importProducts(input);
                case 8 -> ProductManagement.sellProductByProductName(input);
                case 9 -> ProductManagement.updateProductStatus(input);
                default -> System.out.println("Please enter choice from 0 to 9");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("*********************** MENU **************************");
        System.out.println("1. Enter information for N products (N entered from keyboard)");
        System.out.println("2. Display product information");
        System.out.println("3. Calculate product profit");
        System.out.println("4. Sort products by profit (descending)");
        System.out.println("5. Statistics of products by price");
        System.out.println("6. Search products by name");
        System.out.println("7. Import product");
        System.out.println("8. Sell product");
        System.out.println("9. Update product status");
        System.out.println("0. Exit");
        System.out.println("*******************************************************");
        System.out.print("Please choose an option: ");
    }

}
