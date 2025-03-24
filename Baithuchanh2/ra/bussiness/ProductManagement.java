package bussiness;

import entity.Product;
import entity.ResponeMessage;
import entity.SellQuantity;
import validate.IntegerValidator;
import validate.ProductManagementValidator;
import validate.ProductValidator;

import java.util.*;

public class ProductManagement{
    public static final Product[] products = new Product[100];
    public static int currentIndex = 0;

    private static boolean isProductEmpty(Product[] products){
        return currentIndex == 0;
    }

    public static void addProducts(Scanner input){
        int amount = ProductManagementValidator.validateAmountsProduct(input);
        for(int i = 0; i < amount; i++){
            Product newProduct = new Product();
            newProduct.inputData(input);
            products[currentIndex] = newProduct;
            currentIndex++;
        }
    };

    public static void displayProducts(){
        if(isProductEmpty(products)){
            System.out.println("Product list is empty");
            return;
        }
        for(int i = 0; i < currentIndex; i++){
            products[i].displayData();
            System.out.println();
        }
    }

    public static void callAllProductProfit(){
        if(isProductEmpty(products)){
            System.out.println("Product list is empty");
            return;
        }
        for(int i = 0; i < currentIndex; i++){
            products[i].callProfit();
        }
    }

    public static void sortByProfit(){
        if(isProductEmpty(products)){
            System.out.println("Product list is empty");
            return;
        }
        ProductSorter.quickSort(products, 0, currentIndex);
    }

    public static void statisticProductsByPrice(Scanner input){
        if (isProductEmpty(products)) {
            System.out.println("Product list is empty.");
            return;
        }

        float fromPrice = ProductManagementValidator.validateInputPrice(input, new ResponeMessage("Enter from: ", "Must be greater than 0"), 0);
        float toPrice = ProductManagementValidator.validateInputPrice(input, new ResponeMessage("Enter to: ", "Must be greater than " + fromPrice), fromPrice);

        Set<Product> productSet = new HashSet<>();
        for (int i = 0; i < currentIndex; i++) {
            productSet.add(products[i]);
        }

        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : productSet) {
            if (product.getExportPrice() >= fromPrice && product.getExportPrice() <= toPrice) {
                filteredProducts.add(product);
            }
        }

        if (filteredProducts.isEmpty()) {
            System.out.println("No products found in the given price range.");
        } else {
            System.out.println("\nProducts in price range [" + fromPrice + " - " + toPrice + "]:");
            for (Product product : filteredProducts) {
                System.out.println("  - Product ID: " + product.getProductId() + " | Name: " + product.getProductName() + " | Price: " + product.getExportPrice());
            }
        }
    }

    public static void searchProductByProductName(Scanner input){
        if(isProductEmpty(products)){
            System.out.println("Product list is empty");
            return;
        }
        for(int i = 0; i < currentIndex; i++){
            System.out.println("Product ID: " + products[i].getProductId() + " | Name: " + products[i].getProductName());
        }
        System.out.print("Enter Book Name: ");
        String bookName = input.nextLine();
        for(int i = 0; i < currentIndex; i++){
            if(bookName.equals(products[i].getProductName())){
                products[i].displayData();
            }
        }
    }

    public static void importProducts(Scanner input){
        System.out.print("Enter Product ID: ");
        String productId = input.nextLine();
        int found = -1;
        for(int i = 0; i < currentIndex; i++){
            if(productId.equals(products[i].getProductId())){
                found = i;
            }
        }
        if(found == -1){
            System.out.println("Product ID not found.");
            return;
        }
        int amounts = IntegerValidator.validateInt(input, new ResponeMessage("Enter amount to import: ", "Must be greater than 0"), 0);
        products[found].setQuantity(products[found].getQuantity() + amounts);
        System.out.println("Imported " + products[found].getProductId() + " product to " + products[found].getProductName());
    }

    public static void sellProductByProductName(Scanner input){
        if(isProductEmpty(products)){
            System.out.println("Product list is empty");
            return;
        }
        for(int i = 0; i < currentIndex; i++){
            System.out.println("Product ID: " + products[i].getProductId() + " | Name: " + products[i].getProductName());
        }
        String productName = input.nextLine();
        int found = -1;
        for(int i = 0; i < currentIndex; i++){
            if(productName.equals(products[i].getProductName())){
                found = i;
            }
        }
        if(found == -1){
            System.out.println("Product name not found.");
        }
        int quantity = ProductManagementValidator.validateQuantity(input, "Enter amount to sell: ", new SellQuantity(0, products[found].getQuantity()));
        products[found].setQuantity(products[found].getQuantity() - quantity);
        if(products[found].getQuantity() == 0){
            products[found].setStatus(false);
        }
    }

    public static void updateProductStatus(Scanner input){
        if(isProductEmpty(products)){
            System.out.println("Product list is empty");
            return;
        }

        for(int i = 0; i < currentIndex; i++){
            System.out.println("Product ID: " + products[i].getProductId() + " | Name: " + products[i].getProductName());
        }
        String productId = input.nextLine();
        int found = -1;
        for(int i = 0; i < currentIndex; i++){
            if(productId.equals(products[i].getProductId())){
                found = i;
            }
        }

        if(found == -1){
            System.out.println("Product ID not found.");
        }
        products[found].setStatus(!products[found].getStatus());
    }
}
