package validate;

import entity.ResponeMessage;

import java.util.Scanner;

public class BooleanValidator{
    public static boolean validateBoolean(Scanner input, String message){
        while(true){
            System.out.print(message);
            String inputBoolean = input.nextLine();
            if (inputBoolean.isEmpty() || !inputBoolean.toLowerCase().matches("(true|false)")) {
                System.out.println("Invalid Boolean. Please enter a valid boolean.");
                continue;
            }
            return Boolean.parseBoolean(inputBoolean);
        }
    }
}
