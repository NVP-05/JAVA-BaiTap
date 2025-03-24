package validate;

import entity.StringLength;

import java.util.Scanner;

public class StringValidator{
    public static String validateString(Scanner input, String message, StringLength stringLength){
        String newInput;
        do {
            System.out.print(message);
            newInput = input.nextLine().trim();
            if (newInput.isEmpty()) {
                System.out.println("Please enter a valid string");
            } else if (newInput.length() > stringLength.getMaxLength()) {
                System.out.println("Input string exceeds max length");
            } else {
                return newInput;
            }
        } while(true);
    }
}
