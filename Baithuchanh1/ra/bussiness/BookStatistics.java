package bussiness;

import entity.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookStatistics{
    public static Map<Integer, Integer> getBookCountByYear(List<Book> books) {
        Map<Integer, Integer> bookCountByYear = new HashMap<>();
        for (Book book : books) {
            int year = book.getYear();
            bookCountByYear.put(year, bookCountByYear.getOrDefault(year, 0) + 1);
        }
        return bookCountByYear;
    }

    public static Map<String, Integer> getBookCountByAuthor(List<Book> books) {
        Map<String, Integer> bookCountByAuthor = new HashMap<>();
        for (Book book : books) {
            String author = book.getAuthor();
            bookCountByAuthor.put(author, bookCountByAuthor.getOrDefault(author, 0) + 1);
        }
        return bookCountByAuthor;
    }

    public static void countBooksByAuthor(List<Book> books) {
        Map<String, Integer> bookCountByAuthor = getBookCountByAuthor(books);

        for (Map.Entry<String, Integer> entry : bookCountByAuthor.entrySet()) {
            System.out.println(entry.getKey() + " has written " + entry.getValue() + " books.");
        }
    }

    public static void countBooksByYear(List<Book> books) {
        Map<Integer, Integer> bookCountByYear = getBookCountByYear(books);
        for (Map.Entry<Integer, Integer> entry : bookCountByYear.entrySet()) {
            System.out.println("In " + entry.getKey() + ", " + entry.getValue() + " books were published.");
        }
    }

}
