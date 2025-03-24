package validate;

import entity.ResponeMessage;

import java.util.Scanner;

public class IntegerValidator{
    public static int validateInt(Scanner input, ResponeMessage responeMessage, int min){
        while(true){
            System.out.println(responeMessage.getMessage());
            String inputInteger = input.nextLine();
            if (inputInteger.isEmpty() || !inputInteger.matches("-?(\\d+)")) {
                System.err.println("Invalid Number. Please enter a valid integer.");
                continue;
            }
            int integer = Integer.parseInt(inputInteger);
            if(integer < min){
                System.err.println(responeMessage.getMessage());
            }
            return integer;
        }
    }
}
