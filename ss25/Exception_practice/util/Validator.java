package ss25.Exception_practice.util;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    public static int validateInt(String message, Scanner sc) {
        do {
            System.out.println(message);
            try {
                return Integer.parseInt(sc.nextLine());

            } catch (Exception e) {
                System.out.println("vui long nhap so nguyen");
            }
        } while (true);

    }

    public static float validateFloat(String message, Scanner sc) {
        System.out.println(message);
        do {
            if (sc.hasNextFloat()) {
                return Float.parseFloat(sc.nextLine());
            }
            sc.nextLine();
            System.out.println("vui long nhap so float ");

        } while (true);
    }

    public static float validateDouble(String message, Scanner sc) {
        System.out.println(message);
        do {
            if (sc.hasNextDouble()) {
                return (float) sc.nextDouble();
            }
            sc.nextLine();
            System.out.println("nhap lai ");

        } while (true);
    }

    public static String validateString(String message, Scanner sc, int min, int max) {
        System.out.println(message);
        do {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("nhap lai");
                continue;
            }
            if (input.length() > min && input.length() < max) {
                return input;
            }
            System.out.println("nhap lai");
        } while (true);
    }

    public static boolean validateBoolean(String message, Scanner sc) {
        System.out.println(message);
        do {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                return Boolean.parseBoolean(input);
            }
        } while (true);
    }

    public static String validateEmail(String message, Scanner sc) {
        System.out.println(message);
        do {
            String input = sc.nextLine();
            if (Pattern.matches("[a-zA-Z0-9]+@gmail.com", input)) {
                return input;
            }
            System.out.println("email ko hop le");

        } while (true);
    }

    public static String validatePhoneNumber(String message, Scanner sc) {
        System.out.println(message);
        do {
            String input = sc.nextLine();
            if (Pattern.matches("(03|05|07|09)\\d{8}", input)) {
                return input;
            }
            System.out.println("sdt  ko hop le");

        } while (true);
    }
}
