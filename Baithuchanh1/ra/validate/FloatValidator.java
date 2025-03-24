package validate;

import entity.ResponseMessage;

import java.util.Scanner;

public class FloatValidator{
    public static float floatValidator(Scanner input, ResponseMessage responseMessage, float min){
        while(true){
            System.out.print(responseMessage.getMessage());
            String floatString = input.nextLine();
            if(!floatString.matches("^(0|[1-9]\\d*)(\\.\\d+)?$")){
                System.err.println("Must be number or float value");
                System.out.println();
                continue;
            }
            if(Float.parseFloat(floatString) < min){
                System.err.println(responseMessage.getError());
                System.out.println();
                continue;
            }
            return Float.parseFloat(floatString);
        }
    }
}
