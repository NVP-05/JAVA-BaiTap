package validate;

import entity.ResponeMessage;

import java.util.Scanner;

public class FloatValidator{
    public static float validateFloat(Scanner input, ResponeMessage responeMessage, float min){
        while (true) {
            System.out.print(responeMessage.getMessage());
            String inputFloat = input.nextLine().trim();
            if (!inputFloat.matches("-?(\\d+|\\d+\\.\\d+)")) {
                System.err.println("Please enter a valid number (integer or float).");
                continue;
            }
            float value = Float.parseFloat(inputFloat);
            if (value < min) {
                System.err.println(responeMessage.getError());
                continue;
            }
            return value;
        }
    }
}
