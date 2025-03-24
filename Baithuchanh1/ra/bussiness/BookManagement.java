package bussiness;

import entity.Book;

import java.util.*;

public class BookManagement{
    public static List<Book> books = new ArrayList<Book>();

    public List<Book> getBooks(){
        return books;
    }

    public void addBook(Scanner input){
        Book newBook = new Book();
        newBook.inputData(input);
        books.add(newBook);
    }

    public void calculateInterest(){
        for(Book book : books){
            book.setInterest();
        }
    }

    public void displayBooks(){
        for(Book book : books){
            book.displayData();
        }
    }

    public void sortIncreaseSellBook(){
        BookSorter.quickSortByExportPrice(books, 0, books.size());
    }

    public void sortDecreaseInterestRate(){
        BookSorter.quickSortByInterestDesc(books, 0, books.size());
    }

    public void searchBookByTitle(Scanner input){
        System.out.print("Enter title: ");
        String bookTitle = input.nextLine();
        int foundIndex = -1;
        for(int i = 0; i < books.size(); i++){
            if(bookTitle.equals(books.get(i).getBookName())){
                foundIndex = i;
            }
        }
        if(foundIndex != -1){
            System.out.println(bookTitle + "found at " + foundIndex);
            return;
        }
        System.out.println("Not found");
    }

    public void countBooksByYear(){
        BookStatistics.countBooksByYear(books);
    }

    public void countBooksByAuthor(){
        BookStatistics.countBooksByAuthor(books);
    }

}
