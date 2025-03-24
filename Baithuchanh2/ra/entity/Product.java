package entity;

import validate.*;

import java.util.Scanner;

public class Product implements IProduct{
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String description;
    private Boolean status;

    public Product(){
    }

    public Product(String productId, String productName, float importPrice, float exportPrice, float profit, int quantity, String description, Boolean status){
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = profit;
        this.quantity = quantity;
        this.description = description;
        this.status = status;
    }

    public String getProductId(){
        return productId;
    }

    public void setProductId(String productId){
        this.productId = productId;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public float getImportPrice(){
        return importPrice;
    }

    public void setImportPrice(float importPrice){
        this.importPrice = importPrice;
    }

    public float getExportPrice(){
        return exportPrice;
    }

    public void setExportPrice(float exportPrice){
        this.exportPrice = exportPrice;
    }

    public float getProfit(){
        return profit;
    }

    public void callProfit(){
        this.profit = this.exportPrice - this.importPrice;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Boolean getStatus(){
        return status;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }

    @Override
    public void inputData(Scanner input){
        this.productId = inputProductID(input);
        this.productName = inputProductName(input);
        this.importPrice = inputImportPrice(input);
        this.exportPrice = inputExportPrice(input);
        this.quantity = inputQuantity(input);
        this.description = inputDescription(input);
        this.status = inputStatus(input);
    }

    private String inputDescription(Scanner input){
        return StringValidator.validateString(input, "Enter description: ", new StringLength(0, 255));
    }

    private boolean inputStatus(Scanner input){
        return BooleanValidator.validateBoolean(input, "Enter status: ");
    }

    private int inputQuantity(Scanner input){
        return IntegerValidator.validateInt(input, new ResponeMessage("Enter quantity: ", "quantity must be greater than 0"), 0);
    }

    private float inputExportPrice(Scanner input){
        return FloatValidator.validateFloat(input, new ResponeMessage("Enter export price: ", "Export price must be at least 20% greater than import price: " + this.importPrice), this.importPrice * 2/10);
    }

    private float inputImportPrice(Scanner input){
        return FloatValidator.validateFloat(input, new ResponeMessage("Enter import price: ", "Import price must be greater than 0"), 0);
    }

    private String inputProductID(Scanner input){
        return ProductValidator.validateProductID(input, "Enter product ID: ");
    }

    private String inputProductName(Scanner input){
        return ProductValidator.validateProductName(input, "Enter product name: ", new StringLength(6, 50));
    }

    @Override
    public void displayData(){
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Import Price: " + importPrice);
        System.out.println("Export Price: " + exportPrice);
        System.out.println("Profit: " + profit);
        System.out.println("Quantity: " + quantity);
        System.out.println("Description: " + description);
        System.out.println("Status: " + (this.status? "For sale" : "Not for sale"));
    }
}
