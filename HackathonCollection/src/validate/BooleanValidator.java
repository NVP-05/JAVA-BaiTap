package validate;

import entity.ResponeMessage;

import java.util.Scanner;

public class BooleanValidator{
    public static boolean validateBoolean(Scanner sc, ResponeMessage responeMessage){
        while(true){
            System.out.print(responeMessage.getMessage());
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.err.println("Can't be empty");
                continue;
            }
            if(!input.equalsIgnoreCase("true") && !input.equalsIgnoreCase("false")){
                System.err.println(responeMessage.getError());
                continue;
            }
            return Boolean.parseBoolean(input);
        }
    }
}
