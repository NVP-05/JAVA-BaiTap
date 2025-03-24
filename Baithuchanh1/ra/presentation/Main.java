package presentation;

import bussiness.BookManagement;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BookManagement bookManagement = new BookManagement();
        while(true){
            menu();
            System.out.print("Enter your choice: ");
            int option = Integer.parseInt(input.nextLine());
            switch(option){
                case 1:
                    bookManagement.addBook(input);
                    break;
                case 2:
                    bookManagement.calculateInterest();
                    break;
                case 3:
                    bookManagement.displayBooks();
                    break;
                case 4:
                    bookManagement.sortIncreaseSellBook();
                    break;
                case 5:
                    bookManagement.sortDecreaseInterestRate();
                    break;
                case 6:
                    bookManagement.searchBookByTitle(input);
                    break;
                case 7:
                    bookManagement.countBooksByYear();
                    break;
                case 8:
                    bookManagement.countBooksByAuthor();
                    break;
                case 9:
                    System.out.println("Hẹn gặp lại.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. please choose between 1-9.");
            }
        }
    }

    public static void menu(){
        System.out.println("Menu");
        System.out.println("1. Add books");
        System.out.println("2. Calculate interest rate");
        System.out.println("3. Display books");
        System.out.println("4. Sort books by increasing selling price");
        System.out.println("5. Sort books by decreasing interest rate");
        System.out.println("6. Search book by title");
        System.out.println("7. Statistics on the number of books by year of publication");
        System.out.println("8. Statistics on the number of books by author");
        System.out.println("9. Exit");
    }
}
