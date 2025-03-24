package entity;

import bussiness.BookManagement;
import validate.FloatValidator;
import validate.StringValidator;
import validate.StudentValidator;

import java.util.Scanner;

public class Book implements IBook{
    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private float interest;
    private int year;

    public Book(){
    }

    public Book(String bookId, String bookName, float importPrice, float exportPrice, String author, float interest, int year){
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.interest = interest;
        this.year = year;
    }

    public String getBookId(){
        return bookId;
    }

    public void setBookId(String bookId){
        this.bookId = bookId;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
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

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public float getInterest(){
        return interest;
    }

    public void setInterest(){
        this.interest = this.exportPrice - this.importPrice;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }


    @Override
    public void displayData(){
        System.out.printf("Book ID: %s\n", bookId);
        System.out.printf("Book Name: %s\n", bookName);
        System.out.printf("Import Price: %.2f\n", importPrice);
        System.out.printf("Export Price: %.2f\n", exportPrice);
        System.out.printf("Author: %s\n", author);
        System.out.printf("Interest: %.2f\n", interest);
        System.out.printf("Year: %d\n", year);
        System.out.println();
    }

    @Override
    public void inputData(Scanner input){
        System.out.println();
        this.bookId = inputBookId(input);
        this.bookName = inputBookName(input);
        this.importPrice = inputImportPrice(input);
        this.exportPrice = inputExportPrice(input);
        this.author = inputAuthor(input);
        this.year = inputYear(input);
    }

    public int inputYear(Scanner input){
        return StudentValidator.yearValidator(input, new ResponseMessage("Enter the name of the year of publication of the book: ", "The year of publication of the book must be after 2000"), "^\\d{4}$");
    }

    public String inputAuthor(Scanner input){
        return StringValidator.stringValidator(input, new ResponseMessage("Enter the author name: ", "The author's name must be between 6 and 50 characters long"), "^[\\S\\s]{6,50}$");
    }

    public String inputBookId(Scanner input){
        return StudentValidator.bookIdValidator(input, new ResponseMessage("Enter the book ID: ", "Book must start with B and 4 digits"));
    }

    public String inputBookName(Scanner input){
        return StudentValidator.bookNameValidator(input, new ResponseMessage("Enter the book name: ", "The title of the book must be 6 to 50 characters long"));
    }

    public float inputImportPrice(Scanner input){
        return FloatValidator.floatValidator(input, new ResponseMessage("Enter book import price: ", "Price can't smaller than 0"), 0);
    }

    public float inputExportPrice(Scanner input){
        return FloatValidator.floatValidator(input, new ResponseMessage("Enter book export price: ", "Price can't be smaller than 30% of import price"), this.importPrice * ((float)3 / 10));
    }
}
