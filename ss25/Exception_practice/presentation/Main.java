package ss25.Exception_practice.presentation;

import java.util.Scanner;
import java.util.regex.Pattern;

import ss25.Exception_practice.util.Validator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int checkInt = Validator.validateInt("nhap so nguyen", sc);
        String checkString = Validator.validateString("nhap chuoi", sc, 3, 7);
        float checkFloat = Validator.validateFloat("nhap float", sc);
        double checkDouble = Validator.validateDouble("nhap double", sc);
        boolean checkBoolean = Validator.validateBoolean("nhap boolean", sc);
        String checkEmail = Validator.validateEmail("nhap email", sc);
        String checkPhoneNumber = Validator.validatePhoneNumber("nhap sdt", sc);
        System.out.println(checkInt);
        System.out.println(checkString);
        System.out.println(checkFloat);
        System.out.println(checkDouble);
        System.out.println(checkBoolean);
        System.out.println(checkEmail);
        System.out.println(checkPhoneNumber);
    }
}
