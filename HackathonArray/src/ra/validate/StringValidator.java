package ra.validate;

import java.util.Scanner;

public class StringValidator{
    public static String stringValidator( Scanner input, String message){
        while(true){
            System.out.print(message);
            String string = input.nextLine();
            if(!string.isEmpty()){
                return string;
            }
            System.err.println("Không được để trống.");
        }
    }
}
