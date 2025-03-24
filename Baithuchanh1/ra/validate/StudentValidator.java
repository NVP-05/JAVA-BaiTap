package validate;

import entity.ResponseMessage;
import bussiness.BookManagement;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class StudentValidator {
    public final static Set<String> existedBookIds  = new HashSet<String>();
    public final static Set<String> existedBookNames = new HashSet<String>();
    public static final int MIN_YEAR = 2000;

    public static String bookNameValidator(Scanner input, ResponseMessage message) {
        while (true) {
            System.out.print(message.getMessage());
            String bookName = input.nextLine().trim();

            if (existedBookNames.contains(bookName)) {
                System.err.println(message.getError());
                continue;
            }

            existedBookNames.add(bookName);
            return bookName;
        }
    }

    public static String bookIdValidator(Scanner input, ResponseMessage message) {
        while (true) {
            System.out.print(message.getMessage());
            String bookId = input.nextLine().trim();

            if (existedBookIds.contains(bookId)) {
                System.err.println("Book ID already exists. Please enter a unique ID.");
                continue;
            }

            if (!bookId.matches("^B\\d{4}$")) {
                System.err.println(message.getError());
                continue;
            }

            existedBookIds.add(bookId);
            return bookId;
        }
    }

    public static int yearValidator(Scanner input, ResponseMessage responseMessage, String regex){
        while(true){
            System.out.print(responseMessage.getMessage());
            String integerString = input.nextLine();
            if(!Pattern.matches(regex, integerString)){
                System.out.println("Must be number and after 2000");
                continue;
            }
            if(Integer.parseInt(integerString) < MIN_YEAR){
                System.out.println();
                System.err.println(responseMessage.getError());
                continue;
            }
            return Integer.parseInt(integerString);
        }
    }
}
