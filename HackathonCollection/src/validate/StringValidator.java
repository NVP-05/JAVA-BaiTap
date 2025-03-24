package validate;

import entity.ResponeMessage;
import entity.StringLength;

import java.util.Scanner;

public class StringValidator{
    public static String validateString(Scanner sc, String message, StringLength stringLength){
        while(true){
            System.out.print(message);
            String string = sc.nextLine();
            if(string.length() < stringLength.getMinLength()){
                System.err.println("The string length is smaller than " + stringLength.getMinLength() + " characters.");
                System.out.println();
                continue;
            }
            if(string.length() > stringLength.getMaxLength()){
                System.err.println("The string length is larger than " + stringLength.getMaxLength() + " characters.");
                System.out.println();
                continue;
            }
            return string;
        }
    }
}
