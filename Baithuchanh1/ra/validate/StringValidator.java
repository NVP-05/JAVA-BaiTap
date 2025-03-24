package validate;

import entity.ResponseMessage;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringValidator{
    public static String stringValidator(Scanner input, ResponseMessage responseMessage, String regex){
        while(true){
            System.out.print(responseMessage.getMessage());
            String string = input.nextLine();
            if(Pattern.matches(regex, string)){
                return string;
            }
            System.err.println(responseMessage.getError());
            System.out.println();
        }
    }
}
